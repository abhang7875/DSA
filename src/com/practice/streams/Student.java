package com.practice.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Student {

	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private String departmantName;
	private int joinedYear;
	private String city;
	private int rank;

	public Student(int id, String firstName, String lastName, int age, String gender, String departmantName,
			int joinedYear, String city, int rank) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.departmantName = departmantName;
		this.joinedYear = joinedYear;
		this.city = city;
		this.rank = rank;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartmantName() {
		return departmantName;
	}

	public void setDepartmantName(String departmantName) {
		this.departmantName = departmantName;
	}

	public int getJoinedYear() {
		return joinedYear;
	}

	public void setJoinedYear(int joinedYear) {
		this.joinedYear = joinedYear;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", gender=" + gender + ", departmantName=" + departmantName + ", joinedYear=" + joinedYear + ", city="
				+ city + ", rank=" + rank + "]";
	}

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
				new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
				new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
				new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
				new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
				new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
				new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
				new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
				new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
				new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));

		// list of student whise name starts with alphabet 'A'

		List<Student> output1 = list.stream().filter(student -> student.getFirstName().startsWith("A"))
				.collect(Collectors.toList());

		// Group students by department name
		Map<String, List<Student>> output2 = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName));

		// Find the total count of student using stream

		long output3 = list.stream().count();

		// Find the max age of student
		int output4 = list.stream().mapToInt(student -> student.getAge()).max().getAsInt();

		// Find all departments names
		Set<String> output5 = list.stream().map(student -> student.getDepartmantName()).collect(Collectors.toSet());

		// Find the count of student in each department
		Map<String, Long> output6 = list.stream()
				.collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()));

		// Find the list of students whose age is less than 30
		List<Student> output7 = list.stream().filter(student -> student.getAge() < 30).collect(Collectors.toList());

		// Find the list of students whose rank is in between 50 and 100
		List<Student> output8 = list.stream().filter(student -> student.getRank() >= 50 && student.getRank() <= 100)
				.collect(Collectors.toList());

		// Find the average age of male and female students
		Map<String, Double> output9 = list.stream()
				.collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));

		// Find the department who is having maximum number of students
		Entry<String, Long> output10 = list.stream()
				.collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting())).entrySet().stream()
				.max(Map.Entry.comparingByValue()).get();

		//Find the Students who stays in Delhi and sort them by their names
		List<Student> output11 = list.stream().filter(student->student.getCity().equalsIgnoreCase("delhi")).sorted((s1,s2)-> s1.getFirstName().compareTo(s2.getFirstName())).collect(Collectors.toList());
		
		//Find the average rank in all departments
		Map<String, Double> output12 = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.averagingDouble(Student::getRank)));
		
		//Find the highest rank in each department
		Map<String, Optional<Student>> output13 = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.minBy(Comparator.comparing(Student::getRank))));
		
		// Find the list of students and sort them by their rank
		List<Student> output14 = list.stream().sorted(Comparator.comparing(Student::getRank)).collect(Collectors.toList());
		
		//Find the student who has second rank
		Optional<Student> output15 = list.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst();
		
		
		System.out.println(output1);
		System.out.println(output2);
		System.out.println(output3);
		System.out.println(output4);
		System.out.println(output5);
		System.out.println(output6);
		System.out.println(output7);
		System.out.println(output8);
		System.out.println(output9);
		System.out.println(output10);
		System.out.println(output11);
		System.out.println(output12);
		System.out.println(output13);
		System.out.println(output14);
		System.out.println(output15);

	}
}