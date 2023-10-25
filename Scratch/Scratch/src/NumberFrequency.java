public class NumberFrequency {
    public static Integer MIN = 1;
    public static Integer MAX = 20;

    public static void main(String[] args) {
        numberFrequency();
    }

    public static Integer getRandomInt(Integer min, Integer max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void numberFrequency() {
        Integer[] intArray = new Integer[MAX + 1]; // Array size should cover the range [MIN, MAX]

        for (int i = 0; i < 1000; i++) {
            Integer randomInt = getRandomInt(MIN, MAX);
            intArray[randomInt] = intArray[randomInt] == null ? 1 : intArray[randomInt] + 1;
        }

        for (int i = MIN; i <= MAX; i++) {
            if (intArray[i] != null) {
                System.out.println(i + " was called " + intArray[i] + " times");
            }
        }
    }
}