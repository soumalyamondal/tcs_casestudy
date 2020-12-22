package tcs.com.coachingapp.courses.source;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tcs.com.coachingapp.courses.bean.Employee;

@Component
public class Student {

//	@Autowired
//	StatisticsCourse statisticsCourse;
	
//	public Student() {
//		
//	}
//	
//	public void printEmployeeMap() {
//		
//		HashMap<Long, String> map = new StatisticsCourse().getMap();
//		map.forEach((key, value) -> System.out.println(key + ":" + value));
//		
//	}
//
//	public void printEmployeeByAgeFilter() {
//		// TODO Auto-generated method stub
//		new StatisticsCourse().printEmployeeByAgeFilter();
//	
//	}
//
//	public void sortEmployees() {
//		// TODO Auto-generated method stub
//		new StatisticsCourse().sortEmployees();
//	}

	public void printFromStudent() {
		// TODO Auto-generated method stub
		StatisticsCourse sc = new StatisticsCourse();
		sc.printEmployeeMap();
		sc.printEmployeeByAgeFilter();
		sc.sortEmployees();
	}
	
	
}
