package Homework;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	System.out.println("choose number");
	Scanner scano = new Scanner(System.in);
	int num = scano.nextInt();
	Pointer point = new Pointer(num);
	System.out.println(point.Point());
	}
}

