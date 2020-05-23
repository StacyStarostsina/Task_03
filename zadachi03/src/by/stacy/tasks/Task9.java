package by.stacy.tasks;

public class Task9 {
	public static void task() {
		int i;
		int sum;

		sum = 0;
		i = 1;

		for (i = 1; i <= 100; i++) {
			sum = sum + i * i;
		}
		System.out.println(sum);
	}
}
