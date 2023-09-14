package unit01;

public class Casting {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        int a = 123;
        float b = 12.3F;
        //Values of less comples type (int) can be assigned to a variable of
        //More complex type(long)
        long c = a;
        double d = b;

        double x = 3.14;
        long y = 314L;
        //Values of mor ocmplex type cannot be assigned to a var of less complex type
        int z = (int)y;
        float w = (float)x;

        boolean e = true;
    }
}
