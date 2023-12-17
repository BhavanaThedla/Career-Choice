
import java.util.*;
import java.lang.Math;

interface Institute{
	void courses();
	void placements();
	void review();
	boolean registration1();
}
class KPHB {
	static Scanner sc=new Scanner(System.in);
	static class CV implements Institute{
	
	public void courses()
	{
		System.out.println("\t\t\t\tThe Course we offered are:");
		System.out.println("\t\t\t\t--------------------------------------------------------------");
		System.out.println("\t\t\t\t|Courses             	     |Duration        |Fee           |");
		System.out.println("\t\t\t\t--------------------------------------------------------------");
		System.out.println("\t\t\t\t|1:Java Full Stack            |6 Months       |35,000/-      |");
		System.out.println("\t\t\t\t--------------------------------------------------------------");
	}
	public void placements()
	{
		System.out.println("\t\t\t\tThe Number of Students placed per year is:");
		System.out.println("\t\t\t\t-------------------------------------------");
		System.out.println("\t\t\t\t|Year           |Number of students placed|");
		System.out.println("\t\t\t\t-------------------------------------------");
		System.out.println("\t\t\t\t|2017           |42                       |");
		System.out.println("\t\t\t\t|2018           |102                      |");
		System.out.println("\t\t\t\t|2019           |267                      |");
		System.out.println("\t\t\t\t|2020           |567                      |");
		System.out.println("\t\t\t\t|2021           |842                      |");
		System.out.println("\t\t\t\t|2022           |487                      |");
		System.out.println("\t\t\t\t|2023           |210                      |");
		System.out.println("\t\t\t\t-------------------------------------------");
	}
	public void review()
	{
		System.out.println("Students about CV Corp:\n");
		System.out.println("Jhansi Pitani:One of the best institute for anyone who want to gain and enhance knowledge.\nAnd coming to faculty they are so skilled and friendly too. Well I can say, you will see a change in yourself\nafter joining here. So I strongly recommend those people who want to go for training and learn, just join CVCORP.\nMark my words this specific institute CVCORP won't let you down.\n");
		System.out.println("SivaKoti Gowtham:CVCorp is an invaluable platform for anyone seeking to enhance their knowledge\n through daily classes and engaging interactions with teachers.\nCVCorp provides an excellent opportunity to learn and grow.\n");		
	}
	boolean payment(){
		System.out.println("Enter your Debit Card Number:");
		String debit = sc.next();
		System.out.println("The total payment is Rs.1000/-\nType Yes if you okay with payment and No if you not");
		String yn = sc.next();
		if(yn.equals("Yes")){
			System.out.println("Your payment process is finished!");
			System.out.println("\t\t\t\tYour registration is successful");
			return true;
		}
		else{
			System.out.println("Your payment process isn't finished!");
			return false;
		}
	}
	boolean form1(){
		System.out.println("Enter your details\n");
		System.out.println("Enter your name:");
		String name =sc.next();
		System.out.println("Enter your branch:");
		String branch = sc.next();
		System.out.println("Enter your passed out year:");
		int year = sc.nextInt();
		System.out.println("Enter your percentage/CGPA:");
		float marks = sc.nextFloat();
		System.out.println("Pay Rs.1000/- for booking your seat in the new batch");
		return payment();
	}
	public boolean registration1()
	{
		System.out.println("Steps for registration\n");
		System.out.println("---------------------------------------------------");
		System.out.println("1:Register by filling the form\n\n2:Talent Test for fee concession\n\n3:New Batch starts from Dec 10\n\n4:Students are passed outs from 2022 and 2023 with 60% Btech percentage and no active backlogs.\n\n5:Pay Rs.1000/- to book your seat.\n");
		System.out.println("----------------------------------------------------");
		System.out.println("Press 1 to fill the form or any other key to exit");
		char ch = sc.next().charAt(0);
		if(ch=='1'){
			return form1();
			
		}
		return false;		
	}
	
			
	
	}
	static class Vcube implements Institute{
	
