import jdk.nashorn.internal.runtime.Undefined;

public class Questions2 {
    public static void main(String args[]){
        

            
            
                int [][] a = {{1,3,3,2},{4,2,5,6},{1,2,3,4},{7,8,9,4}};
   if (diagonalEqualsRows(a,9))
      System.out.println("Yes.");
    }
    

    public static boolean diagonalEqualsRows(int [][] myArray, int row){
        int rowSum = 0, diagSum = 0;
        if( myArray.length != myArray[row].length){
            throw new IllegalArgumentException("Not a perfect matrix");
        }

        if (row >= myArray.length) {
            throw new IllegalArgumentException("Out of bounds");
        }

        
            for(int col = 0 ; col < myArray[row].length; col++){
                rowSum += myArray[row][col];
                diagSum += myArray[col][col];

            }

            return rowSum == diagSum;
        


    }
}