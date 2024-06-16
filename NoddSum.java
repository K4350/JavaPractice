
import java.util.Scanner;

class NoddSum{
    static void sumOdd(int n){

        int sum = 0;
        for(int i = 1; i<=n; i+=2){
            sum += i;
        }

        System.out.println("the sum of all odd numbers from 1 to " + n + " is "+ sum);

    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter the number: ");
        int Num = input.nextInt();

        sumOdd(Num);

        input.close();

        
    }
}