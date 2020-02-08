package pl.mschielmann.java.course.lesson3;

class Person {
    private String name;
    private String surname;
    private Integer age;

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer newAge) {
        if (newAge < age) {
            System.out.println("Sorry dear, you won't get any younger!");
        } else if (newAge.equals(age)) {
            System.out.println("That is the current age, no need for update.");;
        } else {
            System.out.println("Everyone gets older, there is no need to feel bad about it.");
            age = newAge;
        }
    }

    void introduceSelf() {
        System.out.println("Hi, I'm " + this.name + " " + this.surname + ". I'm " + this.age + " years old.");
    }
}
