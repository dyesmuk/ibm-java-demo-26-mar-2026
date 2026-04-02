package com.ibm.demo.day4.newfeatures;

// code examples - 
// https://github.com/dyesmuk/ibm-java-demo-26-mar-2026/blob/main/README.md#29-java-8-features

public class Java8Java14NewFeatures {

	public static void main(String[] args) {

		DayOfTheWeek day = DayOfTheWeek.THURSDAY; // random day here 

		String result = switch (day) {
		case MONDAY -> "Start working";
		case TUESDAY, WEDNESDAY, THURSDAY -> "Keep working";
		case FRIDAY -> "Weekend is coming";
		case SATURDAY, SUNDAY -> "Enjoy weekend!";
		default -> "Other";
		};

		System.out.println(result);

	}

}
