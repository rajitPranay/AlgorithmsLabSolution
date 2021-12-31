package com.greatlearning.currency;

import java.util.Scanner;

public class MinimumNotes {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//get the no of denominations
		try {
			System.out.println("Enter the No of Denominations available");
			int size=sc.nextInt();
			
			//allocate array for the denominations
			int[] notes= new int[size];
			int[] numNotes= new int[size];
			
			//get the denominations in loop -- 100, 500, 2000
			System.out.println("Enter the denominations");
			for(int i=0; i<size; i++) {
				notes[i]=sc.nextInt();
				//System.out.println("given"+ notes[i]);
			}
			MergeSort ms= new MergeSort();
			ms.sort(notes, 0, notes.length-1);
			
			// check the sorted array
			for(int j=0; j<notes.length; j++) {
				System.out.println(notes[j]);
			}
			
			// get the amount
			System.out.println("What is the Amount to pay");
			int amt=sc.nextInt();
			
			// code to get min no of notes required
			for(int k=0; k<notes.length; k++) {
				// find how many notes of notes[k] to select 
				int n = (int)(amt/notes[k]);
				numNotes[k]=n;
				//----System.out.println(notes[k]+" : "+ n);
				
				// set amt to the remaining amt
				amt -= n*notes[k];
				
				// write cond to find if it is possible to pay
				//and print a msg "not possible to pay amt"
				if(k==notes.length-1 && amt !=0){
					System.out.println("Not Possible to pay the amount");
				} else if(k==notes.length-1 && amt ==0){
					for(int jk=0; jk<numNotes.length; jk++) {
						System.out.println(notes[jk]+" : "+ numNotes[jk]);
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Enter valid Denomination");
			//e.printStackTrace();
		}
	}

}
