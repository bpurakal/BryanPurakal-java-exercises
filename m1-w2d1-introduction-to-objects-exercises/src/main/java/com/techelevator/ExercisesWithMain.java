package com.techelevator;

public class ExercisesWithMain {

	public static void main(String[] args) {
		Exercises exer = new Exercises();
		String we = exer.extraEnd("Hello");
		System.out.println(we);
		System.out.println(exer.firstTwo("chicken"));
		System.out.println(exer.withouEnd2(""));
		System.out.println(exer.middleTwo("Practice"));
		System.out.println(exer.endsLy("chickenly"));
		System.out.println(exer.middleThree("and"));
	}

}
