package org.dnyanyog.controller;

import org.dnyanyog.dto.LoginRequest;
import org.dnyanyog.dto.LoginResponse;
import org.dnyanyog.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@Autowired
	LoginService loginService;

	/* In controller only endpoint is written and actual code, core code is written
	   in services */

	@PostMapping(path = "/auth/validate", consumes = { "application/json", "application/xml" }, produces = {
			"application/json", "application/xml" })
	public LoginResponse validate(
			@RequestBody LoginRequest loginRequest) /*
													 * Data in request body is compared with LoginRequest class , when
													 * same username, password found as key names, The value of these
													 * keys are taken from Them respectively by function
													 * getUserName(),getPassword().
													 */
	{
		return loginService.validate(loginRequest);
	}
}
