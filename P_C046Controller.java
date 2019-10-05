package com.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//C046
public class PaizcC046Controller {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		List<Person> buyList = new ArrayList<>();
		List<Person> sumList = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		//名前リスト作成
		int personNum = sc.nextInt();
		for (int i = 0; i < personNum; i++) {
			nameList.add(sc.next());
		}

		//購入リスト作成
		int buyNum = sc.nextInt();
		for (int i = 0; i < buyNum; i++) {
			buyList.add(new Person(sc.next(), sc.nextInt()));
		}

		//合計リスト作成
		for (int i = 0; i < personNum; i++) {
			String name = nameList.get(i);
			int sum = 0;
			for (int j = 0; j < buyNum; j++) {
				if (buyList.get(j).getName().equals(name)) {
					sum += buyList.get(j).getAmount();
				}
			}
			sumList.set(i, new Person(name, sum));
		}

		//多い順に並び変える
		sumList.sort(Comparator.comparing(Person::getAmount, Comparator.reverseOrder()));

		for (int i = 0; i < personNum; i++) {
			System.out.println(sumList.get(i).getName());
		}
	}

	public static class Person {
		private String name;
		private int amount;

		public Person(String name, int amount) {
			this.name = name;
			this.amount = amount;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAmount() {
			return amount;
		}

		public void setAmount(int amount) {
			this.amount = amount;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", amount=" + amount + "]";
		}

	}
}
