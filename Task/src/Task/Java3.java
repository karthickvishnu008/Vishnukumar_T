package Task;

import java.util.Scanner;

public class Java3 {

		 public static void main(String[] args) {
		        Scanner one = new Scanner(System.in);

		        System.out.print("Enter a number (a): ");
		        int a = Integer.parseInt(one.nextLine());

		        if (a % 2 == 0) {
		            a -= 1;
		        }

		        for (int i = 0; i < a; i++) {
		        	int b=2*i+1;
		        	System.out.print(b);
		            if (i < a-1) {
		                System.out.print(", ");
		            }
		        }
		 }
	}
