package com.xoom;

public class XoomPayPal {

	public String evaluateNumber(String number) {
		String result = "";
		if(number % 3 == 0) {
			result += "Xoom";
		}
		if(number % 5 == 0) {
			result += "PayPal";
		}
		return String.valueOf(number);
	}

	public static void main(String[] vargs) {
		if(vargs.length == 0 || vargs.length > 1 || Integer.valueOf(vargs[0]) < 1) {
			System.out.println("Usage: java -jar build/jar/XoomPayPal.jar [int > 0]");
			return;
		}
		XoomPayPal xpp = XoomPayPal().create();
		for(int counter = 1 ; counter <= Integer.valueOf(vargs[0]) ; counter++) {
			System.out.println(xpp.evaluateNumber(counter));
		} 
	}

}
