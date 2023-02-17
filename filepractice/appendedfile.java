package com.simplilearn.filepractice;

import java.io.*;

public class appendedfile {
	
	public static void main(String args[]) throws IOException{
		
		
		
		PrintWriter pw = new PrintWriter("/home/soundariya27gma/javafsdphase1/javafsdphase1/appended_file.txt");
		
		 BufferedReader br1 = new BufferedReader(new FileReader("/home/soundariya27gma/javafsdphase1/javafsdphase1/file_first.txt"));
		 String line1 = br1.readLine();
		 
		 while (line1 != null)
	        {
	            pw.println(line1);
	            line1 = br1.readLine();
	        }

		 br1 = new BufferedReader(new FileReader("/home/soundariya27gma/javafsdphase1/javafsdphase1/second_file.txt"));
		 line1 = br1.readLine();
		 
		 while (line1 != null)
	        {
	            pw.println(line1);
	            line1 = br1.readLine();
	        }
		 
		 pw.flush();
         
	       
	        br1.close();
	        pw.close();
		 System.out.println("The files are appended successfully");
}
	
	
}
