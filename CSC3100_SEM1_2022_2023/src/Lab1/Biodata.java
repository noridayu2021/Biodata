package Lab1;
 /* Tell me something about yourself and what you intend to learn from this course in a few words, and then show me everything on the console. */

import java.util.Scanner;
public class Biodata {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Type Y if you want to read this.");
		char ans = sc.next().charAt(0);
		
		if (ans == 'Y') {
		  System.out.println("Hai everyone...You guys can call me Alya. Im staying at Shah Alam and previously studied at Matriculation College Kedah.");
		  System.out.println("I start learning programming during matriculation, since then I determine to pursue my studies in Science Computer.");
		  System.out.println("I hope that I can learn more about programming, be master on it until I be able to develop my own apps .");
		}
		
		else
		  System.out.print("Okay bye");

	}
}
