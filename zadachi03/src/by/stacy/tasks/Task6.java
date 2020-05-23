package by.stacy.tasks;

import java.util.Scanner;

public class Task6 {
	public static void task() {
		int x;
		int i;
		int sum;

		sum = 0;
		i = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("¬ведите число: ");

		x = sc.nextInt();

		while (i <= x) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);

	}
}
