package org.dnyanyog.services;

import org.dnyanyog.dto.LoginRequest;
import org.dnyanyog.dto.LoginResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service // Actual core code, logic of login is written in LoginService
public class LoginService {

	public LoginResponse validate(
			@RequestBody LoginRequest loginRequest) /*
													 * Data in request body is compared with LoginRequest class , when
													 * same username password found as key names, The value of these
													 * keys are taken from Them respectively by function
													 * getUserName(),getPassword().
													 */
	{
		LoginResponse response = new LoginResponse(); /* we have given data type of our response as a LoginResponse and
														 made its object */

		if (loginRequest.getUsername().equalsIgnoreCase("admin")
				&& loginRequest.getPassword().equalsIgnoreCase("admin123")) {
			response.setStatus("Success");
			response.setMessage("Login Successfull !");
		} else {
			response.setStatus("Failed");
			response.setMessage("Login Unsuccessfull ! Please enter correct details ");

		}
		return response;
	}
}
