public class TelevisionClient {
    public static void main(String[] args) {
        // TV-1
        Television tv1 = new Television();
        tv1.setBrand("Samsung"); // Set the brand using the setter
        tv1.setVolume(20); // Set the volume using the setter
        tv1.setDisplay(DisplayType.OLED);

        tv1.mute();
        System.out.println(tv1);

        Television tv2 = new Television("Toshiba", tv1.getVolume(), false, 30, DisplayType.OLED);

        System.out.println(tv2.toString());


    }
}