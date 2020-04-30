package domain;

import java.util.Arrays;
/**
 * Solves the given problem ("Using N x M matrix create new matrix, where last column contains the sums of rows")
 * @author Andrei
 */
public class Exercise {
    
    private static byte[][] fillMatrix(byte[][] matrix){
        for(byte[] row: matrix)
            Arrays.fill(row, (byte)(Math.random()*10));
        return matrix;
    }
    /**
     * Creates matrix, copies it and fills the last column of new matrix with sums of row values
     * @param n number of rows
     * @param m number of columns
     * @return result matrix
     */
    
    public static String Calculate(byte n, byte m){
        StringBuilder result = new StringBuilder();
        byte[][] someMatrix = new byte[n][m];
        byte[][] resMatrix = new byte[n][m+1];
        byte count = 0;
        byte sum = 0;
        fillMatrix(someMatrix);        
        for(byte[] row: someMatrix){
            resMatrix[count] = Arrays.copyOf(row, resMatrix[0].length);
            count++;
        }
         for(byte[] row: resMatrix){
            for(byte i = 0; i<resMatrix[0].length; i++){
                sum+=row[i];
                if(i == (row.length-1)){
                    row[i] = sum;
                    sum = 0;
                    }
            }
            result.append(Arrays.toString(row));
            result.append("\n");
        }
       return result.toString();
    }
}