package com.controller;

import java.util.Scanner;

public class PaizaAController {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int kinds = sc.nextInt();
		String[][] openInfo = new String[kinds][30];
		//System.out.println(kinds);

		for (int i = 0; i < kinds; i++) {
			int throwDay = sc.nextInt();
			int needOpenDay = sc.nextInt();
			//System.out.println(throwDay);
			int openStart = throwDay + needOpenDay;
			// if(openStart > 30){
			//     openStart = 30;
			// }
			int openEnd = throwDay + needOpenDay * 2;
			// if(openEnd > 30){
			//     ;
			// }
			for (int j = openStart; j < openEnd; j++) {
				openInfo[i][j] = "YES";
				//System.out.print(j);
				//System.out.println(openInfo[i][j]);
			} //System.out.println("");
		}

		int sumMax = 0;
		int maxDay = 0;

		for (int k = 0; k < 30; k++) {
			int sum = 0;
			for (int l = 0; l < kinds; l++) {
				if (openInfo[l][k] == "YES") {
					sum++;
					if (sumMax < sum) {
						sumMax = sum;
						maxDay = k;
					}
				}
			}
		}
		System.out.println(maxDay);
	}
}