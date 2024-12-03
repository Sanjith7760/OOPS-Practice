package com.kodnest.adv.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


public class Demo {

	public static void main(String[] args) { 
		
		
		
		// For less number of data we use FileInputStream and FileOutputStream, this is byte stream for images and pdfs
//		try {
//		String path1= "C:\\Users\\VIVA\\OneDrive\\Documents\\FileHandling\\io\\input.txt";
//		String path2= "C:\\Users\\VIVA\\OneDrive\\Documents\\FileHandling\\io\\output.txt";
//			
//		FileInputStream fis = new FileInputStream(path1);
//		FileOutputStream fos = new FileOutputStream(path2);
//		
//		int x;
//		while((x=fis.read())!=-1) {
//			fos.write(x);
//		}
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		
		
		
		
		
		// for more number of data and for efficient process we use FileReader and FileWriter , this is character stream for texts and cvs
//		try {
//			String path1= "C:\\Users\\VIVA\\OneDrive\\Documents\\FileHandling\\io\\input.txt";
//			String path2= "C:\\Users\\VIVA\\OneDrive\\Documents\\FileHandling\\io\\output.txt";
//				
//			FileReader fr = new FileReader(path1);
//			FileWriter fw = new FileWriter(path2);			
//			int x;
//			while((x=fr.read())!=-1) {
//				fw.write(x);
//			  }
//			fw.flush();
//			}
//			catch (Exception e) {
//				e.printStackTrace();
//			}
		
		
		
		
		
		
		
		
		
		
		//We use buffered for more efficiency and performance 
//		try {
//			String path1= "C:\\Users\\VIVA\\OneDrive\\Documents\\FileHandling\\io\\input.txt";
//			String path2= "C:\\Users\\VIVA\\OneDrive\\Documents\\FileHandling\\io\\output.txt";
//				
//			FileReader fr = new FileReader(path1);
//			FileWriter fw = new FileWriter(path2);
//			
//			BufferedReader br = new BufferedReader(fr);
//			BufferedWriter bw = new BufferedWriter(fw);
//			String x;
//			while((x=br.readLine())!=null) {
//				bw.write(x);
//			  }
//			bw.flush();
//			}
//			catch (Exception e) {
//				e.printStackTrace();
//			}
		
		
		
		
		
		
		//For transfering the images
//		try {
//			String path1 = "C:\\Users\\VIVA\\OneDrive\\Documents\\FileHandling\\io\\input-img\\css.JPG";
//			String path2 = "C:\\Users\\VIVA\\OneDrive\\Documents\\FileHandling\\io\\output-img\\imgoutput.BMP";
//			
//			FileInputStream in = new FileInputStream(path1);
//			FileOutputStream out = new FileOutputStream(path2);
//			
//			int x;
//			while((x=in.read())!= -1) {
//				out.write(x);
//			}
//			out.flush();
//		}
//		catch (Exception e) {
//			System.out.println("File not found");
//		}
		
		
		
		
		
		
		
		//This program is for closing() the file or data
//		FileReader fr = null;
//		FileWriter fw = null; 
//		BufferedReader br = null;
//		BufferedWriter bw = null;
//		try {
//			String path1= "C:\\Users\\VIVA\\OneDrive\\Documents\\FileHandling\\io\\input.txt";
//			String path2= "C:\\Users\\VIVA\\OneDrive\\Documents\\FileHandling\\io\\output.txt";
//				
//			 fr = new FileReader(path1);
//			 fw = new FileWriter(path2);
//			
//			 br = new BufferedReader(fr);
//			 bw = new BufferedWriter(fw);
//			String x;
//			while((x=br.readLine())!=null) {
//				bw.write(x);
//			  }
//			bw.flush();
//			}
//			catch (FileNotFoundException e) {
//				e.printStackTrace();
//			}
//		     catch (Exception e) {
//			    e.printStackTrace();
//		   }
//		finally {
//			try {
//			br.close();
//			bw.close();
//			fr.close();
//			fw.close();
//		  }
//			catch (Exception e) {
//				e.printStackTrace();
//		 }
//		}
		
		
		
		
		
		
		//To get complete meta data of file we use File f = new File();
//		try {
//			String path = "C:\\Users\\VIVA\\OneDrive\\Documents\\FileHandling\\io\\input.txt";
//			File file = new File(path);
//			System.out.println(file.canExecute());
//			System.out.println(file.canRead());
//			System.out.println(file.canWrite());
//			System.out.println(file.exists());
//			System.out.println(file.canExecute());
//			System.out.println(file.getCanonicalPath());
//			System.out.println(file.getName());
//			System.out.println(file.getParent());
//			System.out.println(file.getPath());
//			System.out.println(file.isAbsolute());
//			System.out.println(file.isDirectory());
//			System.out.println(file.isFile());
//			
//			
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello");
		System.err.println("Who are u");
	}

}
