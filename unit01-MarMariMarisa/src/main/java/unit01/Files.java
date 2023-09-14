// package unit01;
// import java.io.BufferedReader;
// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.FileReader;
// import java.io.IOError;
// import java.io.IOException;
// import java.nio.file.*;
// import java.util.Scanner;

// public class Files {
//     public static void info(String filename){
//         File file = new File(filename);
//         System.out.println("Exists: " + file.exists());
//         System.out.println("Abs Path = " + file.getAbsolutePath());
//         System.out.println("Is directory: " + file.isDirectory());
//         System.out.println("Length =  " + file.length());
//     } 
//     // public static void printFile(String filename){
//     //     try{    
//     //         // FileReader fr = new FileReader(filename);
//     //         // BufferedReader br = new BufferedReader(fr);
//     //         // String line = br.readLine();
//     //         // System.out.println(line);
//     //         // fr.close();
//     //         // br.close();
//     //         System.out.println("h");
//     //     }
//     //     catch(FileNotFoundException fnf){
//     //         System.out.println(filename + "does not exists");

//     //     }
//     //     catch(IOError ioe){
//     //         System.out.println("IO exception");

//     //     }

//     // }
//     public static void printFileRethrow(String filename) throws FileNotFoundException,IOException{
//         try{    
//             FileReader fr = new FileReader(filename);
//             BufferedReader br = new BufferedReader(fr);
//             String line = br.readLine();
//             System.out.println(line);
//             fr.close();
//             br.close();
//         }
//         catch(FileNotFoundException fnf){
//             System.out.println(filename + "does not exists");

//         }
//         catch(IOError ioe){
//             System.out.println("IO exception");

//         }

//     }
//     public static void printFileTryWithResource(String filename) throws FileNotFoundException,IOException{
//         try(   
//             FileReader fr = new FileReader(filename);
//             BufferedReader br = new BufferedReader(fr);
//         ){
//             String line = br.readLine();
//             System.out.println(line);
//         }
//         catch(FileNotFoundException fnf){
//             System.out.println(filename + "does not exists");

//         }
//         catch(IOError ioe){
//             System.out.println("IO exception");

//         }

//     }
//     public static void main(String[] args) throws IOExecption{
//         info("data/alice.txt");
//     }
// }
