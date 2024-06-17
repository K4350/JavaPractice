// 2D array 



import java.util.*;

class array{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of you array, row: ");
        int row = input.nextInt();
        System.out.print("coloum:");
        int coloum = input.nextInt();

        int[][] arr = new int[row][coloum];

        System.out.println("Enter the value for below index");
        for(int i = 0;i<row; i++){
            for(int j = 0;j<coloum ; j++){
                System.out.print(i + " "+ j+ ":");
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("Here's the 2D Array you have created: ");
         for(int i = 0;i<row; i++){
            for(int j = 0;j<coloum ; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println("");
        }
        
    }
}