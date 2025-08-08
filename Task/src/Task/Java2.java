package Task;

import java.util.Scanner;

public class Java2 {
	public static void main(String[] args) {
        Scanner one = new Scanner(System.in);

        System.out.print("Enter a number (a): ");
        int a = Integer.parseInt(one.nextLine());

        for (int i = 0; i < a; i++) {
            int odd = 2 * i + 1;
            if (i < a - 1) {
                System.out.print(odd + ", ");
            } else {
                System.out.print(odd);
            }
        }
	}
}
