class HelloWorld {
    public static void main(String[] args) {
        Words sayWord = new Words();
        String sentence = sayWord.sayHello() + " " + sayWord.sayWorld();
        String anotherSentence = sayWord.sayCustomWord("I LOVE INTELLIJ");

        System.out.println(sentence); // Prints Hello World
        System.out.println(anotherSentence); // Prints I LOVE INTELLIJ
    }
}
