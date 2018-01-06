public class Question2{
    public static void main(String[] args) {
        int[][] a = { { 1, 3, 3, 2 }, { 4, 2, 5, 6 }, { 1, 2, 3, 4 }, { 7, 8, 9, 4 } };
        if (diagonalEqualsRow(a, 2))
            System.out.println("Yes.");

    }

public static boolean diagonalEqualsRow( int[][] myArray, int row){ //SEARCH UP HEADER LINES.
    int dSum = 0; 
    int sum = 0;

        if (myArray.length != myArray[row].length) { //JUST INCASE row doesn't exist, put 0.
            throw new IllegalArgumentException("This is not a square matrix!");
        }

    for(int sCol = 0; sCol < myArray[row].length; sCol++){
        sum = sum + myArray[row][sCol];
    }

    for(int dRow=0; dRow<myArray.length; dRow++ ){
        for(int dCol=0; dCol<myArray[dRow].length; dCol++){
            if( dRow == dCol){
                dSum = dSum + myArray[dRow][dCol];
            }
        }
    }


    //MISSING ROW out of range! function.

    
    return sum == dSum;
}
}

//MY METHOD WORKS...! But answer method is shorter and easier.!