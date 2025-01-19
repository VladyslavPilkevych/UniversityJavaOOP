class Employee implements Person {
    private String name;
    private String surname;
    private int age;

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String getInfo() {
        return "name: " + name + ", surname " + surname + ", years to retire: " + (62 - age);
    }

}