package com.simplilearn.filepractice;

import java.io.*;


public class file1_create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File  f1 = new File("/home/soundariya27gma/javafsdphase1/javafsdphase1/file_first.txt");
        
        
        try {
			FileWriter fwriter = new FileWriter("/home/soundariya27gma/javafsdphase1/javafsdphase1/file_first.txt");
			fwriter.write("My first file created successfully");
			fwriter.close();
			System.out.println("The content is successfully written inside the file.");
		} catch (IOException e) {
			System.out.println("Unexpected error occurred...");
			e.printStackTrace();
		}
	}

}
