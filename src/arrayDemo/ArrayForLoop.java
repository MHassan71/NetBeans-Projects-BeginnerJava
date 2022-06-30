package arrayDemo;

import java.util.Scanner;

public class ArrayForLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] num = new double[5];
        double sum = 0;
        double avg;

        System.out.print("Please enter five numbers: ");
        double totalNumber = num.length;

        for (int i = 0; i < totalNumber; i++) {
            num[i] = input.nextDouble();
        }

        for (int i = 0; i < totalNumber; i++) {
            sum = sum + num[i];

        }

        avg = sum / totalNumber;
        System.out.println("Sum of numbers: " + sum);
        System.out.println("Average of numbers: " + avg);

    }

}
