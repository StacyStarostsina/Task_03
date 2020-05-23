package by.stacy.tasks;

public class Task8 {
	public static void task() {
		double x;
		double y;
		double h;
		double a;
		double b;
		double c;

		h = 1;
		y = 0;
		c=3;
		a = 10;
		b = 20;
		x = a;

		for (x = a; x <= b; x = x + h) {
			if (x != 15) {
				y = (x-c)+6;
				System.out.print(y+" ");
			} else {
				y = (x+c)*2;
				System.out.print(y+" ");
			}
		}
	}
}
