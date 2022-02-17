package io.swagger.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stratsys.constants.CommonConstants;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Status
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-17T08:26:21.521Z[GMT]")

public class Status {
	@JsonProperty("status")
	private HttpStatus status = null;

	@JsonProperty("error")
	private String error = null;

	@JsonProperty("message")
	private String message = null;

	@JsonProperty("timestamp")
	private String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern(CommonConstants.ISO_DATE_FORMAT));

	public Status status(HttpStatus status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 * 
	 * @return status
	 **/
	@Schema(required = true, description = "")
	@NotNull

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public Status error(String error) {
		this.error = error;
		return this;
	}

	/**
	 * Only populated when errors occur. Message woud be short message and error
	 * could be more detailed.
	 * 
	 * @return error
	 **/
	@Schema(description = "Only populated when errors occur. Message woud be short message and error could be more detailed.")

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Status message(String message) {
		this.message = message;
		return this;
	}

	/**
	 * Always populated as part of the response.
	 * 
	 * @return message
	 **/
	@Schema(required = true, description = "Always populated as part of the response.")
	@NotNull

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Status timestamp(String timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	/**
	 * Get timestamp
	 * 
	 * @return timestamp
	 **/
	@Schema(required = true, description = "")
	@NotNull

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Status status = (Status) o;
		return Objects.equals(this.status, status.status) && Objects.equals(this.error, status.error)
				&& Objects.equals(this.message, status.message)
				&& Objects.equals(this.timestamp, status.timestamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash(status, error, message, timestamp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Status {\n");

		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    error: ").append(toIndentedString(error)).append("\n");
		sb.append("    message: ").append(toIndentedString(message)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
