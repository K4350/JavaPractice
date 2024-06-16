
import java.util.Scanner;

class GreatestOfTwo {

    static void Greatest(int a, int b) {
        if (a == b) {
            System.out.println("Both are equal");
            return;
        }
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else {
            System.out.println(b + " is greater than " + a);
        }
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the First Num: ");
        int Num1 = input.nextInt();

        System.out.print("Enter the second Num: ");
        int Num2 = input.nextInt();

        Greatest(Num1, Num2);

        input.close();
    }
}
