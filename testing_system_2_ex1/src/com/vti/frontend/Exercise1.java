package com.vti.frontend;

import java.time.LocalDate;

import com.vti.entity.Account;
import com.vti.entity.Answer;
import com.vti.entity.CategoryQuestion;
import com.vti.entity.CategoryQuestion.categoryname;
import com.vti.entity.Department;
import com.vti.entity.Exam;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.Position.PositionName;
import com.vti.entity.Question;
import com.vti.entity.TypeQuestion;

public class Exercise1 {
	@SuppressWarnings("deprecation")
public static void main(String[] args) {

		Department dep1=new Department(1, "sale");
		Department dep2=new Department(2, "maketing");
		Department dep3=new Department(3, "nhan su");
		Department dep4=new Department(4, "san xuat");
		Department dep5=new Department(5, "the thao");
		Department dep6=new Department(6, "thiet ke");
		Department dep7=new Department(7, "truyen thong");
		Department dep8=new Department(7, "van hoa");
		Department dep9=new Department(9, "quang cao");
		Department dep10=new Department(10, "the thao2");
		Position pos1= new Position(1, PositionName.DEV);
		Position pos2= new Position(2, PositionName.PM);
		Position pos3= new Position(3, PositionName.SCRUM_MASTER);
		Position pos4= new Position(4, PositionName.TEST);
		Position pos5= new Position(5, PositionName.SCRUM_MASTER);
		Position pos6= new Position(6, PositionName.TEST);
		Position pos7= new Position(7, PositionName.SCRUM_MASTER);
		Position pos8= new Position(8, PositionName.TEST);
		Position pos9= new Position(9, PositionName.PM);
		Position pos10= new Position(10, PositionName.TEST);
		Group group4=new Group(1, "name4", null , LocalDate.of(2021, 06, 30), null);
		Group group5=new Group(1, "name5", null , LocalDate.of(2020, 01, 30), null);
		Group group6=new Group(1, "name6", null , LocalDate.of(2020, 07, 30), null);
		Group group7=new Group(1, "name7", null , LocalDate.of(2020, 04, 30), null);
		Group[] ac1= {group4,group5,group6};
		Account acc1=new Account(1, "xmen1xb@gmail.com", "xmen1xb", "nguen van tan", dep10, pos9, LocalDate.of(2021, 12, 02), ac1);
		Account acc2=new Account(2, "email1@gmail.com", "username1", "fullname1", dep2, pos8, LocalDate.of(2021, 12, 30), ac1);
		Account acc3=new Account(3, "email3@gmail.com", "username3", "fullname3", dep3, pos4, LocalDate.of(2021, 12, 30), ac1);
		Account acc4=new Account(4, "email4@gmail.com", "username4", "fullname4", dep5, pos3, LocalDate.of(2021, 12, 30), null);
		Account acc5=new Account(5, "email5@gmail.com", "username5", "fullname5", dep6, pos2, LocalDate.of(2021, 12, 30), null);
		Account acc6=new Account(6, "email6@gmail.com", "username6", "fullname6", dep1, pos5, LocalDate.of(2021, 12, 30), null);
		Account acc7=new Account(7, "email7@gmail.com", "username7", "fullname7", dep2, pos3, LocalDate.of(2021, 12, 30), null);
		Account acc8=new Account(8, "email8@gmail.com", "username8", "fullname8", dep9, pos2, LocalDate.of(2021, 12, 30), null);
		Account acc9=new Account(9, "email9@gmail.com", "username9", "fullname9", dep6, pos10, LocalDate.of(2021, 12, 30), null);
		Account acc10=new Account(10, "email10@gmail.com", "username10", "fullname10", dep1, pos8, LocalDate.of(2021, 12, 30), null);
		Account[] gr1= {acc1,acc2};
		Account[] gr2= {acc2,acc3,acc6};
		Group group1=new Group(1, "name1", acc1 , LocalDate.of(2021, 12, 30), gr1);
		Group group2=new Group(1, "name2", acc2 , LocalDate.of(2021, 03, 30), gr2);
		Group group3=new Group(1, "name3", acc6 , LocalDate.of(2021, 05, 30), null);
		Group group8=new Group(1, "name8", acc5 , LocalDate.of(2020, 06, 30), null);
		Group group9=new Group(1, "name9", acc6 , LocalDate.of(2021, 01, 30), null);
		Group group10=new Group(1, "name10", acc1 , LocalDate.of(2021, 12, 30), gr2 );
		TypeQuestion type1=new TypeQuestion(1, "typename1");
		TypeQuestion type2=new TypeQuestion(2, "typename2");
		TypeQuestion type3=new TypeQuestion(3, "typename3");
		TypeQuestion type4=new TypeQuestion(4, "typename4");
		TypeQuestion type5=new TypeQuestion(5, "typename5");
		TypeQuestion type6=new TypeQuestion(6, "typename6");
		TypeQuestion type7=new TypeQuestion(7, "typename7");
		TypeQuestion type8=new TypeQuestion(8, "name8");
		TypeQuestion type9=new TypeQuestion(9, "typename9");
		TypeQuestion type10=new TypeQuestion(10, "typename10");
		CategoryQuestion cat1=new CategoryQuestion(1, categoryname.JAVA);
		CategoryQuestion cat2=new CategoryQuestion(2, categoryname.NET);
		CategoryQuestion cat3=new CategoryQuestion(3, categoryname.POSTMAN);
		CategoryQuestion cat4=new CategoryQuestion(4, categoryname.RUBY);
		CategoryQuestion cat5=new CategoryQuestion(5, categoryname.SQL);
		CategoryQuestion cat6=new CategoryQuestion(6, categoryname.JAVA);
		CategoryQuestion cat7=new CategoryQuestion(7, categoryname.JAVA);
		CategoryQuestion cat8=new CategoryQuestion(8, categoryname.NET);
		CategoryQuestion cat9=new CategoryQuestion(9, categoryname.JAVA);
		CategoryQuestion cat10=new CategoryQuestion(10, categoryname.JAVA);
		Question ques1=new Question(1, "conten1", cat10, type10, acc10, LocalDate.of(2021, 12, 30));
		Question ques2=new Question(1, "conten2", cat10, type10, acc10, LocalDate.of(2021, 12, 30));
		Question ques3=new Question(1, "conten3", cat10, type10, acc10, LocalDate.of(2021, 12, 30));
		Question ques4=new Question(1, "conten4", cat10, type10, acc10, LocalDate.of(2021, 12, 30));
		Question ques5=new Question(1, "conten5", cat10, type10, acc10, LocalDate.of(2021, 12, 30));
		Question ques6=new Question(1, "conten6", cat10, type10, acc10, LocalDate.of(2021, 12, 30));
		Question ques7=new Question(1, "conten7", cat10, type10, acc10, LocalDate.of(2021, 12, 30));
		Question ques8=new Question(1, "conten8", cat10, type10, acc10, LocalDate.of(2021, 12, 30));
		Question ques9=new Question(1, "conten9", cat10, type10, acc10, LocalDate.of(2021, 12, 30));
		Question ques10=new Question(1, "conten10", cat10, type10, acc10, LocalDate.of(2021, 12, 30));
		Exam ex1=new Exam(1, "a1", "title1", cat10, 45, acc10, LocalDate.of(2021, 12, 30), null);
		Exam ex2=new Exam(2, "a1", "title2", cat10, 45, acc10, LocalDate.of(2021, 12, 30), null);
		Exam ex3=new Exam(3, "a1", "title3", cat10, 45, acc10, LocalDate.of(2021, 12, 30), null);
		Exam ex4=new Exam(4, "a1", "title4", cat10, 45, acc10, LocalDate.of(2021, 12, 30), null);
		Exam ex5=new Exam(5, "a1", "title5", cat10, 45, acc10, LocalDate.of(2021, 12, 30), null);
		Exam ex6=new Exam(6, "a1", "title6", cat10, 45, acc10, LocalDate.of(2021, 12, 30), null);
		Exam ex7=new Exam(7, "a1", "title7", cat10, 45, acc10, LocalDate.of(2021, 12, 30), null);
		Exam ex8=new Exam(8, "a1", "title8", cat10, 45, acc10, LocalDate.of(2021, 12, 30), null);
		Exam ex9=new Exam(9, "a1", "title9", cat10, 45, acc10, LocalDate.of(2021, 12, 30), null);
		Exam ex10=new Exam(10, "a1", "title10", cat10, 45, acc10, LocalDate.of(2021, 12, 30), null);
		Answer an1=new Answer(1, "conten1", ques2, true);
		Answer an2=new Answer(2, "conten2", ques2, true);
		Answer an3=new Answer(3, "conten3", ques10, true);
		Answer an4=new Answer(4, "conten4", ques2, true);
		Answer an5=new Answer(5, "conten5", ques5, true);
		Answer an6=new Answer(6, "conten6", ques4, true);
		Answer an7=new Answer(7, "conten7", ques5, true);
		Answer an8=new Answer(8, "conten8", ques10, true);
		Answer an9=new Answer(9, "conten9", ques5, true);
		Answer an10=new Answer(10, "conten10", ques10, true);
//q1
		if (acc2.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		} else
			System.out.println("Phòng ban của nhân viên này là: "
					+ acc2.department.name);
//q2
		if (acc2.groups == null || acc2.groups.length == 0) {
			System.out.println("Nhân viên này chưa có group");

		} else if (acc2.groups.length == 1) {
			System.out.println("Group của nhân viên này là"
					+ acc2.groups[0]);

		} else if (acc2.groups.length == 2) {
			System.out.println("Group của nhân viên này là"
					+ acc2.groups[0] + ", " + acc2.groups[1]);

		} else if (acc2.groups.length == 3) {
			System.out
					.println("Nhân viên này là người quan trọng, tham gia nhiều group");

		} else
			System.out
					.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
//q3
		System.out
		.println(acc2.department == null ? "Nhân viên này chưa có phòng ban"
				: "Phòng ban của nhân viên này là :"
						+ acc2.department.name);
//q4
		System.out.println(acc1.position.name.toString() == "Dev" ? "Đây là Developer"
				: "Người này không phải là Developer");
//q5
		int x = group1.accounts.length;
		switch (x) {
		case 1:
			System.out.println("Nhóm có một thành viên");
			break;
		case 2:
			System.out.println("Nhóm có hai thành viên");
			break;
		case 3:
			System.out.println("Nhóm có ba thành viên");
		default:
			System.out.println("Nhóm có nhiều thành viên");
		}
//q6
		int y = acc2.groups.length;
		switch (y) {
		case 0:
			System.out.println("Nhân viên này chưa có group");
			break;
		case 1:
			System.out.println("Group của nhân viên này là"
					+ acc2.groups[0]);
			break;
		case 2:
			System.out.println("Group của nhân viên này là"
					+ acc2.groups[0] + ", " + acc2.groups[1]);
			break;
		case 3:
			System.out
					.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			break;
		default:
			System.out
					.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}
//q7
		String z = acc1.position.name.toString();
		switch (z) {
		case "Dev":
			System.out.println("Đây là Developer");
			break;
		default:
			System.out.println("Người này không phải là Developer");
		}
//q8
		Account[] accounts = { acc1, acc2, acc3 ,acc4};
		for (Account account : accounts) {
			System.out.println("Email: " + account.email);
			System.out.println("FullName: " + account.fullname);
			System.out.println("Name Department: " + account.department.name);
		}
//q9
		Department[] departments = { dep1, dep2, dep3 ,dep4};
		for (Department department : departments) {
			System.out.println("ID Department: " + department.id);
			System.out.println("Name Department: " + department.name);
		}
//q10
		for (int i = 0; i < accounts.length; i++) {
			System.out.println("Thông tin account thứ " + (i + 1) + " là :");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Fullname: " + accounts[i].fullname);
			System.out.println("Department: " + accounts[i].department.name);
		}
//q11
		for (int i = 0; i < departments.length; i++) {
			System.out.println("Thông tin department thứ " + (i + 1) + " là :");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
		}
//q12	
		for (int i = 0; i < 2; i++) {
			System.out.println("Thông tin department thứ " + (i + 1) + " là :");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
		}
//q13
		for (int i = 0; i < departments.length; i++) {
			if (i != 1) {
				System.out.println("Thông tin department thứ " + (i + 1)
						+ " là :");
				System.out.println("ID: " + departments[i].id);
				System.out.println("Name: " + departments[i].name);
			}
		}
//q14
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].id < 4) {
				System.out
						.println("Thông tin account thứ " + (i + 1) + " là :");
				System.out.println("Email: " + accounts[i].email);
				System.out.println("Fullname: " + accounts[i].fullname);
				System.out
						.println("Department: " + accounts[i].department.name);
			}
		}
