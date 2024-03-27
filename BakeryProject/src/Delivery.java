
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Delivery {	
	
	public void delivery(String paymentsDelivaries, String paymentsBank){
		// create a regex
		String delivery = "F (\\d+) (\\d+)";
		String bank = "B (\\d+) (\\d+)";
		//Compile Pattern
		Pattern patternD = Pattern.compile(delivery);
		Pattern patternB = Pattern.compile(bank);
		
		String day = null;
		Integer amount = 0;
		int countMatches = 0;
		
		//Create the matcher of the transactions for both the Delivery and bank
		Matcher matchD = patternD.matcher(paymentsDelivaries);
		Matcher matchB = patternB.matcher(paymentsBank);
		
		//keep on iterating through the string of transactions
		//Adhering to the formats
		while(matchD.find() && matchB.find()) {
			//count the number of matches to verify the number of transactions made
			countMatches++;
			//check if the amounts match and that there was no fraud made
			//if the amount from the bank and the one recorded by the employee is different
			if(!matchD.group(2).equals(matchB.group(2))) {
				//capture the day of the error
				day = matchD.group(1);
				Integer amountD = Integer.parseInt(matchD.group(2));
				Integer amountB = Integer.parseInt(matchB.group(2));
				amount = amountD-amountB;
			}
		}
		System.out.println("Transactions:"+countMatches);
		System.out.println("Error in Day: "+day);
		System.out.println("Amount missing: R"+amount);
		
	}
	
	

	public static void main(String[] args) {		
		String delivaries =  "F 1 439 F 2 605 F 3 476 F 4 765 F 5 382 F 6 599 F 7 732 F 8 21 F 9 617";
		String bankRecords = "B 1 248 B 2 605 B 3 476 B 4 765 B 5 382 B 6 599 B 7 732 B 8 21 B 9 617";
		Delivery d = new Delivery();
		d.delivery(delivaries, bankRecords);		

	}

}
