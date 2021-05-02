package com.vti.entity;

public class HinhVuong extends HinhChuNhat {

	public HinhVuong() {
		super();
	}

	public int tinhDienTich() {
		System.out.println("Tính diện tích theo Hình Vuông");
		return a * a;
	}

	public int tinhChuVi() {
		System.out.println("Tính chu vi theo Hình Vuông");
		return a * 4;

	}
}
