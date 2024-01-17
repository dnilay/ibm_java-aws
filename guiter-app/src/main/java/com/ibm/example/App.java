package com.ibm.example;

import java.util.Scanner;
import java.util.UUID;

import com.ibm.example.model.Guiter;
import com.ibm.example.model.GuiterType;
import com.ibm.example.repo.GuiterRepository;
import com.ibm.example.repo.Inventory;

public class App 
{
	private static Scanner scanner=null;
	private static GuiterRepository guiterRepository;
	static
	{
		guiterRepository=new Inventory();
		scanner=new Scanner(System.in);
	}
    public static void main( String[] args )
    {
       int choice=0;
       do {
    	   System.out.println("1. Add A New Guiter.");
    	   System.out.println("2. Search A Guiter.");
    	   System.out.println("3. Get Guiter.");
    	   System.out.println("0. Exit.");
    	   System.out.print("enter your choice: ");
    	   choice=scanner.nextInt();
    	   switch (choice) {
		case 1:
			System.out.print("Enter Guiter Price: ");
			double p=scanner.nextDouble();
			System.out.print("Enter Builder Name: ");
			String b=scanner.next();
			System.out.print("Enter Model: ");
			String m=scanner.next();
			System.out.print("Enter Guiter Type: ");
			String t=scanner.next();
			System.out.print("Enter BackWood: ");
			String bw=scanner.next();
			System.out.println("Enter TopWood: ");
			String tw=scanner.next();
			guiterRepository.addGuiters(new Guiter(UUID.randomUUID().toString(), p, b, m, GuiterType.valueOf(t), bw, tw));
			break;
		case 2:
			System.out.print("Enter Serial Number: ");
			String s=scanner.next();
			Guiter guiter=guiterRepository.getGuiter(s);
			if(guiter!=null)
			{
				System.out.println("Found: "+guiter);
			}
			else
			{
				System.out.println("Guiter not found");
			}
			break;
		case 3:
			System.out.print("Enter Serial Number: ");
			String s1=scanner.next();
			Guiter g=guiterRepository.getGuiter(s1);
			Guiter g1=guiterRepository.searchGuiter(g);
			if(g1==null)
			{
				System.out.println("invalid guiter object");
			}
			else
			{
				System.out.println(g1);
			}
			break;
		case 0:
			System.exit(0);
		
			
		default:
			System.out.println("Invalid choice..");
			break;
		}
    	   
       }while(choice!=0);
       
       
       
    }
}