	public void courses()
	{
		System.out.println("\t\t\t\tThe Courses we offered are:");
		System.out.println("\t\t\t\t--------------------------------------------------------------");
		System.out.println("\t\t\t\t|Courses             	      |Duration       |Fee           |");
		System.out.println("\t\t\t\t--------------------------------------------------------------");
		System.out.println("\t\t\t\t|1:Java Full Stack            |6 Months       |35,000/-      |");
		System.out.println("\t\t\t\t|2:Python Full Stack          |6 Months       |35,000/-      |");
		System.out.println("\t\t\t\t|3:React JS            	      |2 Months       |15,000/-      |");
		System.out.println("\t\t\t\t|4:Power BI            	      |1 Months       |10,000/-      |");
		System.out.println("\t\t\t\t|5:SAP            	      |3 Months       |25,000/-      |");
		System.out.println("\t\t\t\t--------------------------------------------------------------");
	}
	public void placements()
	{
		System.out.println("\t\t\t\t100% Placement guarantee. The Companies we are tie up with:\n");
		System.out.println("\t\t\t\t1:HCL\n\t\t\t\t2:Cognizant\n\t\t\t\t3:Alliance Global Service\n\t\t\t\t4:Accenture\n");
	}
	public void review()
	{
		System.out.println("Students about VCUBE Software Solutions:\n");
		System.out.println("Chakri Sai:I have recently enrolled in a Full Stack Java Course at V Cube Software Solutions and I was\n satisfied with the way of teaching of Our faculty mainly P.V.R sir and Viswanath sir with their experience in teaching.\nThey both made us to understand each topic by providing a clear overview.\nthe approach to teaching was both systematic and interactive, creating an engaging learning environment for all students.\n");
		System.out.println("Vishnu Vardhan Reddy:This is M.Vishnu Vardhan I'm one of V Cube student. Our trainer name is Mr. Srinivas.\nHis way of teaching is very good. He teaches python from scratch so that a non technical student can understand very easily.\nHe has best teaching skills.the way off teaching by srinivas sir is so good.the way of interactive between trainer and students is so good.\n");
	}
	boolean payment(){
		System.out.println("Enter your Debit Card Number:");
		String debit = sc.next();
		System.out.println("The total payment is Rs.1000/-\nType Yes if you okay with payment and No if you not");
		String yn = sc.next();
		if(yn.equals("Yes")){
			System.out.println("Your payment process is finished!");
			System.out.println("\t\t\t\tYour registration is successful");
			return true;
		}
		else{
			System.out.println("Your payment process isn't finished!");
			return false;
		}
	}
	boolean form1(){
		System.out.println("Enter your details\n");
		System.out.println("Enter your name:");
		String name =sc.next();
		System.out.println("Enter your branch:");
		String branch = sc.next();
		System.out.println("Enter your passed out year:");
		int year = sc.nextInt();
		System.out.println("Enter your percentage/CGPA:");
		float marks = sc.nextFloat();
		System.out.println("Pay Rs.1000/- for booking your seat in the new batch");
		return payment();
	}
	public boolean registration1()
	{
		System.out.println("Steps for registration\n");
		System.out.println("---------------------------------------------------");
		System.out.println("1:Register by filling the form\n\n2:Talent Test for fee concession\n\n3:New Batch starts from Dec 10\n\n4:Students are passed outs from 2022 and 2023 with 60% Btech percentage and no active backlogs.\n\n5:Pay Rs.1000/- to book your seat.\n");
		System.out.println("----------------------------------------------------");
		System.out.println("Press 1 to fill the form or any other key to exit");
		char ch = sc.next().charAt(0);
		if(ch=='1'){
			return form1();
			
		}
		return false;		
	}
	
	}
	static class Jspiders implements Institute{
	static Scanner sc=new Scanner(System.in);
	public void courses()
	{
		System.out.println("\t\t\t\tThe Courses we offered are:");
		System.out.println("\t\t\t\t--------------------------------------------------------------");
		System.out.println("\t\t\t\t|Courses             	  |Duration       |Fee           |");
		System.out.println("\t\t\t\t--------------------------------------------------------------");
		System.out.println("\t\t\t\t|1:Java Full Stack            |6 Months       |40,000/-      |");
		System.out.println("\t\t\t\t|2:Python Full Stack          |6 Months       |40,000/-      |");
		System.out.println("\t\t\t\t|3:Web Development            |3 Months       |25,000/-      |");
		System.out.println("\t\t\t\t|4:AWS            	  |3 Months       |30,000/-      |");
		System.out.println("\t\t\t\t|5:Data Science               |8 Months       |60,000/-      |");
		System.out.println("\t\t\t\t--------------------------------------------------------------");
	}
	public void placements()
	{
		System.out.println("\t\t\t\tThe number of students we got placed into:");
		System.out.println("\t\t\t\t--------------------------------------------------------------");
		System.out.println("\t\t\t\tLess than 60% in Degree ---> 27688\n\t\t\t\tNon-IT\t\t\t---> 115824\n\t\t\t\tIT/CS/IS\t\t---> 145096\n\t\t\t\tThroughout 60%\t\t---> 241404\n"); 
	}
	public void review()
	{
		System.out.println("Students about J-Spider:\n");
		System.out.println("Barsha Das:I literally had the best experience here. Couldn't ask for more. The teacher, their teaching everything is up to the mark.\nIt doesn't matter if you are a beginner or from some other stream they'll make you a pro level coder in no time.\nI, myself wasn't very good at coding but now I'm able to understand the question and can write a long code.\nWant to learn coding? Go for Jspiders.\n");
		System.out.println("Praharsha:The way they train and teach the students are amazing. Every trainer's dedication and enthusiastic teaching is appreciable.\nEach and every person working there is dedicated to there work. I have been trained and placed by them at InspireInfoSol Pvt. Ltd.\n");
	}
	 boolean payment(){
		System.out.println("Enter your Debit Card Number:");
		String debit = sc.next();
		System.out.println("The total payment is Rs.1000/-\nType Yes if you okay with payment and No if you not");
		String yn = sc.next();
		if(yn.equals("Yes")){
			System.out.println("Your payment process is finished!");
			System.out.println("\t\t\t\tYour registration is successful");
			return true;
		}
		else{
			System.out.println("Your payment process isn't finished!");
			return false;
		}
	}
	boolean form1(){
		System.out.println("Enter your details\n");
		System.out.println("Enter your name:");
		String name =sc.next();
		System.out.println("Enter your branch:");
		String branch = sc.next();
		System.out.println("Enter your passed out year:");
		int year = sc.nextInt();
		System.out.println("Enter your percentage/CGPA:");
		float marks = sc.nextFloat();
		System.out.println("Pay Rs.1000/- for booking your seat in the new batch");
		return payment();
	}
	public boolean registration1()
	{
		System.out.println("Steps for registration\n");
		System.out.println("---------------------------------------------------");
		System.out.println("1:Register by filling the form\n\n2:Talent Test for fee concession\n\n3:New Batch starts from Dec 10\n\n4:Students are passed outs from 2022 and 2023 with 60% Btech percentage and no active backlogs.\n\n5:Pay Rs.1000/- to book your seat.\n");
		System.out.println("----------------------------------------------------");
		System.out.println("Press 1 to fill the form or any other key to exit");
		char ch = sc.next().charAt(0);
		if(ch=='1'){
			return form1();
			
		}	
		return false;	
	}
	
	}
	static class Quality implements Institute{
	static Scanner sc=new Scanner(System.in);
	public void courses()
	{
		System.out.println("\t\t\t\tThe Courses we offered are:");
		System.out.println("\t\t\t\t--------------------------------------------------------------");
		System.out.println("\t\t\t\t|Courses             	  |Duration       |Fee           |");
		System.out.println("\t\t\t\t--------------------------------------------------------------");
		System.out.println("\t\t\t\t|1:Web Development            |3 Months       |25,000/-      |");
		System.out.println("\t\t\t\t|2:Python Full Stack          |6 Months       |30,000/-      |");
		System.out.println("\t\t\t\t|3:Testing Tools              |3 Months       |25,000/-      |");
		System.out.println("\t\t\t\t|4:AWS            	   |3 Months       |30,000/-      |");
		System.out.println("\t\t\t\t|5:Data Analytics             |4 Months       |35,000/-      |");
		System.out.println("\t\t\t\t--------------------------------------------------------------");
	}
	public void placements()
	{
		System.out.println("\t\t\t\tWe Quality Thought provide Placements for every student as possible as..\n"); 
	}
	public void review()
	{
		System.out.println("Students about Quality Thought Solutions:");
		System.out.println("Sagar:Best institute to learn testing tools for a quick job. Nani sir is the best trainer to teach API and api automation testing\n");
	}
	boolean payment(){
		System.out.println("Enter your Debit Card Number:");
		String debit = sc.next();
		System.out.println("The total payment is Rs.1000/-\nType Yes if you okay with payment and No if you not");
		String yn = sc.next();
		if(yn.equals("Yes")){
			System.out.println("Your payment process is finished!");
			System.out.println("\t\t\t\tYour registration is successful");
			return true;
		}
		else{
			System.out.println("Your payment process isn't finished!");
			return false;
		}
	}
	boolean form1(){
		System.out.println("Enter your details\n");
		System.out.println("Enter your name:");
		String name =sc.next();
		System.out.println("Enter your branch:");
		String branch = sc.next();
		System.out.println("Enter your passed out year:");
		int year = sc.nextInt();
		System.out.println("Enter your percentage/CGPA:");
		float marks = sc.nextFloat();
		System.out.println("Pay Rs.1000/- for booking your seat in the new batch");
		return payment();
	}
	public boolean registration1()
	{
		System.out.println("Steps for registration\n");
		System.out.println("---------------------------------------------------");
		System.out.println("1:Register by filling the form\n\n2:Talent Test for fee concession\n\n3:New Batch starts from Dec 10\n\n4:Students are passed outs from 2022 and 2023 with 60% Btech percentage and no active backlogs.\n\n5:Pay Rs.1000/- to book your seat.\n");
		System.out.println("----------------------------------------------------");
		System.out.println("Press 1 to fill the form or any other key to exit");
		char ch = sc.next().charAt(0);
		if(ch=='1'){
			return form1();
			
		}
		return false;		
	}
	
	}
	
}
class Ameerpet{
	static Scanner sc = new Scanner(System.in);
	static class Dream implements Institute{
		public void courses()
		{
			System.out.println("\t\t\t\tThe Courses we offered are:");
			System.out.println("\t\t\t\t--------------------------------------------------------------");
			System.out.println("\t\t\t\t|Courses             	  |Duration       |Fee           |");
			System.out.println("\t\t\t\t--------------------------------------------------------------");
			System.out.println("\t\t\t\t|1:Java Full Stack            |6 Months       |30,000/-      |");
			System.out.println("\t\t\t\t|2:Python Full Stack          |6 Months       |30,000/-      |");
			System.out.println("\t\t\t\t|3:Testing Tools              |3 Months       |25,000/-      |");
			System.out.println("\t\t\t\t|4:MS Office            	  |1.5 Months     |10,000/-      |");
			System.out.println("\t\t\t\t|5:C Language             	  |2 Months       |20,000/-      |");
			System.out.println("\t\t\t\t--------------------------------------------------------------");
		}
		public void placements()
		{
			System.out.println("\t\t\t\tWe don't provide any placement guarantee and we will train you for by giving real time examples and projects.....\n");
			
		}
		public void review()
		{
			System.out.println("Students about Dream Media Solutions:\n");
			System.out.println("Mahadeen Shaik:I am successfully completed my ms office, c language, java full stack course from Dreams media solutions. Here environment is nice and faculties are highly experienced.\n");
		}
		boolean payment(){
		System.out.println("Enter your Debit Card Number:");
		String debit = sc.next();
		System.out.println("The total payment is Rs.1000/-\nType Yes if you okay with payment and No if you not");
		String yn = sc.next();
		if(yn.equals("Yes")){
			System.out.println("Your payment process is finished!");
			System.out.println("\t\t\t\tYour registration is successful");
			return true;
		}
		else{
			System.out.println("Your payment process isn't finished!");
			return false;
		}
	}
	boolean form1(){
		System.out.println("Enter your details\n");
		System.out.println("Enter your name:");
		String name =sc.next();
		System.out.println("Enter your branch:");
		String branch = sc.next();
		System.out.println("Enter your passed out year:");
		int year = sc.nextInt();
		System.out.println("Enter your percentage/CGPA:");
		float marks = sc.nextFloat();
		System.out.println("Pay Rs.1000/- for booking your seat in the new batch");
		return payment();
	}
	public boolean registration1()
	{
		System.out.println("Steps for registration\n");
		System.out.println("---------------------------------------------------");
		System.out.println("1:Register by filling the form\n\n2:Talent Test for fee concession\n\n3:New Batch starts from Dec 10\n\n4:Students are passed outs from 2022 and 2023 with 60% Btech percentage and no active backlogs.\n\n5:Pay Rs.1000/- to book your seat.\n");
		System.out.println("----------------------------------------------------");
		System.out.println("Press 1 to fill the form or any other key to exit");
		char ch = sc.next().charAt(0);
		if(ch=='1'){
			return form1();
			
		}
		return false;		
	}
		
	}
	static class Satya implements Institute{
		public void courses()
		{
			System.out.println("\t\t\t\tThe Courses we offered are:");
			System.out.println("\t\t\t\t--------------------------------------------------------------");
			System.out.println("\t\t\t\t|Courses             	  |Duration       |Fee           |");
			System.out.println("\t\t\t\t--------------------------------------------------------------");
			System.out.println("\t\t\t\t|1:Java Full Stack            |6 Months       |30,000/-      |");
			System.out.println("\t\t\t\t|2:Python Full Stack          |6 Months       |30,000/-      |");
			System.out.println("\t\t\t\t|3:Testing Tools              |3 Months       |25,000/-      |");
			System.out.println("\t\t\t\t|4:MS Office            	  |1.5 Months     |10,000/-      |");
			System.out.println("\t\t\t\t|5:C Language             	  |2 Months       |20,000/-      |");
			System.out.println("\t\t\t\t--------------------------------------------------------------");
		}
		public void placements()
		{
			System.out.println("\t\t\t\t\t25                    5,00,000+             1,00,000+");
			System.out.println("\t\t\t\tYears of Experience           Students         Students Got Placed");
		}
		public void review()
		{
			System.out.println("Students about Sathya Technologies:");
			System.out.println("Naveen Pitani:One of the best institute for anyone who want to gain and enhance knowledge.\nAnd coming to faculty they are so skilled and friendly too. Well I can say, you will see a change in yourself after joining here. So I strongly recommend those people who want to go for training and learn, just join CVCORP. Mark my words this specific institute CVCORP won't let you down.");
		}
		boolean payment(){
		System.out.println("Enter your Debit Card Number:");
		String debit = sc.next();
		System.out.println("The total payment is Rs.1000/-\nType Yes if you okay with payment and No if you not");
		String yn = sc.next();
		if(yn.equals("Yes")){
			System.out.println("Your payment process is finished!");
			System.out.println("\t\t\t\tYour registration is successful");
			return true;
		}
		else{
			System.out.println("Your payment process isn't finished!");
			return false;
		}
	}
	boolean form1(){
		System.out.println("Enter your details\n");
		System.out.println("Enter your name:");
		String name =sc.next();
		System.out.println("Enter your branch:");
		String branch = sc.next();
		System.out.println("Enter your passed out year:");
		int year = sc.nextInt();
		System.out.println("Enter your percentage/CGPA:");
		float marks = sc.nextFloat();
		System.out.println("Pay Rs.1000/- for booking your seat in the new batch");
		return payment();
	}
	public boolean registration1()
	{
		System.out.println("Steps for registration\n");
		System.out.println("---------------------------------------------------");
		System.out.println("1:Register by filling the form\n\n2:Talent Test for fee concession\n\n3:New Batch starts from Dec 10\n\n4:Students are passed outs from 2022 and 2023 with 60% Btech percentage and no active backlogs.\n\n5:Pay Rs.1000/- to book your seat.\n");
		System.out.println("----------------------------------------------------");
		System.out.println("Press 1 to fill the form or any other key to exit");
		char ch = sc.next().charAt(0);
		if(ch=='1'){
			return form1();
			
		}	
		return false;	
	}
		
	}
	static class Vagdevi implements Institute{
		public void courses()
		{
			System.out.println("The Courses we offered are:");
			System.out.println("--------------------------------------------------------------");
			System.out.println("|Courses             	  |Duration       |Fee           |");
			System.out.println("--------------------------------------------------------------");
			System.out.println("|1:Java Full Stack            |6 Months       |30,000/-      |");
			System.out.println("|2:Python Full Stack          |6 Months       |30,000/-      |");
			System.out.println("|3:Testing Tools              |3 Months       |25,000/-      |");
			System.out.println("|4:MS Office            	  |1.5 Months     |10,000/-      |");
			System.out.println("|5:C Language             	  |2 Months       |20,000/-      |");
			System.out.println("--------------------------------------------------------------");
		}
		public void placements()
		{
			System.out.println("\t\t\t\t15                      2,00,000+     50,000+");
			System.out.println("\t\t\t\tYears of Experience     Students      Students Got Placed");
		}
		public void review()
		{
			System.out.println("Students about Vagdevi:");
			System.out.println("Naveen Pitani:One of the best institute for anyone who want to gain and enhance knowledge.\nAnd coming to faculty they are so skilled and friendly too. Well I can say, you will see a change in yourself after joining here. So I strongly recommend those people who want to go for training and learn, just join CVCORP. Mark my words this specific institute CVCORP won't let you down.");
		}
		boolean payment(){
		System.out.println("Enter your Debit Card Number:");
		String debit = sc.next();
		System.out.println("The total payment is Rs.1000/-\nType Yes if you okay with payment and No if you not");
		String yn = sc.next();
		if(yn.equals("Yes")){
			System.out.println("Your payment process is finished!");
			System.out.println("\t\t\t\tYour registration is successful");
			return true;
		}
		else{
			System.out.println("Your payment process isn't finished!");
			return false;
		}
	}
	boolean form1(){
		System.out.println("Enter your details\n");
		System.out.println("Enter your name:");
		String name =sc.next();
		System.out.println("Enter your branch:");
		String branch = sc.next();
		System.out.println("Enter your passed out year:");
		int year = sc.nextInt();
		System.out.println("Enter your percentage/CGPA:");
		float marks = sc.nextFloat();
		System.out.println("Pay Rs.1000/- for booking your seat in the new batch");
		return payment();
	}
	public boolean registration1()
	{
		System.out.println("Steps for registration\n");
		System.out.println("---------------------------------------------------");
		System.out.println("1:Register by filling the form\n\n2:Talent Test for fee concession\n\n3:New Batch starts from Dec 10\n\n4:Students are passed outs from 2022 and 2023 with 60% Btech percentage and no active backlogs.\n\n5:Pay Rs.1000/- to book your seat.\n");
		System.out.println("----------------------------------------------------");
		System.out.println("Press 1 to fill the form or any other key to exit");
		char ch = sc.next().charAt(0);
		if(ch=='1'){
			return form1();
			
		}	
		return false;	
	}
		
	}
	
}
class Dilsukh{
	static Scanner sc=new Scanner(System.in);
	static class BIT implements Institute{
	public void courses()
	{
			System.out.println("\t\t\t\tThe Courses we offered are:");
			System.out.println("\t\t\t\t--------------------------------------------------------------");
			System.out.println("\t\t\t\t|Courses             	      |Duration       |Fee           |");
			System.out.println("\t\t\t\t--------------------------------------------------------------");
			System.out.println("\t\t\t\t|1:Java Full Stack            |6 Months       |30,000/-      |");
			System.out.println("\t\t\t\t|2:Python Full Stack          |6 Months       |30,000/-      |");
			System.out.println("\t\t\t\t|3:Testing Tools              |3 Months       |25,000/-      |");
			System.out.println("\t\t\t\t|4:AWS                        |3.5 Months     |40,000/-      |");
			System.out.println("\t\t\t\t|5:React JS                   |2 Months       |20,000/-      |");
			System.out.println("\t\t\t\t--------------------------------------------------------------");
	}
	public void placements()
	{
			System.out.println("\t\t\t\t\t18              7,00,000+        4,00,000+");
			System.out.println("\t\t\t\tYears of Experience     Students      Students Got Placed");
	}
	public void review()
	{
		System.out.println("Students about Best IT Academy :\n");
		System.out.println("Chandu: I have taken the course of Testing tools and it's the best have taught by skilled trainers with practical experience\n");
	}
		boolean payment(){
		System.out.println("Enter your Debit Card Number:");
		String debit = sc.next();
		System.out.println("The total payment is Rs.1000/-\nType Yes if you okay with payment and No if you not");
		String yn = sc.next();
		if(yn.equals("Yes")){
			System.out.println("Your payment process is finished!");
			System.out.println("\t\t\t\tYour registration is successful");
			return true;
		}
		else{
			System.out.println("Your payment process isn't finished!");
			return false;
		}
	}
	boolean form1(){
		System.out.println("Enter your details\n");
		System.out.println("Enter your name:");
		String name =sc.next();
		System.out.println("Enter your branch:");
		String branch = sc.next();
		System.out.println("Enter your passed out year:");
		int year = sc.nextInt();
		System.out.println("Enter your percentage/CGPA:");
		float marks = sc.nextFloat();
		System.out.println("Pay Rs.1000/- for booking your seat in the new batch");
		return payment();
	}
	public boolean registration1()
	{
		System.out.println("Steps for registration\n");
		System.out.println("---------------------------------------------------");
		System.out.println("1:Register by filling the form\n\n2:Talent Test for fee concession\n\n3:New Batch starts from Dec 10\n\n4:Students are passed outs from 2022 and 2023 with 60% Btech percentage and no active backlogs.\n\n5:Pay Rs.1000/- to book your seat.\n");
		System.out.println("----------------------------------------------------");
		System.out.println("Press 1 to fill the form or any other key to exit");
		char ch = sc.next().charAt(0);
		if(ch=='1'){
			return form1();
			
		}	
		return false;	
	}
	
		
	}
	static class KIH implements Institute{
		public void courses()
		{
			System.out.println("\t\t\t\tThe Courses we offered are:");
			System.out.println("\t\t\t\t--------------------------------------------------------------");
			System.out.println("\t\t\t\t|Courses             	  |Duration       |Fee           |");
			System.out.println("\t\t\t\t--------------------------------------------------------------");
			System.out.println("\t\t\t\t|1:Java Full Stack            |6 Months       |30,000/-      |");
			System.out.println("\t\t\t\t|2:Python Full Stack          |6 Months       |30,000/-      |");
			System.out.println("\t\t\t\t|3:Testing Tools              |3 Months       |25,000/-      |");
			System.out.println("\t\t\t\t|4:MS Office                  |1.5 Months     |10,000/-      |");
			System.out.println("\t\t\t\t|5:C Language                 |2 Months       |20,000/-      |");
			System.out.println("\t\t\t\t--------------------------------------------------------------");
		}
		public void placements()
		{
			System.out.println("\t\t\t\tThe Number of Students placed per year is:");
		System.out.println("\t\t\t\t-------------------------------------------");
		System.out.println("\t\t\t\t|Year           |Number of students placed|");
		System.out.println("\t\t\t\t-------------------------------------------");
		System.out.println("\t\t\t\t|2021           |120                      |");
		System.out.println("\t\t\t\t|2022           |80                       |");
		System.out.println("\t\t\t\t|2023           |100                      |");
		System.out.println("\t\t\t\t-------------------------------------------");
		}
		public void review()
		{
			System.out.println("Students about Kalyan IT Hub :");
			System.out.println("Shiva: Kalyan IT Hub is the best institute who want to join after their graduation. They teach and take exyra care for slow learners..");
		}
		boolean payment(){
		System.out.println("Enter your Debit Card Number:");
		String debit = sc.next();
		System.out.println("The total payment is Rs.1000/-\nType Yes if you okay with payment and No if you not");
		String yn = sc.next();
		if(yn.equals("Yes")){
			System.out.println("Your payment process is finished!");
			System.out.println("\t\t\t\tYour registration is successful");
			return true;
		}
		else{
			System.out.println("Your payment process isn't finished!");
			return false;
		}
	}
	boolean form1(){
		System.out.println("Enter your details\n");
		System.out.println("Enter your name:");
		String name =sc.next();
		System.out.println("Enter your branch:");
		String branch = sc.next();
		System.out.println("Enter your passed out year:");
		int year = sc.nextInt();
		System.out.println("Enter your percentage/CGPA:");
		float marks = sc.nextFloat();
		System.out.println("Pay Rs.1000/- for booking your seat in the new batch");
		return payment();
	}
	public boolean registration1()
	{
		System.out.println("Steps for registration\n");
		System.out.println("---------------------------------------------------");
		System.out.println("1:Register by filling the form\n\n2:Talent Test for fee concession\n\n3:New Batch starts from Dec 10\n\n4:Students are passed outs from 2022 and 2023 with 60% Btech percentage and no active backlogs.\n\n5:Pay Rs.1000/- to book your seat.\n");
		System.out.println("----------------------------------------------------");
		System.out.println("Press 1 to fill the form or any other key to exit");
		char ch = sc.next().charAt(0);
		if(ch=='1'){
			return form1();
			
		}	
		return false;	
	}
		
	}
	static class SsInfo implements Institute{
		public void courses()
			{
				System.out.println("\t\t\t\tThe Courses we offered are:");
			System.out.println("\t\t\t\t--------------------------------------------------------------");
			System.out.println("\t\t\t\t|Courses             	  |Duration       |Fee           |");
			System.out.println("\t\t\t\t--------------------------------------------------------------");
			System.out.println("\t\t\t\t|1:Java Full Stack            |6 Months       |30,000/-      |");
			System.out.println("\t\t\t\t|2:Python Full Stack          |6 Months       |30,000/-      |");
			System.out.println("\t\t\t\t|3:Testing Tools              |3 Months       |25,000/-      |");
			System.out.println("\t\t\t\t|4:Data Analytics             |5 Months       |35,000/-      |");
			System.out.println("\t\t\t\t|5:C Language            |2 Months       |20,000/-      |");
			System.out.println("\t\t\t\t--------------------------------------------------------------");
			}
			public void placements()
			{
				System.out.println("\t\t\t\t15                      2,00,000+     50,000+");
				System.out.println("\t\t\t\tYears of Experience     Students      Students Got Placed");
			}
			public void review()
			{
				System.out.println("Students about Ss Infotech :");
				System.out.println("Kalyan:One of the best institute for anyone who want to gain and enhance knowledge.\nAnd coming to faculty they are so skilled and friendly too. Well I can say, you will see a change in yourself after joining here. So I strongly recommend those people who want to go for training and learn, just join CVCORP. Mark my words this specific institute CVCORP won't let you down.");
			}
			boolean payment(){
		System.out.println("Enter your Debit Card Number:");
		String debit = sc.next();
		System.out.println("The total payment is Rs.1000/-\nType Yes if you okay with payment and No if you not");
		String yn = sc.next();
		if(yn.equals("Yes")){
			System.out.println("Your payment process is finished!");
			System.out.println("\t\t\t\tYour registration is successful");
			return true;
		}
		else{
			System.out.println("Your payment process isn't finished!");
			return false;
		}
	}
	boolean form1(){
		System.out.println("Enter your details\n");
		System.out.println("Enter your name:");
		String name =sc.next();
		System.out.println("Enter your branch:");
		String branch = sc.next();
		System.out.println("Enter your passed out year:");
		int year = sc.nextInt();
		System.out.println("Enter your percentage/CGPA:");
		float marks = sc.nextFloat();
		System.out.println("Pay Rs.1000/- for booking your seat in the new batch");
		return payment();
	}
	public boolean registration1()
	{
		System.out.println("Steps for registration\n");
		System.out.println("---------------------------------------------------");
		System.out.println("1:Register by filling the form\n\n2:Talent Test for fee concession\n\n3:New Batch starts from Dec 10\n\n4:Students are passed outs from 2022 and 2023 with 60% Btech percentage and no active backlogs.\n\n5:Pay Rs.1000/- to book your seat.\n");
		System.out.println("----------------------------------------------------");
		System.out.println("Press 1 to fill the form or any other key to exit");
		char ch = sc.next().charAt(0);
		if(ch=='1'){
			return form1();
			
		}	
		return false;	
	}
			
	}
		
	
				
}

