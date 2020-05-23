package by.stacy.tasks;

public class Task7 {
	public static void task() {
		double x;
		double y;
		double h;
		double a;
		double b;

		h = 0.5;
		y = 0;
		a = -4;
		b = 10;
		x = a;

		for (x = a; x <= b; x = x + h) {
			if (x <= 2) {
				y = x;
				System.out.print(y+" ");
			} 
			else {
				y = x;
				System.out.print(y+" ");
			}
		}
	}
}
