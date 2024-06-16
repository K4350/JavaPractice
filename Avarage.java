import java.util.Scanner;

class Average {
    public static int calculateAverage(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = input.nextInt();

        System.out.println("Enter the second number");
        int num2 = input.nextInt();

        System.out.println("Enter the third number");
        int num3 = input.nextInt();

        int avg = calculateAverage(num1, num2, num3);
        System.out.println("The average is " + avg);

        input.close();
    }
}
