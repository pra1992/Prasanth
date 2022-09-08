package week1.assignments;

import java.util.Iterator;

import freemarker.ext.jsp._FreeMarkerPageContext1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		String[] text1=text.split(" ");
		for (int i = 0; i < text1.length-1; i++) {
			for (int j = i+1; j < text1.length-1; j++) {
				if(text1[i].equals(text1[j])) {
					count++;
					text1[j]="";
				}
			}
			
		}
		for(int x=0; x<text1.length;x++ ) {
			System.out.print(" "+text1[x]);
		} 
		
}}