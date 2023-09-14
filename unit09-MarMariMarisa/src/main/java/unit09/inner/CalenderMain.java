package unit09.inner;

public class CalenderMain {
    public static void main(String[] args) {
        Calendar.DayOfWeek today = Calendar.DayOfWeek.MONDAY;
        System.out.println(today);
        System.out.println(today.tomorrow());
    }
}