package com.kumbhar;

public class Employeewage {

	private static final int WAGE_PER_HR = 20;
	private static final int FULL_DAY_HR = 8;
	private static int totalWage = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Employee Wage Computation Program");
		
		// uc1- check attendance
		
		int check_attendance = (int)Math.floor(Math.random()*10)%2;
		if(check_attendance==1) {
			System.out.println("Employee is Present");
			totalWage = WAGE_PER_HR*FULL_DAY_HR;
			System.out.println("Total Wage per day is=" + totalWage);
		}else
		{
			System.out.println("Employee is absent");
			System.out.println("total wage="+totalWage);

		}
		
	}

}
