package org.dnyanyog.controller; //It is a sub package

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // This class will be acting as controller class
public class HelloController {

	/*
	 * @GetMapping(path = "/current-time") // To tell on which event to call this
	 * function, // In path endpoint is given By hitting enter on url in browser,
	 * always GET request is only fired . // public long getCurrentTime() { return
	 * System.currentTimeMillis(); }
	 */

	@GetMapping(path = "/svc-name")
	public String getServiceName() {
		System.out.println("Service name is user management");
		return "user-management";
	}

	@GetMapping(path = "/hello/{name}")
	public String getHello(@PathVariable String name) // PathVariable it is the variable given in the path
	{
		return "Hello " + name + " !";
	}

	@PostMapping(path = "/admin/user")
	public String addData(@RequestBody String addUserData) {
		return "Received : " + addUserData;
	}

	@DeleteMapping(path = "/hello")
	public String getHelloDelete() {
		return "Hello world !";
	}

}
