/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.18).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.model.Status;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-02-17T08:26:21.521Z[GMT]")
@Validated
public interface UserInputsApi {

	@Operation(summary = "Get the inputs from the User for the SKI Requirements", description = "", tags = { "User" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "User has valid inputs", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UserInputsApi.class))) })
	@RequestMapping(value = "/user/", produces = { "application/json" }, method = RequestMethod.GET)
	ResponseEntity<Status> getUserInputs(
			@Pattern(regexp = "^[0-9]*$") @Size(min = 1, max = 250) @Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @RequestParam("length") Integer length,
			@Pattern(regexp = "^[0-9]*$") @Size(min = 0, max = 99) @Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @RequestParam("age") Integer age,
			@NotNull @Parameter(in = ParameterIn.QUERY, description = "", required = true, schema = @Schema(allowableValues = {
					"classic",
					"freestyle" })) @Valid @RequestParam(value = "skiStlye", required = true) String skiStlye);

}