class A
{
	static Scanner sc=new Scanner(System.in);
	static A x=new A();
	private String email;
	private String password;
	private long phno;
	//void setMail(String email)
	//{
	//		this.email=email;
	//}
	void setPass(String password)
	{
		this.password=password;
	}
	String getMail()
	{
		return email;
	}
	String getPass()
	{
		return password;
	}
	long getPhno()
	{
		return phno;
	}
	A(String email,String password,long phno)
	{
		this.email=email;
		this.password=password;
		this.phno=phno;
	}
	A(){}
	int otpgen()
	{
		int otp=1000+(int)(Math.random()*8999);
		return otp;
	}
	int validotp(int otp)
	{
		System.out.println(otp);
		return otp;
	}
	
	void location()
	{	
		boolean p=false;
		while(true){
		System.out.println("Please select the location of the institute\n");
		System.out.println("1 - KPHB\n2 - Ameerpet\n3 - Dilsuknagar\n");
		int n=sc.nextInt();
		if(n==1)
		{
			while(true){
			System.out.println("Please select the Institute you want to join\n");
			System.out.println("1 - CV Corp------5.0(1,098,789)\n2 - V Cube Solutions------4.7(78,907)\n3 - J-Spiders------4.0(54,897)\n4 - Quality Thought------4.5(64,987)\n");
			int n1=sc.nextInt();
			if(n1==1)
			{
				while(true){
				KPHB.CV obj = new KPHB.CV();
				System.out.println("Want to View\n1:Courses\n2:Placements\n3:Review/Students about them\n4:Registration Process");
				System.out.println("Press the number as shown as per your choice or any other key to exit");
				char ch = sc.next().charAt(0);
				if(ch=='1'){
					obj.courses();
				}
				else if(ch=='2')
				{
					obj.placements();
				}
				else if(ch=='3')
				{
					obj.review();
				}
				else if(ch=='4')
				{
					p=obj.registration1();
					if(p){
						break;
					}
				}
				else{
					break;
				}
				}
				if(p){
					break;
				}		
			}
			
			else if(n1==2)
			{
				KPHB.Vcube obj1 = new KPHB.Vcube();
				while(true){
				System.out.println("Want to View\n1:Courses\n2:Placements\n3:Review/Students about them\n4:Registration Process");
				System.out.println("Press the number as shown as per your choice or any other key to exit");
				char ch = sc.next().charAt(0);
				if(ch=='1'){
					obj1.courses();
				}
				else if(ch=='2')
				{
					obj1.placements();
				}
				else if(ch=='3')
				{
					obj1.review();
				}
				else if(ch=='4')
				{
					p=obj1.registration1();
					if(p){
						break;
					}
				}
				else{
					break;
				}
				}
				if(p){
					break;
				}
					
			}
			else if(n1==3)
			{
				KPHB.Jspiders obj2 = new KPHB.Jspiders();
				while(true){
				System.out.println("Want to View\n1:Courses\n2:Placements\n3:Review/Students about them\n4:Registration Process");
				System.out.println("Press the number as shown as per your choice or any other key to exit");
				char ch = sc.next().charAt(0);
				if(ch=='1'){
					obj2.courses();
				}
				else if(ch=='2')
				{
					obj2.placements();
				}
				else if(ch=='3')
				{
					obj2.review();
				}
				else if(ch=='4')
				{
					p=obj2.registration1();
					if(p){
						break;
					}
				}
				else{
					break;
				}
				}
				if(p){
					break;
				}
					
			}
			else if(n1==4)
			{
				KPHB.Quality obj3 = new KPHB.Quality();
				while(true){
				System.out.println("Want to View\n1:Courses\n2:Placements\n3:Review/Students about them\n4:Registration Process");
				System.out.println("Press the number as shown as per your choice or any other key to exit");
				char ch = sc.next().charAt(0);
				if(ch=='1'){
					obj3.courses();
				}
				else if(ch=='2')
				{
					obj3.placements();
				}
				else if(ch=='3')
				{
					obj3.review();
				}
				else if(ch=='4')
				{
					p=obj3.registration1();
					if(p){
						break;
					}
				}
				else{
					break;
				}
				}
				if(p){
					break;	
				}	
			}
			
			else{
				break;
			}
			}
			if(p){
				break;
			}
		}
		else if(n==2)
		{
			while(true){
			System.out.println("1 - Dreams Media Solutions\n2 - Sathya Technologies\n3 - Vagdevi Technologies\n");
			int n2=sc.nextInt();
			if(n2==1)
			{
				Ameerpet.Dream obj = new Ameerpet.Dream();
				while(true){
				System.out.println("Want to View\n1:Courses\n2:Placements\n3:Review/Students about them\n4:Registration Process");
				System.out.println("Press the number as shown as per your choice or any other key to exit");
				char ch = sc.next().charAt(0);
				if(ch=='1'){
					obj.courses();
				}
				else if(ch=='2')
				{
					obj.placements();
				}
				else if(ch=='3')
				{
					obj.review();
				}
				else if(ch=='4')
				{
					p=obj.registration1();
					if(p){
						break;
					}
				}
				else{
					break;
				}
				}
				if(p){
					break;
				}
					
			}
			
		
			else if(n2==2)
			{
				Ameerpet.Satya obj1 = new Ameerpet.Satya();
				while(true){
				System.out.println("Want to View\n1:Courses\n2:Placements\n3:Review/Students about them\n4:Registration Process");
				System.out.println("Press the number as shown as per your choice or any other key to exit");
				char ch = sc.next().charAt(0);
				if(ch=='1'){
					obj1.courses();
				}
				else if(ch=='2')
				{
					obj1.placements();
				}
				else if(ch=='3')
				{
					obj1.review();
				}
				else if(ch=='4')
				{
					p=obj1.registration1();			
					if(p){
						break;
					}
				}
				else{
					break;
				}
				}
				if(p){
					break;
				}
			}
			else if(n2==3)
			{
				Ameerpet.Vagdevi obj2 = new Ameerpet.Vagdevi();
				while(true){
				System.out.println("Want to View\n1:Courses\n2:Placements\n3:Review/Students about them\n4:Registration Process");
				System.out.println("Press the number as shown as per your choice or any other key to exit");
				char ch = sc.next().charAt(0);
				if(ch=='1'){
					obj2.courses();
				}
				else if(ch=='2')
				{
					obj2.placements();
				}
				else if(ch=='3')
				{
					obj2.review();
				}
				else if(ch=='4')
				{
					p=obj2.registration1();
					if(p){
						break;
					}
				}
				else{
					break;
				}
				}
				if(p){
					break;
				}
			}
			
			else{
				break;
			}
			}
			if(p){
				break;
			}
		
		
		}
		else if(n==3)
		{
			while(true){
			System.out.println("Please select the Institute you want to join\n");
			System.out.println("1 - Best IT Academy------4.5(98,789)\n2 - Kalyan IT Hub------5.9(2,78,907)\n3 - Ss Infotech------4.8(1,54,897)\n");
			int n1=sc.nextInt();
			
			if(n1==1)
			{
				Dilsukh.BIT obj = new Dilsukh.BIT();
				while(true){
				System.out.println("Want to View\n1:Courses\n2:Placements\n3:Review/Students about them\n4:Registration Process");
				System.out.println("Press the number as shown as per your choice or any other key to exit");
				char ch = sc.next().charAt(0);
				if(ch=='1'){
					obj.courses();
				}
				else if(ch=='2')
				{
					obj.placements();
				}
				else if(ch=='3')
				{
					obj.review();
				}
				else if(ch=='4'){
					p=obj.registration1();
					if(p){
						break;
					}
				}
				else{
					break;
				}
				}
				if(p){
					break;
				}
					
			}
				
			else if(n1==2)
			{
				Dilsukh.KIH obj1=new Dilsukh.KIH();
				while(true){
				System.out.println("Want to View\n1:Courses\n2:Placements\n3:Review/Students about them\n4:Registration Process");
				System.out.println("Press the number as shown as per your choice or any other key to exit");
				char ch = sc.next().charAt(0);
				if(ch=='1'){
					obj1.courses();
				}
				else if(ch=='2')
				{
					obj1.placements();
				}
				else if(ch=='3')
				{
					obj1.review();
				}
				else if(ch=='4'){
					p=obj1.registration1();
					if(p){
						break;
					}
				}
				else{
					break;
				}
				}
				if(p){
					break;
				}
			}
				
			else if(n1==3)
			{
				Dilsukh.SsInfo obj2=new Dilsukh.SsInfo();
				while(true){
				System.out.println("Want to View\n1:Courses\n2:Placements\n3:Review/Students about them\n4:Registration Process");
				System.out.println("Press the number as shown as per your choice or any other key to exit");
				char ch = sc.next().charAt(0);
				if(ch=='1'){
					obj2.courses();
				}
				else if(ch=='2')
				{
					obj2.placements();
				}
				else if(ch=='3')
				{
					obj2.review();
				}
				else if(ch=='4'){
					p=obj2.registration1();
					if(p){
						break;
					}
				}
				else{
					break;
				}
				}
				if(p){
					break;
				}
			}
				
			
		
			else
			{
				break;
			}
		}
		if(p){
			break;
		}
		
	}		
	
	else
		break;
	}
}
}
class User extends A
{
	static Scanner sc=new Scanner(System.in);
	//static A x=new A();
	static{
		System.out.println("\t\t\t\t"
				+ ":::       ::: :::::::::: :::         ::::::::   ::::::::  ::::    ::::  :::::::::: ");
		System.out.println( "\t\t\t\t"
				+ ":+:       :+: :+:        :+:        :+:    :+: :+:    :+: +:+:+: :+:+:+ :+:        ");
		System.out.println( "\t\t\t\t"
				+ "+:+       +:+ +:+        +:+        +:+        +:+    +:+ +:+ +:+:+ +:+ +:+        ");
		System.out.println( "\t\t\t\t"
				+ "+#+  +:+  +#+ +#++:++#   +#+        +#+        +#+    +:+ +#+  +:+  +#+ +#++:++#   ");
		System.out.println( "\t\t\t\t"
				+ "+#+ +#+#+ +#+ +#+        +#+        +#+        +#+    +#+ +#+       +#+ +#+        ");
		System.out.println( "\t\t\t\t"
				+ " #+#+# #+#+#  #+#        #+#        #+#    #+# #+#    #+# #+#       #+# #+#        ");
		System.out.println( "\t\t\t\t"
				+ "  ###   ###   ########## ##########  ########   ########  ###       ### ########## ");
		System.out.println( "\t\t\t\t\t\t\t" + ":::::::::::  :::::::: "  );
		System.out.println( "\t\t\t\t\t\t\t" + "    :+:     :+:    :+:" );
		System.out.println( "\t\t\t\t\t\t\t" + "    +:+     +:+    +:+" );
		System.out.println( "\t\t\t\t\t\t\t" + "    +#+     +#+    +:+" );
		System.out.println( "\t\t\t\t\t\t\t" + "    +#+     +#+    +#+");
		System.out.println( "\t\t\t\t\t\t\t" + "    #+#     #+#    #+#" );
		System.out.println( "\t\t\t\t\t\t\t" + "    ###      ######## ");
		System.out.println("\t\t\t" + ":::::::::  ::::::::  :::::::::  ::::::::: ::::::::: :::::::::" + "   :::::::::  :::    :::  :::::::  ::::::::::: ::::::::: :::::::::     ");
		System.out.println("\t\t\t" + ":+:       :+:    :+: :+:   :+:  :+:       :+:       :+:    :+:"+ "  :+:        :+:    :+: :+:   :+:     :+:     :+:       :+:          ");
		System.out.println("\t\t\t" + "+:+       +:+    +:+ +:+   +:+  +:+       +:+       +:+    +:+"+ "  +:+        +:+    +:+ +:+   +:+     +:+     +:+       +:+       ");
		System.out.println("\t\t\t" + "+#+       +#+#+##+#+ +#+#+#+#+  +#+#+#+#+ +#+#+#+#+ +#+#+#+#+#"+ "  +#+        +#+#+#+#+# +#+   +#+     +#+     +#+       +#+#+#+#+        ");
		System.out.println("\t\t\t" + "+#+       +#+    +#+ +#+   +#+  +#+       +#+       +#+    +#+"+ "  +#+        +#+    +#+ +#+   +#+     +#+     +#+       +#+           ");
		System.out.println("\t\t\t" + "#+#       #+#    #+# #+#    #+# #+#       #+#       #+#     #+#"+" #+#        #+#    #+# #+#   #+#     #+#     #+#       #+#        ");    
		System.out.println("\t\t\t" + "######### ###    ### ###    ### ######### ######### ###     ###"+" #########  ###    ###  #######  ########### ######### ########## ");
					                



	
	}	
	void login()
	{
		System.out.println("\nPlease enter your credentials to Login\n");
		System.out.print("Enter email id: ");
		String email=sc.next();
		System.out.print("\nEnter password: ");
		String password=sc.next();
		if(email.equals(x.getMail()) && password.equals(x.getPass()))
		{
			System.out.println("Login Successful..\n");
			x.location();
			
		}
		else if(!email.equals(x.getMail()) && !password.equals(x.getPass()))
		{
			System.out.print("Invalid credentials...You didn't have an Account...Please Sign Up for New Account.\nPress 1 to know your name to continue or press any key to exit : ");
			char c=sc.next().charAt(0);
			if(c=='1')
			{
				while(true)
				{
					System.out.print("\nPlease enter your Mobile Number : ");
					long phno=sc.nextLong();
					if(phno==x.getPhno())
					{
						int y=x.validotp(x.otpgen());
						System.out.println("Enter your OTP : ");
						int z=sc.nextInt();
						if(y==z)
						{
						System.out.print("your email : "+x.getMail());
						System.out.print("\t\tYour Password : "+x.getPass());
						login();
						break;
						}
						else
						System.out.println("Invalid opt");
					}
					else
					{
						System.out.print("\nUser not found \nPress 1 to re-enter your Mobile Number or any key press to exit : ");
						char ch=sc.next().charAt(0);
						if(ch!='1')
						{
							break;
						}
					}
				}
			}
		}
		else if(!email.equals(x.getMail()))
		{
			System.out.print("\nInvalid Email Id press 1 to re-enter the mail..");
			int k=sc.nextInt();
			if(k==1)
			login();
		}
		else
		{
			System.out.println("Invalid Password....press 1 to re-enter or reset the password : ");
			int i=sc.nextInt();
			if(i==1)
			{
				System.out.print("\nEnter new password : ");
				x.setPass(sc.next());
				System.out.print("\nYour new password is : "+x.getPass());
				login();
			}
		}
	}
	void signup()
    	{
        	System.out.println("Create a new Account");
      	  	System.out.print("Enter your Email Id: ");
        	String email=sc.next();
        	System.out.print("\nEnter your Password: ");
        	String password=sc.next();
        	System.out.print("\nEnter your Mobile Number: ");
        	long phno=sc.nextLong();
        	System.out.println("\nSignup Successfull");
		x=new A(email,password,phno);
		login();
   	}
	public static void main(String args[])
	{
		System.out.println("1 - Login With Email-id and Password\n2 - Signup for Creating New Account\n");
		int n=sc.nextInt();
		if(n==2)
		new User().signup();
		else if(n==1)
		new User().login();
		else
		{
			System.out.println("Invalid input please try again.");
			main(null);	
		}

}	}
