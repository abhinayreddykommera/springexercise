package com.abhi.spring;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Login {
	@NotNull(message = "is required")
	@Size(min = 5, message = "is required")
	private String userName;

	@NotNull(message = "is required")
	@Size(min = 5, message = "is required")
	private String passWord;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Login() {

	}

	public Login(@NotNull(message = "is required") @Size(min = 5, message = "is required") String userName,
			@NotNull(message = "is required") @Size(min = 5, message = "is required") String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}

}
