import java.util.Scanner;

public class LumpedArray {
    public static void main(String[] args) {
        int[] arrA = new int[1];
        int[] arrB = new int[2];
        int[] arrC = new int[3];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arrA.length; i++) {
            System.out.println("Enter arrA[" + (i + 1) + "]:");
            arrA[i] = input.nextInt();
        }

        for (int i = 0; i < arrB.length; i++) {
            System.out.println("Enter arrB[" + (i + 1) + "]:");
            arrB[i] = input.nextInt();
        }

        for (int i = 0; i < arrA.length; i++) {
            arrC[i] = arrA[i];
        }

        for (int i = 0; i < arrB.length; i++) {
            arrC[(arrA.length + i)] = arrB[i];
        }

        System.out.print("Array C: ");
        for (int i = 0; i < arrC.length; i++) {
            System.out.print(arrC[i] + " ");
        }

    }

}
