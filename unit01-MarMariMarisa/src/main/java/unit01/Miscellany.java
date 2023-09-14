package unit01;
import java.util.Arrays;
public class Miscellany {
    public static String reverseChars(String aString){
        String reversed = "";
        for(int i = 0; i < aString.length();i++){
            reversed = aString.charAt(i) + reversed;
        }
        return reversed;
    }
    public static int[] squares(int n){
        int[] square = new int[n];
        for(int index = 0; index <n; index ++){
            square[index] = index*index;
        }
        return square;
    }
    public static int[][] table(int rows, int cols){
        int[][] twoDArray = new int[rows][cols];
        for(int row = 0; row<rows;row++){
            for(int col = 0; col<cols;col++){
                twoDArray[row][col] = (row + 1)*(col+1);
            }
        }
        return twoDArray;

    }
    @SuppressWarnings("unused")
    public static void characters(){
        String aString = "help";
        //Way one
        char[] anArray = new char[4];
        anArray[0] = 'h';
        anArray[1] = 'e';
        anArray[2] = 'l';
        anArray[3] = 'p';
        System.out.println(anArray);
        //Shortcut
        char[] anArray2 = {'h','e','l','p'};
        System.out.println(anArray2);
        //from string
        char[] anArray3 = "help".toCharArray();
        System.out.println(anArray3);


    }
    @SuppressWarnings("unused")
    public static void main(String[] args){
    //ragged array
    int[][] anArray = new int[3][];
    anArray[0] = new int[5];
    anArray[1] = new int[7];
    anArray[0][0] = 10;
    
        //  int[][] twoDArray = table(4,7);
    //    for(int i = 0;i < twoDArray.length;i++){
    //         System.out.println(Arrays.toString(twoDArray[i]));
    //    }
        // int[] shortArray = {10,15,20,12,40};
        // int[] anArray = squares(10);
        // String aString = Arrays.toString(anArray);
        // System.out.println(aString);
        // System.out.println(reverseChars("Hello There!"));

    }
}
