package arrayDemo;

public class ArrayMatrixNoUI {

    public static void main(String[] args) {

        int A[][] = new int[2][3];
        A[0][0] = 2;
        A[0][1] = 4;
        A[0][2] = 5;
        A[1][0] = 6;
        A[1][1] = 7;
        A[1][2] = 8;

        System.out.println("A Matrix: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" " + A[row][col]);
            }
            System.out.println();
        }

    }
}
