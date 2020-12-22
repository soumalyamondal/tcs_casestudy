package tcs.com.coachingapp.courses.source;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class ComputerCourse {

	public void computeCourseFile() {
//		String fileName = "D://Temp//Test1.txt";
		String fileName = "D://Temp//Test2.txt";

		// read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

			stream.forEach(line -> {System.out.println(balancedParenthensies(line));});

			stream.forEach(line -> {
				System.out.println(isValidIPAddress(line));
			});

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Function to validate brace balancing
	public boolean balancedParenthensies(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '[' || c == '(' || c == '{') {
				stack.push(c);
			} else if (c == ']') {
				if (stack.isEmpty() || stack.pop() != '[') {
					return false;
				}
			} else if (c == ')') {
				if (stack.isEmpty() || stack.pop() != '(') {
					return false;
				}
			} else if (c == '}') {
				if (stack.isEmpty() || stack.pop() != '{') {
					return false;
				}
			}

		}
		return stack.isEmpty();
	}

	// Function to validate the IPs address
	public  boolean isValidIPAddress(String ip) {

		// Regex for digit from 0 to 255.
		String zeroTo255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";

		// Complete IP Pattern : A.B.C.D
		String regex = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);

		if (ip == null) {
			return false;
		}

		Matcher m = p.matcher(ip);

		// Return if the IP address matched the Regex
		return m.matches();
	}

}
