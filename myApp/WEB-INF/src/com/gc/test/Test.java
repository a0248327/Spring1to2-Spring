/*
 * Created on 2006-3-20
 * TODO
 * author:gf
 */
package com.gc.test;

public class Test {
	public static void main(String args[]) {
		// int[] num1 = {5, 7, 14, 16, 17, 27, 4};//28
		// int[] num1 = {3, 4, 7, 9, 14, 19, 8};//29
		// int[] num1 = {8, 13, 15, 17, 20, 32, 14};//30
		// int[] num1 = {3, 10, 12, 16, 31, 32, 14};//31
		// int[] num3 = {6, 8, 11, 14, 16, 27, 15};//27
		// int[] num2 = {1, 2, 18, 22, 29, 32, 3};//26
		// int[] num1 = {3, 4, 17, 19, 24, 32, 5};//25
		// int[] num1 = {5, 18, 20, 24, 26, 31, 9};//32
		// int[] num1 = {15, 20, 22, 23, 27, 31, 6};//33
		int[] num1 = { 2, 10, 15, 16, 17, 33, 13 };// 34
		int[] num2 = { 3, 9, 13, 21, 27, 29, 13 };// 35
		int[] num3 = { 4, 7, 10, 16, 17, 21, 9 };// 36

		int[] numall1 = new int[32];// 列出前3期都出现过的号码
		int[] numall2 = new int[32];// 列出上期差值
		int[] numall3 = new int[32];// 列出上上期差值
		int[] kill = new int[32];
		int[] chong3 = new int[32];
		int[] numchong2 = new int[10000];
		int[] numchong3 = new int[10000];
		int[] numchong = new int[10000];
		int[] numchong1 = new int[10000];

		for (int i = 0; i < numall1.length; i++) {
			numall1[i] = 0;
			numall2[i] = 0;
			numall3[i] = 0;
			kill[i] = 0;
			chong3[i] = 0;
		}
		for (int i = 0; i < numchong.length; i++) {
			numchong[i] = 0;
			numchong1[i] = 0;
			numchong2[i] = 0;
			numchong3[i] = 0;
		}
		int k1 = 0;
		int k2 = 0;
		int k3 = 0;
		int k4 = 0;
		int k5 = 0;
		int k6 = 0;
		int k7 = 0;
		int k8 = 0;
		// 列出前3期都出现过的号码
		for (int i = 0; i < num1.length - 1; i++) {
			// System.out.print(num1[i] + " ");
			numall1[k1++] = num1[i];
		}

		for (int j = 0; j < num2.length - 1; j++) {
			int m = 0;
			for (int i = 0; i < num1.length - 1; i++) {
				if (num2[j] == num1[i]) {
					m++;
				}
			}
			if (m == 0) {
				// System.out.print(num2[j] + " ");
				numall1[k1++] = num2[j];
			}
		}

		for (int j = 0; j < num3.length - 1; j++) {
			int m = 0;
			for (int i = 0; i < num1.length - 1; i++) {
				if (num3[j] == num1[i]) {
					m++;
				}
				if (num3[j] == num2[i]) {
					m++;
				}
			}
			if (m == 0) {
				// System.out.print(num3[j] + " ");
				numall1[k1++] = num3[j];
			}
		}
		System.out.print("前3期都出现过的号码：");
		sort(numall1);
		// 列出上期差值
		for (int j = 0; j < num3.length - 2; j++) {
			for (int i = j + 1; i < num3.length - 1; i++) {
				// System.out.print(num3[i] - num3[j] + " ");
				numall2[k2++] = num3[i] - num3[j];
			}
		}
		System.out.print("上期差值：");
		sort(numall2);
		// 列出上上期差值
		for (int j = 0; j < num2.length - 2; j++) {
			for (int i = j + 1; i < num2.length - 1; i++) {
				// System.out.print(num2[i] - num2[j] + " ");
				numall3[k3++] = num2[i] - num2[j];
			}
		}
		System.out.print("上上期差值（重点）：");
		sort(numall3);
		// 杀号
		// 上期差值作为杀号
		// 用上二期顺序开奖号码一一对应相减的绝对值
		for (int i = 0; i < num3.length - 1; i++) {
			kill[k7++] = Math.abs(num3[i] - num2[i]);
		}
		// 上期开奖号码减去本期蓝球
		for (int i = 0; i < num3.length - 1; i++) {
			kill[k7++] = Math.abs(num3[i] - num3[6]);
		}
		// 上期开奖号码减去本期和值的拆分合值,如果差值相减为负数的话必须加上３３
		int kill1 = 0;
		int kill2 = 0;
		for (int i = 0; i < num3.length - 1; i++) {
			kill1 = kill1 + num3[i];
		}
		kill2 = kill1 / 10 + (kill1 - kill1 / 100 * 100) % 10;
		if (kill1 >= 100) {
			kill2 = kill2 + 1;
		}
		if (kill2 >= 10) {
			kill2 = kill1 / 10 + kill1 % 10;
		}
		for (int i = 0; i < num3.length - 1; i++) {
			kill[k7++] = (num3[i] - kill2) < 0 ? (num3[i] - kill2 + 33)
					: (num3[i] - kill2);
		}
		kill1 = 0;
		// 上期开奖号码减去当期尾数合值的拆分合值,如果差值相减为负数的话必须加上３３
		for (int i = 0; i < num3.length - 1; i++) {
			if (num3[i] >= 10) {
				kill1 += num3[i] % 10;
			} else {
				kill1 += num3[i];
			}
		}
		kill2 = kill1 / 10 + (kill1 - kill1 / 100 * 100) % 10;
		if (kill1 >= 100) {
			kill2 = kill2 + 1;
		}
		if (kill2 >= 10) {
			kill2 = kill1 / 10 + kill1 % 10;
		}
		for (int i = 0; i < num3.length - 1; i++) {
			kill[k7++] = (num3[i] - kill2) < 0 ? (num3[i] - kill2 + 33)
					: (num3[i] - kill2);
		}
		System.out.print("杀号有：");
		sort(kill);
		for (int i = 1; i < 34; i++) {
			int g = 0;
			for (int j = 0; j < kill.length; j++) {
				if (i == kill[j]) {
					g++;
				}
			}
			if (g == 0) {
				chong3[k8++] = i;
			}
		}
		System.out.print("杀号后的剩余号码有(重点)：");
		sort(chong3);
		// 列出这4种方式的重号和这4种方式都没有的号
		for (int i = 0; i < numall1.length; i++) {
			for (int j = 0; j < numall2.length; j++) {
				if (numall1[i] == numall2[j]) {
					numchong2[k4++] = numall1[i];
				}
			}
			for (int j = 0; j < numall3.length; j++) {
				if (numall1[i] == numall3[j]) {
					numchong2[k4++] = numall1[i];
				}
			}
			for (int j = 0; j < chong3.length; j++) {
				if (numall1[i] == chong3[j]) {
					numchong2[k4++] = numall1[i];
				}
			}
		}
		for (int i = 0; i < numall2.length; i++) {
			for (int j = 0; j < numall3.length; j++) {
				if (numall2[i] == numall3[j]) {
					numchong2[k4++] = numall2[i];
				}
			}
			for (int j = 0; j < chong3.length; j++) {
				if (numall2[i] == chong3[j]) {
					numchong2[k4++] = numall2[i];
				}
			}
		}
		for (int i = 0; i < numall3.length; i++) {
			for (int j = 0; j < chong3.length; j++) {
				if (numall3[i] == chong3[j]) {
					numchong2[k4++] = numall3[i];
				}
			}
		}
		System.out.print("4期重2码的有(重点重点)：");
		sort(numchong2);

		for (int i = 0; i < numall1.length; i++) {
			for (int j = 0; j < numall2.length; j++) {
				if (numall1[i] == numall2[j] && numall2[j] != 0) {
					numchong3[k5++] = numall1[i];
				}
			}
		}
		k5 = 0;
		for (int p = 0; p < numchong3.length; p++) {
			for (int i = 0; i < numall3.length; i++) {
				if (numchong3[p] == numall3[i] && numall3[i] != 0) {
					numchong3[k5++] = numall3[i];
				}
			}
		}
		k5 = 0;
		for (int p = 0; p < numchong3.length; p++) {
			for (int i = 0; i < chong3.length; i++) {
				if (numchong3[p] == chong3[i] && chong3[i] != 0) {
					numchong3[k5++] = chong3[i];
				}
			}
		}

		System.out.print("4期重3码的有：");
		sort(numchong3);

		for (int i = 1; i < 34; i++) {
			int g = 0;
			for (int j = 0; j < numall1.length; j++) {
				if (i == numall1[j]) {
					g++;
				}
				if (i == numall2[j]) {
					g++;
				}
				if (i == numall3[j]) {
					g++;
				}
			}
			if (g == 0) {
				numchong[k6++] = i;
			}
		}
		System.out.print("3期都没有出现的号码：");
		sort(numchong);
		k5 = 0;
		for (int p = 0; p < numchong2.length; p++) {
			for (int i = 0; i < chong3.length; i++) {
				if (numchong2[p] == chong3[i] && chong3[i] != 0) {
					numchong1[k5++] = chong3[i];
				}
			}
		}
		System.out.print("杀号后剩余的号码和出现2码的重号（重点重点）：");
		sort(numchong1);
		k5 = 0;
		for (int i = 0; i < kill.length; i++) {
			numchong2[k5++] = kill[i];
		}
		System.out.print("杀号和出现2码的重号（号码基本都在这里）：");
		sort(numchong2);
		System.out.print("绝不会出现的号码：");
		for (int i = 1; i < 34; i++) {
			int g = 0;
			for (int j = 0; j < numchong2.length; j++) {
				if (i == numchong2[j]) {
					g++;
				}
			}
			if (g == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void sort(int num[]) {
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = num.length - 1; j > i; j--) {
				if (num[j] < num[j - 1]) {
					int temp = num[j];
					num[j] = num[j - 1];
					num[j - 1] = temp;
				}
			}
		}

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					num[j] = 0;
				}
			}
		}

		for (int i = 0; i < num.length; i++) {
			if (num[i] != 0) {
				System.out.print(num[i] + " ");
			}
		}
		System.out.println(" ");
	}
}
