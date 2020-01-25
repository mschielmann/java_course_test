package pl.mschielmann.java.course.lesson4.exercise2;

public class FruitBasketsApp {

    public static void main(String[] args) {
        Fruit[] fruitBasket = fruits;
        /*
         * Having a fruit basket `fruitBasket` defined above, please do the following:
         * 1) Print the total number of fruits and the total weight.
         * 2) Knowing that there should only be fruits of type `Orange`, `Apple`, `Plum`, `Pear`, `Banana`,
         * print the number of fruits and total weight of each type separately.
         * 3) Divide all fruits from the fruit basket into separate baskets, one for each type.
         * 4) As a double-check, print the number of fruits and their total weights for each basket separately.
         */
    }

    private static Fruit[] fruits = new Fruit[] {
            new Fruit("Orange", 51),
            new Fruit("Apple", 51),
            new Fruit("Plum", 51),
            new Fruit("Pear", 51),
            new Fruit("Apple", 51),
            new Fruit("Plum", 51),
            new Fruit("Banana", 51),
            new Fruit("Orange", 51),
            new Fruit("Apple", 51),
            new Fruit("Plum", 51),
            new Fruit("Plum", 51),
            new Fruit("Pear", 51),
            new Fruit("Pear", 51),
            new Fruit("Banana", 51),
            new Fruit("Banana", 51),
            new Fruit("Orange", 51),
            new Fruit("Banana", 51),
            new Fruit("Apple", 51),
            new Fruit("Orange", 51),
            new Fruit("Apple", 51),
            new Fruit("Pear", 51),
            new Fruit("Pear", 51),
            new Fruit("Plum", 51),
            new Fruit("Plum", 51)
    };
}
