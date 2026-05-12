package com.tka.may_07;

public class CrudStuMain {
	
	public static void main(String[] args) {
		
		System.out.println("1.Create, 2.Read , 3.Update, 4.Delete ");
		
	int ch= 1;
		
		CrudStu st = new CrudStu();
		
		switch (ch) {
		case 1:
			st.create();
			break;
			
		case 2:
			st.read();
			break;
			
		case 3:
			st.update();
			break;	

		case 4:
			st.delete();
			break;	
			
		default:
			System.out.println("Invalid Option");
			break;
		}
	}

}
