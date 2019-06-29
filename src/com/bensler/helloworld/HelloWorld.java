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
		drei(bernd, 0);
		drei(bernd, 1);
	}
	
	public static void drei(String[] args, int index) {
		System.out.println("Hello World! " + args[index]);
	}
	
	
	public static int plus(int summand1, int summand2) {
		return summand1 + summand2;
	}
	
}
