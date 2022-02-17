package com.stratsys.common;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.stratsys.constants.CommonConstants;

@Component
public class ServletFilter implements Filter {

	private static final Logger log = LoggerFactory.getLogger(ServletFilter.class);

	@Value("${basic.api.security.validAPIKeys}")
	private String validAPIKeys;

	@Value("${basic.apiKeyName}")
	private String apiKeyName;

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		if (areAPIKeysValidAPI(req)) {
			chain.doFilter(request, response);
		} else {
			returnError(res, "Unathorized");
			log.error("User tried to login using API key " + req.getHeader(apiKeyName));
		}
	}

	/**
	 * Check if the request is part of user service
	 * 
	 * @param req
	 * @return boolean
	 */
	public boolean areAPIKeysValidAPI(HttpServletRequest req) {

		List<String> whiteListApis = Pattern.compile(CommonConstants.STRING_COMMA).splitAsStream(validAPIKeys)
				.collect(Collectors.toList());
		if (req.getHeader(apiKeyName) != null) {
			if (whiteListApis.stream().anyMatch(req.getHeader(apiKeyName)::matches))
				return true;
			else
				return false;
		} else
			return false;
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void returnError(HttpServletResponse response, String message) throws IOException {
		PrintWriter out = response.getWriter();
		response.setHeader("Access-Control-Allow-Credentials", "true");
		response.sendError(HttpServletResponse.SC_NOT_IMPLEMENTED, message);
		out.print("{\"message\":\"" + message + "\"}");
		out.flush();
	}

	public void returnUnsupported(HttpServletResponse response, String message) throws IOException {
		PrintWriter out = response.getWriter();
		response.setHeader("Access-Control-Allow-Credentials", "true");
		response.sendError(HttpServletResponse.SC_FORBIDDEN, message);
		out.print("{\"message\":\"" + message + "\"}");
		out.flush();
	}
}
