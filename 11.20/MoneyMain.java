// import java.text.DecimalFormat;

// public class MoneyMain {
   
//    static String[] dataSource = { "B5", "Q", "B20", "Q", "N", "P", "D" };//Added amounts of coins
//    static Money[] wallet = new Money[dataSource.length];  //Using abstaract class Money we create a Money array with the length of datasource
   
//    public static void main (String[] args) {
            
//       for (int i=0;i<dataSource.length;i++){ //less than the length
//          char dataItem = dataSource[i].charAt(0); //dataitem points to the an individual string, starts at char0 so the letter hence the coin name"Q","P"
//          if (dataItem == 'B') {
//             int billValue= Integer.parseInt(dataSource[i].substring(1,dataSource[i].length())); 
//             //So we parse the string as an integer with it being called on the current string with it being on the number not the string, which is why it's "1" and not "0"
//             wallet[i]= new Bill(billValue); //so that current "i" value holds the newBill witht he value of the bill
//          }   
//          else
//             if(dataItem == 'Q')
//                wallet[i]=new Quarter();
      
//          else
//             if (dataItem == 'P')
//                wallet[i]=new Penny();
         
//          else
//             if  (dataItem == 'N')
//                wallet[i]=new Nickel();
         
//          else
//             if  (dataItem == 'D')
//                wallet[i]=new Dime();
         
//       printWallet();
//       sumWallet();
//    }
//    }

//   public static void sumWallet() {
// 		double sum = 0;
// 		for (int i = 0; i < wallet.length; i++) {
			
// 			if (wallet[i] instanceof Coin) {
// 				sum += wallet[i].getValue() / 100.0;
// 			}
// 			else {
// 				sum += wallet[i].getValue();
// 			}
			
// 		}
// 		// Rounds up
// 		String trunc1 = String.format("%.2f", sum);
		
// 		// Does not round
// 		DecimalFormat df = new DecimalFormat("#.00");
// 		String trunc2 = df.format(sum);
		
// 		System.out.println("The sum is: " + sum);
		
// 	}
//       public static void sumWallet2() {
// 		int sum = 0;
// 		for (int i = 0; i < wallet.length; i++) {
// 			if (wallet[i] instanceof Bill) {
// 				sum+= wallet[i].getValue() * 100;
// 			}
// 			else {
// 				sum += wallet[i].getValue();
// 			}
// 		}
// 		System.out.println("The sum is: " + sum/100.0);
// 	}
//    public static void printWallet () {
//       for (int i=0;i<wallet.length;i++) {
//       //    if (wallet[i] instanceof Bill)
//       //       System.out.println("$ "+((Bill)wallet[i]).getValue()+".00");
//       //    else
//             System.out.println(wallet[i]); //goes through the array and prints the strings, which uses their respective "toString" methods to print out!
         
//       }
//    }
// }

import java.text.DecimalFormat;

public class MoneyMain {

	static String[] dataSource = { "B5", "Q", "B20", "Q", "N", "P", "D" };
	static Money[] wallet = new Money[dataSource.length];

	public static void main(String[] args) {

		for (int i = 0; i < dataSource.length; i++) {
			char dataItem = dataSource[i].charAt(0);
			if (dataItem == 'B') {
				int billValue = Integer.parseInt(dataSource[i].substring(1, dataSource[i].length()));
				wallet[i] = new Bill(billValue);
			} else if (dataItem == 'Q')
				wallet[i] = new Quarter();
			else if (dataItem == 'N')
				wallet[i] = new Nickel();
			else if (dataItem == 'D')
				wallet[i] = new Dime();
			else if (dataItem == 'P')
				wallet[i] = new Penny();
		}
		printWallet();
		sumWallet2();
	}

	public static void printWallet() {
		for (int i = 0; i < wallet.length; i++) {
			System.out.println(wallet[i]);
			//System.out.println(wallet[i].toString());

		}
	}
	
	public static void sumWallet2() {
		int sum = 0;
		for (int i = 0; i < wallet.length; i++) {
			if (wallet[i] instanceof Bill) {
				sum+= wallet[i].getValue() * 100;
			}
			else {
				sum += wallet[i].getValue();
			}
		}
		System.out.println("The sum is: " + sum/100.0);
	}
	
	public static void sumWallet() {
		double sum = 0;
		for (int i = 0; i < wallet.length; i++) {
			
			if (wallet[i] instanceof Coin) {
				sum += wallet[i].getValue() / 100.0;
			}
			else {
				sum += wallet[i].getValue();
			}
			
		}
		// Rounds up
		String trunc1 = String.format("%.2f", sum);
		
		// Does not round
		DecimalFormat df = new DecimalFormat("#.00");
		String trunc2 = df.format(sum);
		
		System.out.println("The sum is: " + sum);
		
	}
	
}
