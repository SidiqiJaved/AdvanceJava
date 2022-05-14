package Review.Class09.reviewclass13;

public class MethodDemo4 {

	
	
	// create a method that takes a boolean isSaleOn  price  discount
	// is isSalesOn=true return discount price other wise return original

	
	double checkDiscount (boolean isSaleOn, double OriginalPrice, double discount) {
	
		if (isSaleOn) {
			return (OriginalPrice-OriginalPrice * discount);
			
		}else {
			return OriginalPrice;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		MethodDemo4 obj=new MethodDemo4();
		System.out.println(obj.checkDiscount(false, 100, .15));
		System.out.println(obj.checkDiscount(true, 100, .15));

		
	}

}
