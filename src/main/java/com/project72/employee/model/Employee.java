
	// used to declare variables related to front end
	// create all employee variables

package com.project72.employee.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
	

	
	private long id;
	private String firstName;
	private String lastName;
	private String emailId;
	private long phoneNumber;
	

}
