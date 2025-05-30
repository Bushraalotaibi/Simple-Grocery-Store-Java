package Applecation12;

import java.util.Scanner;

public class Applecation12 {

	private static String bill;

	public static void v(String args[]) {

		Scanner input = new Scanner(System.in);
        String bill = "";
        int total = 0;
		Products p1 = new Products();
		p1.name = "tea";
		p1.id = "15247";
		p1.price = 5;
		p1.shelfNumber = 3;

		Products p2 = new Products();
		p2.name = "milk";
		p2.id = "13597";
		p2.price = 10;
		p2.shelfNumber = 4;

		Products p3 = new Products();
		p3.name = "cola";
		p3.id = "15863";
		p3.price = 4;
		p3.shelfNumber = 2;

		Products p4 = new Products();
		p4.name = "coffee";
		p4.id = "12597";
		p4.price = 3;
		p4.shelfNumber = 4;

		Products p5 = new Products();
		p5.name = "chocolate";
		p5.id = "17896";
		p5.price = 4;
		p5.shelfNumber = 2;

		// نطلب من المستخدم يدخل 2 او 1

		Products[] x = { p1, p2, p3, p4, p5 };

		System.out.print("Enter one to buy or two to search : ");

		int option = input.nextInt();
		if (option == 1) {
			int i = 1;
			for (Products p : x) {
				System.out.println(i + ")" + p.name + "         " + p.price);
				i++;

			}
			while (true) {
           System.out.print("Enter number of product that you want to buy -1 to end : ");
			int productsNumber = input.nextInt();
		    if (productsNumber == -1) {
		     break;
	
		    	
		    }
		    System.out.print("Enter quantity : ");
		    int quantity = input.nextInt();
		    
		    bill += "product name : "+x[productsNumber-1].name+"     price :  "+ x[productsNumber-1].price+"quantity :"+quantity+"\n";
			total +=quantity*x[productsNumber-1].price;
			System.out.println("----------------------------------");
			}
			
		System.out.println("bill"); 
		System.out.println("------------------------------");
		System.out.println("total : "+total+" $ "); }
		else if (option == 2) {  
		input.nextLine();
        System.out.println("Enter product name : ");
        String name = input.nextLine();
        boolean se = true;
        for(Products p: x) {
        	if(p.name.equalsIgnoreCase(name)) {
        		System.out.println("name : "+p.name+"  price : "+p.price+"shelf number : "+p.shelfNumber);
        		se = false;
        		break;
        }}
        if (se) {
        	System.out.println("does not exist");
        }
        
		} else {

			System.out.println("Error");

		}

		input.close();

	}
}
