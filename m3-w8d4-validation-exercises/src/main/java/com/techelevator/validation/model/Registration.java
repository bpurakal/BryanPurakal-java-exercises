package com.techelevator.validation.model;

import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

public class Registration {
	
	@NotBlank
	@Size(max=20)
	private String firstName;
	
	@NotBlank
	@Size(max=20)
	private String lastName;
	
	@Email(message="That's not a real email")
	@NotBlank
	private String email;
	
	private String confirmEmail;
	
	@NotBlank
	@Size(min=8)
	@Pattern (regexp="[%&*\\()$#@!]+") //plus sign at end means one or more of these characters need to be present; {2,} would mean 2 or more
	private String password;
	
	private String confirmPassword;
	
	@NotBlank
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private LocalDate birthDate;
	
	@Min(1)
	@Max(10)
	//@Range(min=1, max=10)
	private int numOfTickets;
	
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
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getConfirmEmail() {
		return confirmEmail;
	}
	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public int getNumOfTickets() {
		return numOfTickets;
	}
	public void setNumOfTickets(int numOfTickets) {
		this.numOfTickets = numOfTickets;
	}
}
