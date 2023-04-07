package org.college;



public class College {
	private void collegeName() {
		System.out.println("kcg");
	}
	private void collegeCode() {
		System.out.println("3456");
	}
	private void collegeRank() {
		System.out.println("75");
	}
	public static void main(String[] args) {
		College cInfo = new College();
		cInfo.collegeName();
		cInfo.collegeCode();
		cInfo.collegeRank();
		Student sInfo = new Student();
		sInfo.studentName();
		sInfo.studentId();
		sInfo.studentDept();
		Hostel hInfo = new Hostel();
		hInfo.hostelName();	
		Dept dInfo = new Dept();
		dInfo.deptName();		
		
		

	}

}
