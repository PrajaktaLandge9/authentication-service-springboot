package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class LoginRequest { // class mapper of JSON request

	private String username; // variable name given exactly same as corresponding node(key) name
	private String password;

	public String getUsername() { /* generated getter setter ( right click - source - generate getters and setters
									 - select all - generate ) */
		return username; /*
							 * For each instance variable, a getter method returns its value while a setter
							 * method sets or updates its value. Given this, getters and setters are also
							 * known as accessors and mutators, respectively.
							 */
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
