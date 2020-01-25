package pl.mschielmann.java.course.lesson4.exercise2;

public class Fruit {
    private String type;
    private Integer weight;

    public Fruit(String type, Integer weight) {
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public Integer getWeight() {
        return weight;
    }
}
