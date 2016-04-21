package com.demo;

import java.util.Random;
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数字");
		int num1 = scanner.nextInt();
		System.out.println("请输入第二个数字");
		int num2 = scanner.nextInt();
		int rand = new Random().nextInt(num2 - num1) + num1;
		System.out.println(rand);
		System.out.println("输入用户所猜数字");
		int aim = scanner.nextInt();

		if (aim == rand) {
			System.out.println("OK");
		} else if (aim > rand) {
			System.out.println("你输入的数字大了");
		} else {
			System.out.println("你输入的数字小了");
		}
	}
}
