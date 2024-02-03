package org.dnyanyog.services;

import org.dnyanyog.dto.AddUserRequest;
import org.dnyanyog.dto.AddUserResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AddUserService {

	public AddUserResponse addUser(@RequestBody AddUserRequest addUserRequest) {
		AddUserResponse response = new AddUserResponse();

		response.setStatus("Success");
		response.setMessage("User successfully added");
		response.setUser_id("123");
		response.setUser_name("Jhon Doe");
		response.setUser_email("jhon.doe@example.com");
		response.setUser_age("28");

		return response;
	}
}




