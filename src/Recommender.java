import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Recommender {

	public static void main(String[] argv) throws IOException {
		String trainFile = argv[0];
		String testFile = argv[1];
		//String outputFile = argv[2];

		// If you see these outputs, it means you have successfully compiled and run the code.
		// Then you can remove these three lines if you want.
		//System.out.println("Training File : " + trainFile);
		//System.out.println("Test File : " + testFile);
		//System.out.println("Output File : " + outputFile);
		
		FileInputStream fr = new FileInputStream(argv[0]);
		 BufferedReader br = new BufferedReader(new InputStreamReader(fr)); 
		Scanner s=new Scanner(new File(argv[0]));
		String str;
		while((str=br.readLine())!=null)
			System.out.println(str);
		//System.out.println(trainFile);

		// Implement your recommendation modules using trainFile and testFile.
		// And output the prediction scores to outputFile.

	}

}