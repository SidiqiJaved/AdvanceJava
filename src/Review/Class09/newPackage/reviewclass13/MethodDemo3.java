package Review.Class09.reviewclass13;

public class MethodDemo3 {

	
	
	// int we specify the dataType that method will return
	
	// squetheNumber name of the method
	//(int number) paramters of the method
	//return tell java waht to return from this method
	
	
	int squareTheNumber(int number) {
		
		
		return number * number;
		
	}
	
	
	int returnTheSameNumber(int number) {
		return number;
		
	}
	
	
	String getproperAnimalName(String expertName, String animalName) {
		
		if ("Teyfur".equals(expertName) && "Horse".equals(animalName)){
			return"camel";
			
		
		}else if ("Horse".equals(animalName)) {
			return"Horse";
		}else {
			return "I am not sure";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		MethodDemo3 obj=new MethodDemo3();
		
		int result2= obj.returnTheSameNumber(5); /// will print 5
		
		int result1 = obj.squareTheNumber(5); // print 25
		
		System.out.println(result2); /// will print 5
		
		System.out.println(result1); // print 25 
		
		System.out.println(obj.getproperAnimalName("Teyfur", "Horse")); 
		System.out.println(obj.getproperAnimalName("Mike", "Horse")); 
		System.out.println(obj.getproperAnimalName("Mike", "Monkey")); 
		
		
		
		
		
		
	}

}
