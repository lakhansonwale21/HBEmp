package com.tka.may_07;


class CrudEmpMain {
	public static void main(String[] args) {
		
		System.out.println("1.Create, 2.Read , 3.Update, 4.Delete ");
		
		int ch= 3;
		
		CrudEmp emp = new CrudEmp();
		
		switch (ch) {
		case 1:
			emp.create();
			break;
			
		case 2:
			emp.read();
			break;
			
		case 3:
			String str=emp.update();
			System.out.println(str);
			break;	

		case 4:
			emp.delete();
			break;	
			
		default:
			System.out.println("Invalid Option");
			break;
		}
	}

}
