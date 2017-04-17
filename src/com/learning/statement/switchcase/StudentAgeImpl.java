package com.learning.statement.switchcase;

public class StudentAgeImpl implements StudentAge {

	@Override
	public String getAge(int age) {
		switch (age) {
		case 1:
			System.out.println("Just born babe" + age);
			break;
		case 10:
			System.out.println("kid" + age);
			break;
		case 25:
			System.out.println("youth" + age);
			break;
		case 50:
			System.out.println("old" + age);
			break;
		default:
			System.out.println("your age is not in my list");
		}
		return null;
	}

}
