package exercises.arrays.twoDimensional;

public class TwoDimensionalArrayProcessor {
    public static void main(String[] args) {
        double[][] array2D = {{1.0, 1.5, 2.0},
                              {1.5, 2.0, 2.5},
                              {2.0, 2.5, 3.0}};

        System.out.println("The sum of products of diagonal elements equals = " +
                ((array2D[0][0] * array2D[1][1] * array2D[2][2]) + (array2D[0][2] * array2D[1][1] * array2D[2][0])));
        System.out.println("The product of middle row and column elements sum = " +
                ((array2D[1][0] + array2D[1][1] + array2D[1][2]) * (array2D[0][1] + array2D[1][1] + array2D[2][1])));
        System.out.println("The sum of all edge elements equals = " +
                (array2D[0][0] + array2D[0][1] + array2D[0][2] + array2D[1][0] + array2D[1][2] + array2D[2][0] +
                array2D[2][1] + array2D[2][2]));
    }
}
