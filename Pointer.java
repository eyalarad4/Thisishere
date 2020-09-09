package Homework;

import java.util.Random;

public class Pointer {

	private int times;
	public Pointer(int times) {
		this.times = times;
	}
	public double Point() {
		double count = 0;
		Random r = new Random();
		for (int i = 0; i < times; i++) {
			double x = r.nextDouble()-0.5;
		    double y = r.nextDouble()-0.5;
		    if(x*x + y*y <= 0.25)
		    	count++;
		}
		return count/times*4;
	}
}
