package com.somkanya_newyear_gift.maven.com.somkanya_newyear_gift.maven;

import java.util.Scanner;

public class Factory 
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner inp=new Scanner(System.in);
		while(true)
		{
			Gift obj = new Chocolate();
			System.out.println("Chocolates:click 1-For sort by price, click 2-For sort by weight, click 3-exit ");
			System.out.println("Enter Choice :");
			int ch = inp.nextInt();
			if(ch==1)
			{
				obj.get();
			    obj.sort();
			}
			else if(ch==2)
			{
				obj.get();
			  	obj.sortw();
			}
			else
				break;
		}
		
		    
		
	}
	
}

