package processor;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static double[][] arr;

    private static void printMenu() {
        System.out.println("\n1. Add matrices\n" +
                "2. Multiply matrix by a constant\n" +
                "3. Multiply matrices\n" +
                "4. Transpose matrix\n" +
                "5. Calculate a determinant\n" +
                "6. Inverse matrix\n" +
                "0. Exit");

    }

    private static void subMenu() {
        System.out.println("\n1. Main diagonal\n" +
                "2. Side diagonal\n" +
                "3. Vertical line\n" +
                "4. Horizontal line");

    }


    private static void addMatrices() {

        int row1;
        int col1;
        int i;
        int j;
        int col2;
        int row2;
        Scanner in = new Scanner(System.in);


        System.out.print("Enter size of first matrix:");


        row1 = Integer.parseInt(in.next());


        col1 = Integer.parseInt(in.next());


        double[][] mat1 = new double[row1][col1];
        double[][] res = new double[row1][col1];

        System.out.println("Enter first matrix:");

        for (i = 0; i < row1; i++) {

            for (j = 0; j < col1; j++)

                mat1[i][j] = in.nextDouble();


        }


        System.out.print("Enter size of second matrix:");
        row2 = Integer.parseInt(in.next());


        col2 = Integer.parseInt(in.next());


        System.out.println("Enter second matrix:");

        double[][] mat2 = new double[row2][col2];

        for (i = 0; i < row2; i++) {

            for (j = 0; j < col2; j++)

                mat2[i][j] = in.nextDouble();


        }


        if (row1 == row2 && col1 == col2) {
            System.out.println("The result is:");
            for (i = 0; i < row1; i++)
                for (j = 0; j < col1; j++)
                    res[i][j] = mat1[i][j] + mat2[i][j];

            for (i = 0; i < row1; i++) {
                for (j = 0; j < col1; j++)
                    System.out.print(res[i][j] + " ");

                System.out.println();
            }

        } else {
            System.out.println("The operation cannot be performed.");
        }


    }


    public static void multiplyMatrixByConstant() {

        double i, j, con;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of matrix:");
        int row1 = Integer.parseInt(in.next());

        int col1 = Integer.parseInt(in.next());


        double[][] mat1 = new double[row1][col1];
        double[][] res = new double[row1][col1];


        System.out.println("Enter matrix:");
        for (i = 0; i < row1; i++) {

            for (j = 0; j < col1; j++)

                mat1[(int) i][(int) j] = in.nextDouble();

        }

        System.out.print("Enter constant:");
        con = in.nextDouble();


        System.out.println("The result is:");
        for (i = 0; i < row1; i++)
            for (j = 0; j < col1; j++)
                res[(int) i][(int) j] = con * mat1[(int) i][(int) j];

        for (i = 0; i < row1; i++) {
            for (j = 0; j < col1; j++)
                System.out.print(res[(int) i][(int) j] + " ");

            System.out.println();
        }


    }

    public static void multiplyMatrices() {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of first matrix:");
        double i;
        double j;

        int row1 = Integer.parseInt(in.next());


        int col1 = Integer.parseInt(in.next());


        double[][] mat1 = new double[row1][col1];


        System.out.println("Enter first matrix:");

        for (i = 0; i < row1; i++) {

            for (j = 0; j < col1; j++)

                mat1[(int) i][(int) j] = in.nextDouble();


        }

        System.out.print("Enter size of second matrix:");
        int row2 = Integer.parseInt(in.next());
        int col2 = Integer.parseInt(in.next());

        System.out.println("Enter second matrix:");

        double[][] mat2 = new double[row2][col2];

        for (i = 0; i < row2; i++) {

            for (j = 0; j < col2; j++)

                mat2[(int) i][(int) j] = in.nextDouble();


        }

        if (col1 != row2) {
            System.out.println("The operation cannot be performed.");
        }
        if (col1 == row2) {
            double sum;
            int k, l, m;
            double[][] mat3 = new double[row1][col2];
            k = 0;
            while (k < row1) {

                l = 0;
                while (l < col2) {
                    sum = 0;
                    m = 0;
                    while (m < row2) {
                        sum += mat1[k][m] * mat2[m][l];
                        m++;
                    }
                    mat3[k][l] = sum;
                    l++;
                }
                k++;
            }
            k = 0;
            while (k < row1) {
                l = 0;
                while (l < col2) {
                    System.out.printf("%.2f", mat3[k][l]);

                    l++;
                    System.out.print(" ");
                }
                System.out.println();
                k++;
            }
        }
    }

    private static void mainDiagonal() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter matrix size:");
        double i;
        double j;

        int row1 = Integer.parseInt(in.next());


        int col1 = Integer.parseInt(in.next());

        double[][] mat = new double[row1][col1];


        System.out.println("Enter matrix:");

        for (i = 0; i < row1; i++) {

            for (j = 0; j < col1; j++)

                mat[(int) i][(int) j] = in.nextDouble();


        }

        System.out.println("The result is");

        for (i = 0; i < row1; i++) {
            for (j = 0; j < col1; j++)
                System.out.print(mat[(int) j][(int) i] + " ");

            System.out.println();
        }


    }

    private static void horizontalDiagonal() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter matrix size:");
        double i;
        double j;

        int row1 = Integer.parseInt(in.next());


        int col1 = Integer.parseInt(in.next());

        double[][] mat = new double[row1][col1];


        System.out.println("Enter matrix:");

        for (i = 0; i < row1; i++) {

            for (j = 0; j < col1; j++)

                mat[(int) i][(int) j] = in.nextDouble();

        }

        System.out.println("The result is");

        for (i = row1 - 1; i >= 0; --i) {
            for (j = 0; j < col1; j++)
                System.out.print(mat[(int) i][(int) j] + " ");
            System.out.println();
        }


    }

    private static void sideDiagonal() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter matrix size:");
        double i;
        double j;

        int row1 = Integer.parseInt(in.next());


        int col1 = Integer.parseInt(in.next());

        double[][] mat = new double[row1][col1];


        System.out.println("Enter matrix:");

        for (i = 0; i < row1; i++) {

            for (j = 0; j < col1; j++)

                mat[(int) i][(int) j] = in.nextDouble();

        }

        System.out.println("The result is");

        for (i = row1 - 1; i >= 0; --i) {
            for (j = col1 - 1; j >= 0; --j)
                System.out.print(mat[(int) j][(int) i] + " ");

            System.out.println();
        }
    }

    private static void verticalDiagonal() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter matrix size:");
        double i;
        double j;

        int row1 = Integer.parseInt(in.next());


        int col1 = Integer.parseInt(in.next());

        double[][] mat = new double[row1][col1];


        System.out.println("Enter matrix:");

        for (i = 0; i < row1; i++) {

            for (j = 0; j < col1; j++)

                mat[(int) i][(int) j] = in.nextDouble();

        }

        System.out.println("The result is");

        for (i = 0; i < row1; i++) {
            for (j = col1 - 1; j >= 0; --j)
                System.out.print(mat[(int) i][(int) j] + " ");
            System.out.println();
        }
    }


    public static class Determinant {
        public double res(double[][] arr) {
            double result = 0;
            if (arr.length == 1) {
                result = arr[0][0];
                System.out.println("The result is:");
                /*System.out.println(result);*/
                return result;

            }
            if (arr.length == 2) {
                result = arr[0][0] * arr[1][1] - arr[0][1] * arr[1][0];
                System.out.println("The result is:");
                return result;
            }


            for (int a = 0; a < arr[0].length; a++) {
                double[][] temp = new double[arr.length - 1][arr[0].length - 1];

                for (int b = 1; b < arr.length; b++) {
                    for (int c = 0; c < arr[0].length; c++) {

                        if (c < a) {
                            temp[b - 1][c] = arr[b][c];
                        } else if (c > a) {
                            temp[b - 1][c - 1] = arr[b][c];
                        }
                    }
                }

                result += arr[0][a] * Math.pow(-1, a) * res(temp);

            }


            return result;
        }

    }

    public static void inverseMatrix() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter matrix size:");
        double i;
        double j;

        int row1 = Integer.parseInt(in.next());


        int col1 = Integer.parseInt(in.next());

        double[][] mat = new double[row1][col1];


        System.out.println("Enter matrix:");

        for (i = 0; i < row1; i++) {

            for (j = 0; j < col1; j++)

                mat[(int) i][(int) j] = in.nextDouble();

        }

        double[][] rhs = new double[row1][col1];
        for (i = 0; i < row1; i++) {

            for (j = 0; j < col1; j++)
                if (i == j) {
                    rhs[(int) i][(int) j] = 1;
                } else {
                    rhs[(int) i][(int) j] = 0;
                }
        }


        Determinant d = new Determinant();
        double res = d.res(mat);
        if (res == 0.0) {
            System.out.println("This matrix doesn't have an inverse.");
        } else {

            String r1 = Arrays.deepToString(inverse(mat)).replace("], ", "]\n");
            String r2 = r1.replace(",", "");
            String r3 = r2.replace("[", "");
            String r4 = r3.replace("]", "");
            System.out.println(r4);

        }
    }

    private static double determinant(double[][] matrix) {
        if (matrix.length != matrix[0].length)
            throw new IllegalStateException("invalid dimensions");

        if (matrix.length == 2)
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];

        double det = 0;
        for (int i = 0; i < matrix[0].length; i++)
            det += Math.pow(-1, i) * matrix[0][i]
                    * determinant(minor(matrix, 0, i));
        return det;
    }

    private static double[][] inverse(double[][] matrix) {
        double[][] inverse = new double[matrix.length][matrix.length];


        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                inverse[i][j] = Math.pow(-1, i + j)
                        * determinant(minor(matrix, i, j));


        double det = 1.0 / determinant(matrix);
        for (int i = 0; i < inverse.length; i++) {
            for (int j = 0; j <= i; j++) {
                double temp = inverse[i][j];
                inverse[i][j] = inverse[j][i] * det;
                inverse[j][i] = temp * det;
            }
        }

        return inverse;
    }

    private static double[][] minor(double[][] matrix, int row, int column) {
        double[][] minor = new double[matrix.length - 1][matrix.length - 1];

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; i != row && j < matrix[i].length; j++)
                if (j != column)
                    minor[i < row ? i : i - 1][j < column ? j : j - 1] = matrix[i][j];
        return minor;
    }

