package com.abhi.spring;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Customer {
	@NotNull(message = "is required")
	@Size(min = 5, message = "is required")
	private String firstName;

	@NotNull(message = "is required")
	@Size(min = 5, message = "is required")
	private String lastName;

	@NotNull(message = "is required")
	@Size(min = 5, message = "is required")
	private String dateofBirth;

	@NotNull(message = "is required")
	@Size(min = 5, message = "is required")
	private String ssn;

	public Customer() {

	}

	public Customer(@NotNull(message = "is required") @Size(min = 5, message = "is required") String firstName,
			@NotNull(message = "is required") @Size(min = 5, message = "is required") String lastName,
			@NotNull(message = "is required") @Size(min = 5, message = "is required") String dateofBirth,
			@NotNull(message = "is required") @Size(min = 5, message = "is required") String ssn) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateofBirth = dateofBirth;
		this.ssn = ssn;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

}
