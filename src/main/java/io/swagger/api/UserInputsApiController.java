package io.swagger.api;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stratsys.services.user.UserInputsServiceImpl;

import io.swagger.model.Status;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-17T08:26:21.521Z[GMT]")
@Controller
public class UserInputsApiController implements UserInputsApi {

	private static final Logger log = LoggerFactory.getLogger(UserInputsApiController.class);
	
	@Autowired
	UserInputsServiceImpl userInputsServiceImpl;

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public UserInputsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	public ResponseEntity<Status> getUserInputs(
			@Pattern(regexp = "^[0-9]*$") @Size(min = 1, max = 250) @Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @RequestParam("length") Integer length,
			@Pattern(regexp = "^[0-9]*$") @Size(min = 0, max = 99) @Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @RequestParam("age") Integer age,
			@NotNull @Parameter(in = ParameterIn.QUERY, description = "", required = true, schema = @Schema(allowableValues = {
					"classic",
					"freestyle" })) @Valid @RequestParam(value = "skiStlye", required = true) String skiStlye) {
		Status status = new Status();
		try {
			status = userInputsServiceImpl.validatingUserInputs(length, age, skiStlye);
			return new ResponseEntity<Status>(status, HttpStatus.OK);
		} catch (Exception e) {
			log.error("Couldn't serialize response for content type application/json", e);
			return new ResponseEntity<Status>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