//q15
		for (int i =2;i<=20;i=i+2) {System.out.println(i);}
//16-10
		System.out.println("q16-10");
		int i = 0;
		while (i < accounts.length) {
			System.out.println("Thông tin account thứ " + (i + 1) + " là :");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Fullname: " + accounts[i].fullname);
			System.out.println("Department: " + accounts[i].department.name);
			i++;
		}
//16-11
		System.out.println("q16-11");
		i = 0;
		while (i < departments.length) {
			System.out.println("Thông tin department thứ " + (i + 1) + " là :");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
			i++;
		}
//16-12
		System.out.println("q16-12");
		i = 0;
		while (i < 2) {
			System.out.println("Thông tin department thứ " + (i + 1) + " là :");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
			i++;
		}
		System.out.println("cau 16-13");
//16-13
		System.out.println("q16-13");
		i=0;
		while (i<accounts.length) {
			if (i==1) {
			i++;
			continue;}
			
			System.out.println("Thông tin account thứ " + (i + 1) + " là :");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Fullname: " + accounts[i].fullname);
			System.out.println("Department: " + accounts[i].department.name);
			i++;
			
		}
//q16-14
		System.out.println("q16-14");
		i = 0;
		while (i < accounts.length) {
			if (accounts[i].id >= 4) {
				i++;
				continue;
			}
			System.out.println("Thông tin account thứ " + (i + 1) + " là :");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Fullname: " + accounts[i].fullname);
			System.out.println("Department: " + accounts[i].department.name);
			i++;
		}
