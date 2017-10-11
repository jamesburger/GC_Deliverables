import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class TimeDeliverable {
public static void main(String[] args){
	Scanner scnr = new Scanner(System.in);
	// Class that lets me accept a date input from a string
	SimpleDateFormat myFormat = new SimpleDateFormat("MM/dd/yyyy");
	String inputString1 = "";
	String inputString2 = "";

	try {
		//Section for input and assignment of given input to variables 
		System.out.println("Please enter any given date (mm/dd/yyyy)");
		inputString1 = scnr.nextLine();
		System.out.println("Please enter a second given date (mm/dd/yyyy)");
		inputString2 = scnr.nextLine();
		
		//Using the SDF I can take the user input strings and convert them into date variables
	    Date date1 = myFormat.parse(inputString1);
	    Date date2 = myFormat.parse(inputString2);
	    
	    //Creates a variable that is the difference between the first and second dates
	    long diff = date2.getTime() - date1.getTime();
	    //Calls the Calendar class which allows me to relate the input data with actual calendar time. 
	    Calendar cal1 = Calendar.getInstance();
	    //Takes the difference in milliseconds from the diff variable and assigns a calendar value to it (actual dates)
	    cal1.setTimeInMillis(diff);
	    
	    //Variables that call the difference from the diff variable and converts it into years, months, days
	    int year = cal1.get(Calendar.YEAR) - 1970;
	    int month = cal1.get(Calendar.MONTH);
	    int day = cal1.get(Calendar.DATE);
	    
	    System.out.println("Difference between " + date1 + " and " + date2 + " is: ");
	    System.out.println("Years: " + year);
	    System.out.println("Months: " + month);
	    System.out.println("Days: " + day);
	    
	} catch (Exception e) {
	    System.out.println("ERROR");
	}
}
}
