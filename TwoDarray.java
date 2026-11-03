import java.util.Scanner;

public class TwoDarray {

    public static void main(String[] args) {
        int arr1[][] = new int[10][10];
        int arr2[][] = new int[10][10];
        int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Two dimention array :");

        System.out.println("Enter a values for 1st array :");
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr1.length - 1; j++) {
                arr1[i][j] = sc.nextInt();

            }
        }
        System.out.println("Enter a values for 2st array :");
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr1.length - 1; j++) {
                arr2[i][j] = sc.nextInt();

            }
        }

        System.out.println("Out put of array is :");
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr1.length - 1; j++) {
                arr2[i][j] = sc.nextInt();

                result = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Arry is :" + result);
    }
}
