public class TeenNumberChecker {

    public static boolean hasTeen(int one, int two, int three){
        int[] intArray = new int[]{one, two, three};
        int i, x;
        boolean val = false;

        for (i = 0; i < 3; i++) {
            x = intArray[i];
            if((13 <= x) && (x <= 19)) {val = true;} else {continue;}
        }

    return val;}

    public static boolean isTeen(int test) {
        if((test <= 19) && (test >= 13)) {return true;} else {return false;}

    }

}
