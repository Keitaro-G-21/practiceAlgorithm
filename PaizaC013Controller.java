package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaizaC013Controller {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String badNum = sc.next();
		int roomNum = sc.nextInt();
		List<String> roomList = new ArrayList<>();
		List<String> okRoomList = new ArrayList<>();

		//部屋リストの作成
		for (int i = 0; i < roomNum; i++) {
			roomList.add(sc.next());
		}

		//使用可能な部屋のリスト作成
		for (int i = 0; i < roomNum; i++) {
			if (!roomList.get(i).contains(badNum)) {
				okRoomList.add(roomList.get(i));
			}
		}

		System.out.println(okRoomList.size());

		//表示
		if (okRoomList.size() == 0) {
			System.out.println("none");
		} else {
			for (int i = 0; i < okRoomList.size(); i++) {
					System.out.println(okRoomList.get(i));
			}
		}
	}
}
