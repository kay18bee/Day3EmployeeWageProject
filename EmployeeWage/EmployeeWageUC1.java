package EmployeeWage;

import java.util.Random;

public class EmployeeWageUC1 {

		public static void main(String[] args) {
		
			System.out.println("Welcome to Employee Wage computation program.");
			Random r = new Random();
			int attendance = r.nextInt(2);
			if (attendance == 1) 
				{
					System.out.println("Employee is present");
					
			}else {
					System.out.println("Employee is absent");
			}	
		
		}
	
}