//q16-15
		System.out.println("q16-15");
		i = 2;
		while (i <= 20) {
			System.out.println(i);
			i = i + 2;
		}
//q17-10
		System.out.println("q17-10");
		i=0;
		do {
			System.out.println("thong tin account thu "+(i+1)+" la");
			System.out.println("email: "+accounts[i].email);
			System.out.println("fullname: "+accounts[i].fullname);
			System.out.println("phong ban: "+accounts[i].department.name);
			i++;
		} while (i<accounts.length);
//q17-11
		System.out.println("q17-11");
		
		i=0;
		do {
			System.out.println("thong tin department thu "+(i+1)+" la");
			System.out.println("id: "+departments[i].id);
			System.out.println("name: "+departments[i].name);
			i++;
		} while (i<departments.length);
//q17-12
		System.out.println("q17-12");
		i=0;
		do {
			if (i<2) {
				System.out.println("thong tin department thu "+(i+1)+" la");
				System.out.println("id: "+departments[i].id);
				System.out.println("name: "+departments[i].name);
			}
			i++;
		} while (i<departments.length);

//q17-13
		System.out.println("q17-13");
		i=0;
		do {if (i==1){
		i++;
		continue;}
			
		
			
				
			
				System.out.println("thong tin account thu "+(i+1)+" la");
				System.out.println("email: "+accounts[i].email);
				System.out.println("fullname: "+accounts[i].fullname);
				System.out.println("phong ban: "+accounts[i].department.name);
				i++;
			
		} while (i<accounts.length);
// q17-14
		System.out.println("q17-14");
		i=0;
		do {
			if (accounts[i].id<4) {
				System.out.println("thong tin account thu "+(i+1)+" la");
				System.out.println("Email: " + accounts[i].email);
				System.out.println("Fullname: " + accounts[i].fullname);
				System.out.println("Department: " + accounts[i].department.name);
				
			}
			i++;
		} while (i<accounts.length);
//q17-15
		System.out.println("q17-15");
		i=2;
		do {
			System.out.println(i);
			i=i+2;
		} while (i<=20);
		
		
		
}
}
