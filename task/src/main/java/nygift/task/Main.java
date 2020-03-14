package nygift.task;

import java.util.Scanner;

public class Main {	

	public static void main(String[] args) {

	int total=0;

	NewYearGifts object;

	System.out.println("Menu");
	System.out.println("1. DairyMilk");
	System.out.println("2. Kitkat");
	System.out.println("3. Milkybar");
	System.out.println("4. Ladoo");
	System.out.println("5. Rasgulla");
	System.out.println("6. Halwa");
	System.out.println("7. List of gifts and their weights");
	System.out.println("8. Exit");

	while(true) {
	System.out.println("Enter your choice (1-8):");

	try {
		Scanner sc=new Scanner(System.in);

	switch(sc.nextInt())
	{

	case 1: 
			System.out.println("Enter the weight :");
			object=new DairyMilk();
			 total=object.weightOfGift(sc.nextInt());
			System.out.println("The total weight is :"+total);
			break;

	case 2: 
			System.out.println("Enter the weight :");
			object=new Kitkat();
			 total=object.weightOfGift(sc.nextInt());
			System.out.println("The total weight is :"+total);
			break;

	case 3: 

			System.out.println("Enter the weight :");
			object=new Milkybar();
			 total=object.weightOfGift(sc.nextInt());
			System.out.println("The total weight is :"+total);
			break;

	case 4: 
			System.out.println("Enter the weight :");
			object=new Ladoo();
			 total=object.weightOfGift(sc.nextInt());
			System.out.println("The total weight is :"+total);
			break;;

	case 5: 
			System.out.println("Enter the weight :");
			object=new Rasgulla();
			 total=object.weightOfGift(sc.nextInt());
			System.out.println("The total weight is :"+total);
			break;

	case 6: 
			System.out.println("Enter the weight :");
			object=new Halwa();
			 total=object.weightOfGift(sc.nextInt());
			System.out.println("The total weight is :"+total);
			break;

	case 7:	
			System.out.println("The list of each gift weights as follows : ");
	    		System.out.println("DairyMilk: "+DairyMilk.wt);
	    		System.out.println("Kitkat: "+Kitkat.wt);
	    		System.out.println("Milkybar: "+Milkybar.wt);
	    		System.out.println("Ladoo:    "+Ladoo.wt);
	    		System.out.println("Rasgulla:    "+Rasgulla.wt)
	    		System.out.println("Halwa:    "+Halwa.wt);
	    		System.out.println("---------------------------");
	    		System.out.println("Total:      "+tot)
	    		System.out.println("---------------------------");
	    		break;

	case 8:
			sc.close();
			System.out.println();	
			System.out.println("Thank you for your gifts...");
			System.out.println("Exited Successfully");
			System.exit(0);

	default: 
			System.out.println("Enter an input (1-8)");
	  }
	}
	catch(Exception e){
		System.out.println("Enter an integer input (1-8)");
	        }
	   }
	}
}
