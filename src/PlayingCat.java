public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int add = 0;
        if(summer == true){add = 10;} else {add = 0;}
        System.out.println(add);
        if((temperature >= 25) && (temperature <= 35 + add)) {
            return true;
        } else {return false;}

    }

}
