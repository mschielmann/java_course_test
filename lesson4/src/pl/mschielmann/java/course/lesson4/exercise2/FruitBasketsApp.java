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
         * 5) Find the weight of the heaviest and of the lightest fruit in each basket.
         */
    }

    private static Fruit[] fruits = new Fruit[] {
            new Fruit("Orange", 290),
            new Fruit("Apple", 212),
            new Fruit("Plum", 51),
            new Fruit("Pear", 122),
            new Fruit("Apple", 199),
            new Fruit("Plum", 55),
            new Fruit("Banana", 190),
            new Fruit("Orange", 288),
            new Fruit("Apple", 209),
            new Fruit("Plum", 57),
            new Fruit("Plum", 52),
            new Fruit("Pear", 119),
            new Fruit("Pear", 126),
            new Fruit("Banana", 210),
            new Fruit("Banana", 205),
            new Fruit("Orange", 310),
            new Fruit("Banana", 198),
            new Fruit("Apple", 203),
            new Fruit("Orange", 303),
            new Fruit("Apple", 195),
            new Fruit("Pear", 121),
            new Fruit("Pear", 119),
            new Fruit("Plum", 52),
            new Fruit("Plum", 54)
    };
}