/*    private static double[][] multiply(double[][] a, double[][] b) {
        if (a[0].length != b.length)
            throw new IllegalStateException("invalid dimensions");

        double[][] matrix = new double[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                double sum = 0;
                for (int k = 0; k < a[i].length; k++)
                    sum += a[i][k] * b[k][j];
                matrix[i][j] = sum;
            }
        }

        return matrix;
    }*/


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        printMenu();
        System.out.print("Your choice:");
        int choice = in.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    addMatrices();
                    break;
                case 2:
                    multiplyMatrixByConstant();
                    break;
                case 3:
                    multiplyMatrices();
                    break;
                case 4:
                    subMenu();
                    System.out.print("Your choice:");
                    choice = in.nextInt();
                    if (choice == 1) {
                        mainDiagonal();
                        break;
                    } else if (choice == 2) {
                        sideDiagonal();
                        break;
                    } else if (choice == 3) {
                        verticalDiagonal();
                        break;
                    }
                    horizontalDiagonal();
                    break;
                case 5:
                    System.out.print("Enter matrix size:");
                    double i;
                    double j;

                    int row1 = Integer.parseInt(in.next());


                    int col1 = Integer.parseInt(in.next());

                    arr = new double[row1][col1];

                    System.out.println("Enter matrix:");

                    for (i = 0; i < row1; i++) {

                        for (j = 0; j < col1; j++) {

                            arr[(int) i][(int) j] = in.nextDouble();
                        }
                    }
                    Determinant d = new Determinant();
                    double res = d.res(arr);
                    System.out.println(res);
                    break;
                case 6:
                    inverseMatrix();
                    break;


            }
            printMenu();
            System.out.print("Your choice:");

            choice = in.nextInt();

        }
        System.exit(0);
    }
}