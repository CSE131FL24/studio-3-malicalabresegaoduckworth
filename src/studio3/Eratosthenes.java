package studio3;
import java.util.Scanner;
import java.util.*;
public class Eratosthenes {
	
	public static void main(String[]args) {
	System.out.println("Enter to which number you want the program to check for primes");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt(); 
	
	
	boolean primeNumbers[] = new boolean[n];
	
	for (int i = 0; i < n; i++) {
		primeNumbers[i] = true;
	}
	
	for (int p = 2; p < n; p++) {
		
		if (primeNumbers[p] == true) {
			
			for (int i = (p * p); i<n; i+=p) {
				primeNumbers[i] = false;
			}
			
		}
		
	}
	
	for (int i = 2; i<n; i++) {
		if (primeNumbers[i]==true) {
			System.out.println(i);
		}
	}
	
	
	

	
	
	
	
	
	
	
}
}