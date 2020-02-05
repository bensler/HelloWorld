package com.bensler.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		eins(args);
		System.out.println(plus(34, 17));
		
	}

	public static void eins(String[] args) {
		zwei(args);
	}
	
	public static void zwei(String[] bernd) {
		System.out.println(bernd.length + " arguments");
		drei(bernd, 0);
		drei(bernd, 1);
		drei(bernd, 2);
	}
	
	public static void drei(String[] args, int index) {
		if (index < args.length) {
			System.out.println("Hello World! " + args[index]);
		} else {
			System.out.println("Hello World! no more arguments");
		}
	}
	
	
	public static int plus(int summand1, int summand2) {
		int summe = summand1 + summand2;
		
		return summe;
	}
	
}
