package com.simplilearn.filepractice;

import java.io.*;

public class file2_create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       File  f2 = new File("/home/soundariya27gma/javafsdphase1/javafsdphase1/second_file.txt");
        
        
        try {
			FileWriter fwriter = new FileWriter("/home/soundariya27gma/javafsdphase1/javafsdphase1/second_file.txt");
			fwriter.write("Welcome to the world of file creation");
			fwriter.close();
			System.out.println("The content is successfully written inside the file.");
		} catch (IOException e) {
			System.out.println("Unexpected error occurred...");
			e.printStackTrace();
		}
	}
	}

       
