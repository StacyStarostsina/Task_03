package by.stacy.tasks;

public class Task5 {
	public static void task() {
		int i;
		int sum;

		i = 1;
		sum = 0;

		while (i <= 99) {
			if (i % 2 != 0) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);

	}
}
