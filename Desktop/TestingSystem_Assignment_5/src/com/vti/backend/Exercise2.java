package com.vti.backend;

import java.util.Scanner;

import com.vti.entity.DienThoaiCoDien;
import com.vti.entity.DienThoaiThongMinh;
import com.vti.entity.HinhChuNhat;
import com.vti.entity.HinhVuong;
import com.vti.entity.MyMath;
import com.vti.entity.Student;
import com.vti.entity.Student1;

public class Exercise2 {
	public static void question1() {
		Student st = new Student();

		st.diemdanh();
		st.hocBai();
		st.didonvesinh();
	}

	public static void question2() {
		Student1 st = new Student1();
		while (true) {
			System.out.println("moi chon chuc nang \n 1.them hs \n 2.xem danh sach hs \n 3.xem hoc bong");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			switch (i) {
			case 1:
				st.inputInfor();
				break;
			case 2:
				st.showInfo();
				break;
			case 3:
				st.xemhocbong();
				break;
			default:
				System.out.println("nhap sai moi nhap lai");
				break;
			}
		}
	}

	public static void question3() {
		HinhChuNhat hcn = new HinhChuNhat();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao chieu dai");
		hcn.a = sc.nextInt();
		System.out.println("nhap vao chieu rong");
		hcn.b = sc.nextInt();
		System.out.println(hcn.tinhDienTich());
		System.out.println(hcn.tinhChuVi());
		HinhVuong hv = new HinhVuong();
		System.out.println("nhap vao chieu dai 1 canh");
		hv.a = sc.nextInt();
		System.out.println(hv.tinhDienTich());
		System.out.println(hv.tinhChuVi());
	}
	public static void question4() {
		MyMath mm=new MyMath();
		System.out.println(mm.sum(2.2f, 2.3f));
		System.out.println(mm.sum(2, 12));
		System.out.println(mm.sum(1, 0));
		}
	public static void question5() {
		DienThoaiThongMinh dttm=new DienThoaiThongMinh();
		DienThoaiCoDien dtcd=new DienThoaiCoDien();
	}
}
