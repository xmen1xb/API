package com.vti.ultis;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ScannerUltis {
	public static Scanner sc = new Scanner(System.in);

	public static int inputInt() {
		while (true) {
			try {
				return Integer.parseInt(sc.next().trim());
			} catch (Exception e) {
				System.err.println("nhap lai");
			}

		}
	}

	public static String inputDate() {

		SimpleDateFormat fomart = new SimpleDateFormat("yy-MM-dd");
		while (true) {
			System.out.println("nhap theo dinh dang yy-MM-dd");
			String a = sc.next().trim();

			try {
				if (fomart.parse(a) != null) {
					return a;
				}

			} catch (Exception e) {
				System.out.println("nhap lai");

			}
		}
	}

	public static int inputSonguyen() {
		while (true) {
			try {
				return Integer.parseInt(sc.next());
			} catch (Exception e) {
				System.out.println("nhap lai");
			}
		}
	}

	public static int inputSonguyenduong() {
		while (true) {
			try {
				int a = Integer.parseInt(sc.next());
				if (a > 0) {
					return a;
					
				} else {
					System.out.println("nhap lai");
				}

			} catch (Exception e) {
				System.out.println("nhap lai");
			}
		}
	}

	public static Float inputfloat() {
		while (true) {
			try {
				return Float.valueOf(sc.next());
			} catch (Exception e) {
				System.out.println("nhap lai");
			}
		}
	}

	public static Double inputDouble() {
		while (true) {
			try {
				return Double.parseDouble(sc.next());
			} catch (Exception e) {
				System.err.println("Nhập lại:");
			}
		}
	}

	public static String inputString() {
		while (true) {
			String string = sc.next().trim();
			if (!string.isEmpty()) {
				return string;
			} else {
				System.err.println("Nhập lại:");
			}
		}
	}

}