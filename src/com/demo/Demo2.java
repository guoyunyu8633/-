package com.demo;

import java.util.Random;
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������һ������");
		int num1 = scanner.nextInt();
		System.out.println("������ڶ�������");
		int num2 = scanner.nextInt();
		int rand = new Random().nextInt(num2 - num1) + num1;
		System.out.println(rand);
		System.out.println("�����û���������");
		int aim = scanner.nextInt();

		if (aim == rand) {
			System.out.println("OK");
		} else if (aim > rand) {
			System.out.println("����������ִ���");
		} else {
			System.out.println("�����������С��");
		}
	}
}
