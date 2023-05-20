class StudentBillCalculation{
	void getStudentMarks(String name, int rollNo, int scienceMarks, int socialMarks, int mathMarks){
		int totalMarks;
		totalMarks = scienceMarks + socialMarks + mathMarks;
		System.out.println("Your total Marks: "+ totalMarks);
		int avg;
		avg = totalMarks/3;
		System.out.println("Your average is: "+ avg);
		if(avg > 70){
			System.out.println("You get an A!");
		}
		else if(avg < 70 && avg > 50){
			System.out.println("You get a B!");
		}
		else{
			System.out.println("You get a C!");
		}
	}

	static void getBillCalculate(String prodName, int prodCost, int prodQuantity){
		System.out.println("Product Name: " + prodName);
		int totalAmount;
		totalAmount = prodCost * prodQuantity;
		int discount;
		discount = totalAmount * 10/100;
		int finalPrice;
		finalPrice = totalAmount - discount;
		System.out.println("Your product name: "+ prodName + " Your total cost: "+ totalAmount + " Your 10% discount is : " + discount + " Your final price : "+ finalPrice);

	}
	public static void main(String[] args){
		StudentBillCalculation student = new StudentBillCalculation();
		student.getStudentMarks("Shubha", 8657, 50, 60,74);
		student.getStudentMarks("Makinley", 8668, 44, 69,100);
		student.getStudentMarks("Alyssa", 8679, 48, 62,47);
		student.getStudentMarks("Aruna", 8680, 47, 54,85);
		student.getStudentMarks("Sushil", 8694, 74, 32,11);
		System.out.println("**************************");

		StudentBillCalculation.getBillCalculate("Calculator", 30,4);
		StudentBillCalculation.getBillCalculate("Clothes", 4,60);
		StudentBillCalculation.getBillCalculate("Table", 30,60);
		StudentBillCalculation.getBillCalculate("Books", 70,40);

	}
}