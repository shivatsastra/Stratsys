package com.stratsys.services.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.stratsys.constants.CommonConstants;

import io.swagger.model.Status;

@Service
public class UserInputsServiceImpl {

	private static Logger logger = LoggerFactory.getLogger(UserInputsServiceImpl.class);
	
	public Status validatingUserInputs(int length, int age, String skiStlye) {
		Status status = new Status();
		try {
			if (age >=0 && age<=4) {
				if (length > 10) {
					status.setMessage(CommonConstants.INCORRECT_LENGTH);
					status.setStatus(HttpStatus.BAD_REQUEST);
				} else {
					status.setMessage("Childrens under 4 cannot opt for the Skies");
					status.setStatus(HttpStatus.OK);
				}
			} else if (age >=5 && age <=8) {
				if (length <10 || length>20) {
					status.setMessage(CommonConstants.INCORRECT_LENGTH);
					status.setStatus(HttpStatus.BAD_REQUEST);
				} else if (skiStlye.equals(CommonConstants.CLASSIC)){
					status.setMessage("Childrens between age 5 and 8, cannot gofor the Classic Ski Style");
					status.setStatus(HttpStatus.BAD_REQUEST);
				} else {
					status.setMessage(CommonConstants.SUCCESS);
					status.setStatus(HttpStatus.OK);
				}
			} else {
				if (length<=20) {
					status.setMessage(CommonConstants.INCORRECT_LENGTH);
					status.setStatus(HttpStatus.BAD_REQUEST);
				} else if (skiStlye.equals(CommonConstants.FREESTYLE)){
					status.setMessage("Childrens ages more than 8, cannot gofor the Freestyle Ski Style");
					status.setStatus(HttpStatus.BAD_REQUEST);
				} else {
					status.setMessage(CommonConstants.SUCCESS);
					status.setStatus(HttpStatus.OK);
				}
			}
		} catch (Exception e) {
			logger.error("Failed to validate the inputs");
			status.setMessage("Failed to validate the inputs");
			status.setError(e.getLocalizedMessage());
			status.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return status;
	}

}
