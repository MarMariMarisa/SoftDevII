// package unit02;

// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.Scanner;

// public class Practice01 {
//    public static String arrayToString(int[] anArray){
//         String string = "";
//         for(int i = 0;i< anArray.length; i++){
//             string = string + anArray[i];
//         }
//         return string;
//    } 

//    @SuppressWarnings("unused")
//    public static int printLines(String c,String filename){
//         int lineCount = 0;
//         try{
//             File file = new File(filename);
//             Scanner scanner = new Scanner(file);
//             for(int i = 0;scanner.hasNext() == true;i++){
//                 String line = scanner.nextLine().toLowerCase();
//                 if(line != ""){
//                     char start = line.charAt(0);
//                     if(start == c ){
//                         lineCount++;
//                         System.out.println(line);
//                     }
//                 }
//             }
//             scanner.close();
//             return lineCount;
//         }
//         catch(FileNotFoundException fne){
//             System.out.println("File Not Found");
//             return lineCount;
//         }
//    }
//    public static void main(String[] args){
//         int count = printLines('b', "data/alice.txt");
//         System.out.println("Lines printed: " + count);

//    }
// }
