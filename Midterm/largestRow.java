public class Question2 {
    public static void main(String[] args){
        int arr[][] = {{ 10,45,3,8}, {2, 42}, {3,21,44}};
        System.out.println("The row with the largest sum is" + largestRow(arr));
    }


public static int largestRow(int [][] myArray){
    int frSum = 0;
    int srSum = 0;
    int tRow = 0;
    for(int row = 0;  row< myArray.length; row++){
        for(int col = 0; col< myArray[row].length; col++){
            frSum = frSum + myArray[row][col];
        }
        if(frSum > srSum)  {
        srSum = frSum;
        tRow = row;
        }

    }
    return tRow;
}
}