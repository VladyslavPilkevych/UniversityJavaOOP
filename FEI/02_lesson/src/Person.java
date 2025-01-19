public class Person {
    private String name;
    private Number age;

    public Person(String name, Number age) {
        this.name = name;
        this.age = age;
    }

    public String getDescription() {
        return "Name: " + name + ", Age: " + age;
    }

}
