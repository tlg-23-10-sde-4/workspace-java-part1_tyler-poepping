public class TelevisionValidationTest {
    public static void main(String[] args) {
        Television tv = new Television();
        tv.setVolume(0);
        // Volume zero test
        System.out.println(tv);
        System.out.println();

        // Volume 100 test
        tv.setVolume(100);
        System.out.println(tv);
        System.out.println();

        // Volume out of bounds test
        tv.setVolume(-1);
        System.out.println(tv);
        System.out.println();

        tv.setVolume(101);
        System.out.println(tv);
        System.out.println();

        // SAMSUNG TEST
        tv.setBrand("Samsung");
        System.out.println(tv);
        System.out.println();

        // LG TEST
        tv.setBrand("LG");
        System.out.println(tv);
        System.out.println();

        // SONY TEST
        tv.setBrand("Sony");
        System.out.println(tv);
        System.out.println();

        // TOSHIBA TEST
        tv.setBrand("Toshiba");
        System.out.println(tv);
        System.out.println();

        // ERROR TEST
        tv.setBrand("HiSense");
        System.out.println(tv);
        System.out.println();

        //
        tv.setVolume(40);
        tv.mute();
        tv.mute();
    }
}