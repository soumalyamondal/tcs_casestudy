package tcs.com.coachingapp.courses.source;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

import org.springframework.stereotype.Component;

import tcs.com.coachingapp.courses.bean.Employee;

@Component
public class StatisticsCourse {

	public void printEmployeeMap() {
		// TODO Auto-generated method stub
		HashMap<Long, String> map = new HashMap<Long, String>();
		
		List<Employee> emplist = loadEmployee();
		
		emplist.stream().forEach(emp -> {
			map.put(emp.getId(), emp.getName());
		});
		map.forEach((key, value) -> System.out.println(key + ":" + value));
	}

	private List<Employee> loadEmployee() {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<Employee>();

		IntStream.range(0, 10).forEach(
				// nbr -> System.out.println(nbr)
				nbr -> list.add(
						new Employee("Emp" + nbr, new Long(nbr), 10, 1000.00, "Dep" + nbr, parseDate("2020-12-22"))));
		return list;
	}

	public static Date parseDate(String date) {
		try {
			return new SimpleDateFormat("yyyy-MM-dd").parse(date);
		} catch (Exception e) {
			return null;
		}
	}

	public void printEmployeeByAgeFilter() {
		// TODO Auto-generated method stub
		List<Employee> emplist = loadEmployee();
		emplist.stream().filter(emp->emp.getAge() >= 30 && emp.getAge() <= 40).forEach(System.out::println);;
	}

	public void sortEmployees() {
		// TODO Auto-generated method stub
		List<Employee> emplist = loadEmployee();
		
		emplist.sort((Employee e1, Employee e2)->e1.getName().compareTo(e2.getName()));
		emplist.sort((Employee e1, Employee e2)->e1.getDoj().compareTo(e2.getDoj()));
		
		emplist.stream().forEach(System.out::println);;
	}

}
