import java.util.Scanner;

//Kadir PEKDEMÝR 150121069
//This program calculates invoices.

public class HW4_Q1_150121069 {

		
	public static double [] calculateTheInvoice (double[] flats, double totalBill) {
		    //Calculate 30 percent
			double a = totalBill*0.3/flats.length;
			//Calculate 70 percent
	    	double b = totalBill*0.7;
	    	
	    	//Add up your electricity expenses
	    	double c = 0;
	    	for(int i = 0; i < flats.length; i++) {
	    		c +=flats[i];
	    	} 
	    	
	    	double d = b/c;
	    	//Bill an apartment has to pay
	    	double[] bills = new double[flats.length];
	    	for(int j = 0; j < flats.length; j++) {
	    		 bills[j] = a+(d*flats[j]);
	    	}
	    	return bills;
	    	
		}
		public static void printBills (double[] bills) {
			
			
			//Print the invoice
			for(int i = 0; i < bills.length; i++) {
				System.out.println("Flat #"+""+(i+1)+": "+ (int)(bills[i]*100)/100.0);
			}
			
		}
	    

		public static void main(String[] args) {
			//Create Scanner
			Scanner input = new Scanner(System.in);
			int N = input.nextInt();
			//Create array
			double[] flats = new double[N];
			
			for (int i = 0; i < flats.length; i++) {
				flats[i] = input.nextDouble();
			}
			double totalBill = input.nextDouble();
			
			
	    	//Call methods
	    	 double[] bills = calculateTheInvoice ( flats, totalBill);
	    	printBills(bills);
		}


}
