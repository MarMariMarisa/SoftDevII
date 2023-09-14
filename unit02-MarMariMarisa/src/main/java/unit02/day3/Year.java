package unit02.day3;

import java.util.Random;

/**
 * Year class
 * 
 */
public class Year {
    private static final int DAYS_IN_YEAR = 365;
    private int yearNumber;
    private static Random random = new Random();
    public Year(int yearNUmber){
        this.yearNumber = yearNUmber;
    }
    public int getYearNumber(){
        return yearNumber;
    }
    public void setYearNumber(int yearNumber){
        this.yearNumber = yearNumber;
    }
    public int numberOfDays(){
        return daysInYear(yearNumber);
    }
    public static int daysInYear(int year){
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0 )){
            return DAYS_IN_YEAR+1;
        }else{
            return DAYS_IN_YEAR;
        }
    }
    public static Year getRandomYear(){
        int randYear = random.nextInt(14)+2000;
        return new Year(randYear);
    }
    @Override
    public String toString(){
        return "Year{yearNumber = "  + yearNumber + ", days =" + numberOfDays() + "}";
    }
    public static void main(String[] args){
        // Year year1 = new Year(2023);
        // int days = year1.numberOfDays();
        // System.out.println("Days in 2023: " + days);
        // System.out.println(year1);
        System.out.println(getRandomYear());
        System.out.println(getRandomYear());
        System.out.println(getRandomYear());
    }
}
