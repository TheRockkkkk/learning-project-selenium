package com.itrace.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.plaf.ProgressBarUI;

import org.omg.PortableServer.POA;

public class VerifyRandomMethods {

	/*public VerifyRandomMethods() throws IOException{

		 Properties prop = new Properties();
		 FileInputStream file = new FileInputStream(
					"/home/hiteshy/workspace/restapi/src/main/java/com/config/config.properties");
			prop.load(file);
	}*/
	
	/* Generated random number */
	public static int randomNumber() {
		Random rand = new Random();
		int a = rand.nextInt(500);
		/*String name ="hitesh";
		System.out.println(name+a);*/
		return a;
	}
	/* Generated random price */
	public static int randomPrice() {
		Random rand = new Random();
		int a = rand.nextInt(500);
		System.out.println(a);
		return a;
	}
	public static int randomPrice2() {
		Random rand = new Random();
		int b = rand.nextInt(100);
		return b;
	}

	/* Generated random quantity */
	public static int randomQuantity() {
		Random rand = new Random();
		int c = rand.nextInt(50);
		return c;
	}
	public static int randomQuantity2() {
		Random rand = new Random();
		int d = rand.nextInt(50);
		return d;
	}

	/* Generated random gtin */

	public static String randomGtin() {

		String[] arr = { "10019320029469", "10037100932747", "10070222927895",
		"10071833054628" };
		Random r = new Random();
		int randomNumber = r.nextInt(arr.length);
		return arr[randomNumber];
	}

	/* Generated random gtin 2 */
	public static String randomGtin2() {
		/*products for admin@distributor1.com

		String[] arr = { "10071833054628", "10071146002484",
				"10075391957001", "10048800155862", "10037597501204" };*/
		String[] arr = { "10071146002484", 
				"10075391957001", "10048800155862", "10037597501204" };
		Random r = new Random();
		int gtin = r.nextInt(arr.length);

		return arr[gtin];
	}

	/* Generated random vendor */
	public static String randomVendor() {
		/*admin@distributor1.com - Vendor1=120019243, Vendor2=120019244, Vendor3=120019245, Vendor4=120019345
		String[] arr = { "120019243", "120019244", "120019245", "120019345" };*/
		String[] arr1 = { "777777771", "777777772", "777777776", "777777773" };

		Random r = new Random();
		int vendor = r.nextInt(arr1.length);
		//System.out.println(arr1[vendor]);
		return arr1[vendor];
	}

	/* Generated random locations for admin@distributor1.com buyer
	public static String randomLocations(String vendor) {

		String[] arr = { "101277791", "101277792", "101277793", "101277794",
				"121277799" };		
		if (vendor.equals("120019243")) {
			System.out.println(arr[0]);
			return arr[0];
		} else if (vendor.equals("120019244")) {
			System.out.println(arr[1]);
			return arr[1];
		}
		else if (vendor.equals("120019245")){
			System.out.println(arr[2]);

			return arr[2];
		}
		else if (vendor.equals("120019345")){
			System.out.println(arr[3]);

			return arr[3];
		}		
		else{
			System.out.println("Location not found");
			return null;
		}
	}*/

	/* Generated random locations for admin@distributor1.com buyer*/
	public static String randomLocation(String vendor) {

		String[] arr = { "449944990", "55445544", "449944992", "221122122",
		};		
		if (vendor.equals("777777771")) {
			System.out.println(arr[0]);
			return arr[0];
		} else if (vendor.equals("777777772")) {
			System.out.println(arr[1]);
			return arr[1];
		}
		else if (vendor.equals("777777776")){
			System.out.println(arr[2]);

			return arr[2];
		}
		else if (vendor.equals("777777773")){
			System.out.println(arr[3]);

			return arr[3];
		}		
		else{
			System.out.println("Location not found");
			return null;
		}
	}

	/* Generated random poName */
	public static String randPOName() {
		int n = 10;
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//Random rnd = new Random();
		StringBuilder sb = new StringBuilder(n);
		for (int i = 0; i < n; i++) {

			// generate a random number between
			// 0 to AlphaNumericString variable length
			int index = (int) (AlphaNumericString.length() * Math.random());

			// add Character one by one in end of sb
			sb.append(AlphaNumericString.charAt(index));
		}	

		return sb.toString();
	}

	/* Generated random date */

	public static String randomDate() {

		String formattedDate=null;
		try{
		Date startDate = new Date(); // start date
		Calendar endCal = Calendar.getInstance();
		endCal.setTime(startDate);
		endCal.add(Calendar.DATE, 20);

		long randomEpochDay = ThreadLocalRandom.current()
				.longs(startDate.getTime(), endCal.getTimeInMillis()).findAny()
				.getAsLong();
		String poDate = getDate(new Date(randomEpochDay)); // random date
		// between range
		System.out.println(poDate);
	    SimpleDateFormat sdfIn = new SimpleDateFormat("yyyymmdd");
	    SimpleDateFormat sdfOut = new SimpleDateFormat("mm/dd/yyyy");

	    String input = poDate;
	    Date date = sdfIn.parse(input);
	    System.out.println(sdfOut.format(date));
	    formattedDate = sdfOut.format(date);
	  // System.out.println(newdateString);
		}
		catch (ParseException e){
			e.printStackTrace();
		}
		return formattedDate;

	}

	public static String getDate(Date date) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		String strDate = formatter.format(date);
		return strDate;	}
	
	/* Generated current timestamp */

	public static String currentTimeStamp(){
		
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date()).replace(".", "");
		System.out.println(timeStamp);
		String abcString=timeStamp.substring(4);
        return abcString;
	}
	
	public static void main(String[] args) throws ParseException   {

		VerifyRandomMethods.randomDate();
		//VerifyRandomMethods.randomLocation("777777773");  
		//VerifyRandomMethods.randomQuantity();
		//VerifyRandomMethods.randomVendor();		
		/*VerifyRandomMethods.randomLocations("120019243");
		VerifyRandomMethods.randomLocations("120019244");
		VerifyRandomMethods.randomLocations("120019245");
		VerifyRandomMethods.randomLocation("777777772");  */
		// VerifyRandomMethods.getDate();
		// System.out.println(a);
		// System.out.println();
		//VerifyRandomMethods.randomGtin();
		//VerifyRandomMethods.randomGtin2();

	}
}
