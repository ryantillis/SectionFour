public class Main {
    public static void main(String[] args) {
//        long miles = SpeedConverter.toMilesPerHour(10.5);
//
//        System.out.println("Miles = " + miles);
//        SpeedConverter.printConversion(10.5);

//        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
//        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
//        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);

        BarkingDog.shouldWakeUp(true,1);
        boolean test = BarkingDog.shouldWakeUp(false,2);
        System.out.println(test);
        BarkingDog.shouldWakeUp(true,8);
        BarkingDog.shouldWakeUp(true,-1);
    }
    }
