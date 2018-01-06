/*
    Question 2.
      Write the missing method below that will return the sum of a given row in the array.
      public class Question4{
      public static void main(String args[]){
      int arr[][] = {{10, 45}, {2, 42, 67, 5}, {3, 21}};
      System.out.println(getSumofRow(arr, 1));  //prints the sum of row 1
      }
      private static int getSumOfRow (int [][] myArray, int row) {
      } // getSumOfRow
      } //main
    */

    public class Question2A{

      public static void main(String args[]){
      
          int arr[][] = {{10, 45}, {2, 42, 67, 5}, {3, 21}};

      System.out.println(getSumOfRow(arr, 1));  //prints the sum of row 1
      }
      private static int getSumOfRow (int [][] myArray, int row) {
          int rowSum = 0;
              for ( int col = 0; col < myArray[row].length; col++){
                     rowSum = rowSum + myArray[row][col];
              }
          return rowSum;
      } // getSumOfRow
      } //main