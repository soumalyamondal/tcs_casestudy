package tcs.com.coachingapp.courses.bean;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Employee {
	private String name;
	private Long id;
	private int age;
	private double salary;
	private String dept;
	private Date doj;

}
