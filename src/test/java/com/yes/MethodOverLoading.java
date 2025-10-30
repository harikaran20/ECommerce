package com.yes;

public class MethodOverLoading {
	public void empDetails() {
		System.out.println("Method Over Loading");

	}

	private void empDetails(String Name) {
		System.out.println("The employee name is" + Name);

	}
	private void empDetails(int age) {
		System.out.println("The employee age is" + age);

	}
	
	private void empDetails(char gender) {
		System.out.println("The employee gender is" + gender);
	}
	
	private void empDetails(float tenthPer) {
		System.out.println("The employee sslc per is" + tenthPer);

	}
	
	private void empDetails(double twelthper) {
		System.out.println("The employee 12th per is" + twelthper);
	

	}
	
	private void empDetails(boolean sex) {
		System.out.println("The employee sex is Male" + sex);

	}
	private void empDetails(String comName, int compnum, String compStatus) {
		System.out.println("The employee company name,company number,comapany status:   " + comName +" "+ compnum+"  "+compStatus);
		
		    
	}
	
	
	public static void main(String[] args) {
		MethodOverLoading mol = new MethodOverLoading();
		mol.empDetails();
		mol.empDetails("John");
		mol.empDetails(25);
		mol.empDetails('M');
		mol.empDetails(7.12345678901234567);
		mol.empDetails(73.1111111111111111111111111111111);
		mol.empDetails(true);
		mol.empDetails("Kalpas", 789, "WIN");
	}
	
	
}
