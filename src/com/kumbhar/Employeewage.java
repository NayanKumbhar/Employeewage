package com.kumbhar;

public class Employeewage {

	private static final int WAGE_PER_HR = 20;
	private static final int FULL_DAY_HR = 8;
	private static final int PART_TIME_HR = 4;
	private static final int IS_FULL_TIME = 1;
	private static final int DAYS_IN_MONTH = 20;
	private static int totalWage = 0;
	private static int totalWageMonth = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Employee Wage Computation Program");
		
		// uc1- check attendance
		
		int check_attendance = (int)Math.floor(Math.random()*10)%2;
		if(check_attendance==1) {
			
			int IS_FULL_TIME = (int)Math.floor(Math.random()*10)%2;
			if(IS_FULL_TIME==1) {
				System.out.println("Employee is full time");
				totalWage = WAGE_PER_HR*FULL_DAY_HR;
				System.out.println("Total Wage per day is=" + totalWage);
				totalWageMonth = totalWage*DAYS_IN_MONTH;
				System.out.println("TOtal wage per month="+totalWageMonth);
				
			}else {
				System.out.println("Employee is part time");
				totalWage = WAGE_PER_HR*PART_TIME_HR;
				System.out.println("Total Wage Per day="+totalWage);
				totalWageMonth = totalWage*DAYS_IN_MONTH;
				System.out.println("TOtal wage per month="+totalWageMonth);
				
			}
			//uc-2-Employeedailywage
		}else
		{
			System.out.println("Employee is absent");
			System.out.println("total wage per day="+totalWage);
			System.out.println("Total wage per month="+totalWageMonth);

		}
		
	}

}
