package com.topica.annotation.lesson2;

import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		for (Field field : Employee.class.getDeclaredFields()) {
			Init checkAnnotation = (Init) field.getAnnotation(Init.class);
			if (checkAnnotation != null) {
				System.out.println("@Check: " + field.getName());

			}
		}

		System.out.println("Gia tri ban dau:= " + Employee.getName());
		Employee.setEmployeeName("John");
		System.out.println("Gia tri sau khi thay doi:= " + Employee.getNameReflection());

	}
}
