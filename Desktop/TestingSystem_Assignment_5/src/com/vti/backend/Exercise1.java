package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.Contestant;
import com.vti.entity.News;
import com.vti.entity.Tuyensinh;

public class Exercise1 {
	private ArrayList<News> listNews;

	public Exercise1() {
		listNews = new ArrayList<News>();

	}

	public void question1() {

		News n1 = new News();
		while (true) {

			System.out.println("moi chon chuc nang");
			System.out.println("1.Insert news ");
			System.out.println("2.View list news  ");
			System.out.println("3.Average rate ");
			System.out.println("4.Exit ");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			switch (i) {
			case 1:
				System.out.println("nhap vao Title");
				String Title = sc.next();
				System.out.println("nhap vao PublishDate");
				String Publishdate = sc.next();
				System.out.println("nhap vao Author");
				String Author = sc.next();
				System.out.println("nhap vao Content ");
				String Content = sc.next();
				System.out.println("nhap vao danh gia 1");
				int rate1 = sc.nextInt();
				System.out.println("nhap vao danh gia 2");
				int rate2 = sc.nextInt();
				System.out.println("nhap vao danh gia 3");
				int rate3 = sc.nextInt();
				int[] rates = { rate1, rate2, rate3 };
				News new1 = new News(Title, Publishdate, Author, Content, rates);
				listNews.add(new1);
				break;
			case 2:
				for (News j : listNews) {
					j.Display();
				}

				break;
			case 3:
				for (News j : listNews) {
					j.Calculate();
				}
				for (News j : listNews) {
					j.Display();
				}
				break;
			case 4:
				return;

			default:
				System.out.println("moi chon lai");
				break;
				
			}System.out.println("==========================================================");
		}
	}

	public void question2() {
		Tuyensinh ts1 = new Tuyensinh();
		while (true) {

			System.out.println("moi chon chuc nang");
			System.out.println("1.Thêm mới thí sinh ");
			System.out.println("2.Hiện thị thông tin của thí sinh và khối thi của thí sinh. ");
			System.out.println("3.Tìm kiếm theo số báo danh");
			System.out.println("4.Exit ");
			Scanner sc = new Scanner(System.in);
			int j = sc.nextInt();

			switch (j) {
			case 1:
				ts1.addContestant();
				break;
			case 2:
				ts1.showContesttant();
				break;
			case 3:
				ts1.findContestant();
				break;
			case 4:
				ts1.exit();
				break;

			default:
				break;
			}
		}
	}
	
}
