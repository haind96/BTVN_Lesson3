package com.topica.annotation.lesson1;

public class Student {

	@Init
	private String name;
	private Integer age;

	@Init
	public static final int a = 10;

	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Student() {
		super();
	}
	
	@Init
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Init
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
