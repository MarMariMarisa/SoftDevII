package unit01.hwAssignments;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Base100Converter {
    public static int charToInteger(char d){
        return (int)d - 48;
    }
    public static int arrayToInteger(char[] anArray,double base,boolean isEndian){
        int output = 0;
        if(isEndian == true){
            for(int i = 0;i < anArray.length;i++){
                output = output + (int)((double)((charToInteger(anArray[i])) * Math.pow(base, (anArray.length - (i + 1)))));
            }
        }else{
            for(int i = 0;i < anArray.length;i++){
                output = output + (int)((double)((charToInteger(anArray[i])) * Math.pow(base,i)));
            }
        }
        return output;
    }  
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your filename: ");
        try{
            String filename = scanner.next();
            File file = new File(filename);
            Scanner scanner2 = new Scanner(file);
            Scanner counter = new Scanner(file);
            int count = 0;
            while(counter.hasNextLine()) {
                counter.nextLine();
                count++;
              }
            counter.close();
            boolean isBigEndian = false;
            int base = scanner2.nextInt();
            String endianness = scanner2.next();
            if(endianness == "big-endian"){
                isBigEndian = true;
            }
            System.out.println("Base: " + base + "\nEndianess: " + endianness);
            for(int i = 2;i< count;i++){
                String input = scanner2.next();
                char[] anArray = input.toCharArray();
                int expected = scanner2.nextInt();
                int actual = arrayToInteger(anArray, base, isBigEndian);
                if(actual == expected){
                    System.out.println(input + ": " + actual + " (match)");
                }else{
                    System.out.println(input + ": " + actual + " (mismatch " + expected + ")");
                }
            }
            scanner.close();
            scanner2.close();
        }
        catch(FileNotFoundException fnf){
            System.out.println("File not found.");

        }

    }
}
