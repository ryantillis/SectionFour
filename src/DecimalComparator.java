public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double one, double two){
        double multOne = one*1000;
        double multTwo = two*1000;
        int testOne = (int) multOne;
        int testTwo = (int) multTwo;
        System.out.println(testOne);
        System.out.println(testTwo);
        if(testOne == testTwo)
        {return true;}
        else {return false;}

    }
}
