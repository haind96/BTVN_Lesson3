package com.topica.annotation.lesson2;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Employee {
	@Init
	private static final String name = "Tom";

	public static String getName() {
		return name;
	}

	public static String getNameReflection()
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		Field f = Employee.class.getDeclaredField("name");

		return (String) f.get(null);
	}

	public static void setEmployeeName(String name)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Field field = Employee.class.getDeclaredField("name");
		field.setAccessible(true);

		Field mfield = Field.class.getDeclaredField("modifiers");
		mfield.setAccessible(true);
		mfield.set(field, field.getModifiers() & ~Modifier.FINAL);

		field.set(null, name);

	}
}
