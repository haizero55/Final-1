import java.util.Scanner;
public class AutoArray {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter numbers (enter -1 to view all input numbers):");

            int[] numbers = new int[1]; // Start with an array of size 1
            int count = 0;

            while (true) {
                int num = scanner.nextInt();

                if (num == -1) {
                    break;
                }

                if (count == numbers.length) {
                    // Resize the array if it's full
                    int[] newNumbers = new int[numbers.length * 2];
                    System.arraycopy(numbers, 0, newNumbers, 0, numbers.length);
                    numbers = newNumbers;
                }

                numbers[count++] = num;
            }

            System.out.println("Inputed numbers:");
            for (int i = 0; i < count; i++) {
                System.out.print(numbers[i] + " ");
            }

            scanner.close();
        }


}
