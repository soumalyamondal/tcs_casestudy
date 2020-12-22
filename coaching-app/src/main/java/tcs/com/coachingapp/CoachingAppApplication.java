package tcs.com.coachingapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tcs.com.coachingapp.courses.source.ComputerCourse;
import tcs.com.coachingapp.courses.source.MathCourse;
import tcs.com.coachingapp.courses.source.Student;

@SpringBootApplication
public class CoachingAppApplication implements CommandLineRunner{
	
//	@Autowired
//	ComputerCourse computerCourse;
//	
//	@Autowired
//	Student student;
	
	public static void main(String[] args) {
		SpringApplication.run(CoachingAppApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside run");
		//student.getEmployeeMap();
		try {
			new ComputerCourse().computeCourseFile();
		}
		catch(Exception e) {
			System.out.println("Exception in ComputerCourse"+e);
		}
		try {
			new Student().printFromStudent();
		}
		catch(Exception e) {
			System.out.println("Exception in StatisticsCourse"+e);
		}
		try {
			new MathCourse().printMathCourses();
		}
		catch(Exception e) {
			System.out.println("Exception in MathCourse"+e);
		}
	}

	
	
}
