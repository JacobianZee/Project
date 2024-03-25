package testingthingsnje;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	double checkDifficulty(String filename) {
		//we must match it with this format of regex
		String timeDifficulty = "\\d{1,2}h\\d{2}@\\d+(\\.\\d+)?";		
		Pattern pattern = Pattern.compile(timeDifficulty);
		double countDifficulty = 0;
		
		File filepath = new File(filename);
		try {
			//We will be reading from the file itself
			//this is ultimately our input
			Scanner scan  = new Scanner(filepath);
			Matcher matcher; 
			
			String input = "";
			//checks if there is a next line in the file			
			while(scan.hasNext()) {				
				//reads an individual line in the file
				input = scan.nextLine();
				//make sure the pattern of the input matches the one defined above
				matcher = pattern.matcher(input);
				//an Array to store the sum of the difficulty
				String[] parts = input.split("@");
				//if the pattern matches 
				if(matcher.matches()) {
					countDifficulty += Double.parseDouble(parts[1]);
				}		
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return countDifficulty;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		System.out.println(main.checkDifficulty("ScheduleInfo.txt"));

	}

}
