package Task;

public class Java4 {

	public static void main(String[] args) {
		int[] a = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        int[] counts = new int[10];

        for (int i = 0; i < a.length; i++) {
            int b = a[i];

            for (int j = 1; j <= 9; j++) {
                if (b % j == 0) {
                    counts[j]++;
                }
            }
        }

        System.out.print("{");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + ": " + counts[i]);
            if (i < 9) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

}

