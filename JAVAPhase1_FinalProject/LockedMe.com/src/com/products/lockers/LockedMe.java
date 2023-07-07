package com.products.lockers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class LockedMe {
	static final String projectPath="E:\\Programming\\Java\\Simplilearn\\Phase 1\\Push to Git\\Projects\\Simplilearn Projects\\JAVAPhase1_FinalProject\\ProjectFiles";
	//Absolute Path: We gave this path here because it will get used by all the methods otherwise we have to give in each method.
	public static void main(String[] args) throws IOException 
	{
	welcomeScreen();
	userSelection();
	addFiles();
	deleteFiles();
	searchFiles();
	}
	public static void welcomeScreen()
	{
		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");
		System.out.println("Welcome to Company Lockers Pvt. Ltd.");
		System.out.println("Application Name: LockedMe.com");
		System.out.println("Developer Name: Anmol Prashar");
		System.out.println("--------------------------------------");
	}
	public static void operation()
	{
		System.out.println("---------------------------------------");
		System.out.println("Operations to perform: ");
		System.out.println("1. Display all the files in directory");
		System.out.println("2. Add files");
		System.out.println("3. Delete a file");
		System.out.println("4. Search a file");
		System.out.println("5. Close the application");
		System.out.println("-------------------------------------");
	}
	
	public static void userSelection() throws IOException
	{
		Scanner obj = new Scanner(System.in);
		int so;
		do
		{
			operation();
			System.out.println("Select the operation:");
			so = Integer.parseInt(obj.nextLine());
			switch (so)
			{
				case 1: displayFiles();
						break;
				case 2: addFiles();
						break;
				case 3: deleteFiles();
						break;
				case 4: searchFiles();
						break;
				case 5: System.exit(0);;
						break;
				default: System.out.println("Invalid Selection of Operation");
						break;
			}
		}
		while(so>0);
	}
	
	public static void displayFiles() 
	{
		//Creating a file object for directory
		File directory = new File(projectPath);
		//List of all files
		File filesList[] = directory.listFiles();
		//if the folder is empty
		if(filesList.length==0)
			System.out.println("Empty Directory");
		else
		{
			System.out.println("Files on the directory: ");
			for(var f:filesList)
			{	
				System.out.println(f.getName());
			}
		}
	}
	
	public static void addFiles() throws IOException
	{
		Scanner fa = new Scanner (System.in);
		String fileName;
		System.out.println("File name: ");
		fileName = fa.nextLine();
		
		FileWriter fw = new FileWriter (projectPath + "\\"+fileName,true);
		fw.write("We can write anything in file.\n");
		fw.close();
		System.out.println("File Created Successfully.");
	}
	
	public static void deleteFiles()
	{
		Scanner del = new Scanner(System.in);
		String fileName;
		System.out.println("Enter file name to be deleted(Case Sensitive): ");
		fileName = del.nextLine();
		
		File f = new File (projectPath+"\\"+fileName);
		if (f.exists())
		{
			f.delete();
			System.out.println("File Deleted Sucessfully.");
		}
		else
		{
			System.out.println("File Do not exist.");
		}
	}
	
	public static void searchFiles()
	{
		Scanner sr = new Scanner(System.in);
		String fileName;
		System.out.println("Enter file name to be searched(Case Sensitive): ");
		fileName = sr.nextLine();
		
		File f = new File (projectPath+"\\"+fileName);
		if (f.exists())
		{
			System.out.println("File is available.");
		}
		else
		{
			System.out.println("File is not avialable.");
		}
	}
	
	

}
