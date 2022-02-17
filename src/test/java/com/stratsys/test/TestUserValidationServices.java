package com.stratsys.test;


import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpStatus;

import com.stratsys.constants.CommonConstants;
import com.stratsys.services.user.UserInputsServiceImpl;

import io.swagger.model.Status;

@Import(AppTest.class)
@SpringBootTest
public class TestUserValidationServices {

	@Autowired
	private UserInputsServiceImpl userInputsServiceImpl;

	private static Integer age;
	private static Integer length;
	private static String skiStyle;

	@Test
	public void testNewBornChildren() {
		age = 0;
		length = 5;
		skiStyle = CommonConstants.CLASSIC;
		Status status = userInputsServiceImpl.validatingUserInputs(length, age, skiStyle);
		
		if (!status.getStatus().equals(HttpStatus.OK)) {
			fail("Born Children Ski validation Failed");
		}
		length = 12;
		status = userInputsServiceImpl.validatingUserInputs(length, age, skiStyle);
		if (!status.getStatus().equals(HttpStatus.BAD_REQUEST)) {
			fail("Born Children Ski validation Failed");
		}
	}

	@Test
	public void testChildren() {
		age = 5;
		length = 5;
		skiStyle = CommonConstants.CLASSIC;
		Status status = userInputsServiceImpl.validatingUserInputs(length, age, skiStyle);
		if (!status.getMessage().equals(CommonConstants.INCORRECT_LENGTH)) {
			fail("Children Ski validation Failed");
		}
		
		length = 12;
		status = userInputsServiceImpl.validatingUserInputs(length, age, skiStyle);
		if (!status.getStatus().equals(HttpStatus.BAD_REQUEST)) {
			fail("Children Ski validation Failed");
		}
		
		skiStyle = CommonConstants.FREESTYLE;
		status = userInputsServiceImpl.validatingUserInputs(length, age, skiStyle);
		if (!status.getMessage().equals(CommonConstants.SUCCESS)) {
			fail("Children Ski validation Failed");
		}
		
	}

	@Test
	public void testMen() {
		age = 10;
		length = 10;
		skiStyle = CommonConstants.FREESTYLE;
		Status status = userInputsServiceImpl.validatingUserInputs(length, age, skiStyle);
		if (!status.getMessage().equals(CommonConstants.INCORRECT_LENGTH)) {
			fail("Boy/Men Ski validation Failed");
		}
		
		length = 21;
		status = userInputsServiceImpl.validatingUserInputs(length, age, skiStyle);
		if (!status.getStatus().equals(HttpStatus.BAD_REQUEST)) {
			fail("Boy/Men Ski validation Failed");
		}
		
		skiStyle = CommonConstants.CLASSIC;
		status = userInputsServiceImpl.validatingUserInputs(length, age, skiStyle);
		if (!status.getMessage().equals(CommonConstants.SUCCESS)) {
			fail("Boy/Men Ski validation Failed");
		}
	}

}
