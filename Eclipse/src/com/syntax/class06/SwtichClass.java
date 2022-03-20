package com.syntax.class06;

public class SwtichClass {

	public static void main(String[] args) {

		
		int day=6;
	
		String dayName;
		
		if (day==1) {
			dayName="Monday";
		}else if (day==2){
			dayName="Tuesday";
		}else if (day==3) {
			dayName="Wed";
		}else if (day==4) {
			dayName="thursday";
		}else if (day==5) {
			dayName="Friday";
		}else if (day==6) {
			dayName="Saturday";
		}else if (day==7) {
			dayName="Sunday";
		}else {
			dayName="Invalid Day";
		}
	System.out.println(dayName);	
	
	
	
	
System.out.println("");	
	System.out.println("");
	System.out.println("   SWITCH STATMENT     ");
	
	System.out.println("");	
	System.out.println("");
	
	switch (day) {
	
	case 1:
	dayName="Monday";
	break;
	
	case 2:
		dayName="Tuesday";
		break;
	case 3:
		dayName="Wend";
		break;
	case 4:
		dayName="Thursday";
		break;
	case 5:
		dayName="Friday";
		break;
	case 6:
		dayName="Saturday";
		break;
	case 7:
		dayName="Sunday";
		break;
	
	
	
	
	
	
	
	
	}
	System.out.println(dayName);
	
	
	
	

	}
}
