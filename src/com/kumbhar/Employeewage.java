package com.kumbhar;

public class Employeewage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program");
		// uc1- check attendance
		int check_attendance = (int)Math.floor(Math.random()*10)%2;
		if(check_attendance==1) {
			System.out.println("Employee is Present");
		}else {
			System.out.println("Employee is absent");
		}
	}

}
