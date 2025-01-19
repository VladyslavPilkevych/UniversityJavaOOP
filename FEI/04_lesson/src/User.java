class User {
    private String name;
    private int age;
    private String surname;
    private String registrationDate;
    private String phoneNumber;
    private String email;
    private String country;

    public User(String name, int age, String surname, String registrationDate, String phoneNumber, String email, String country) {
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.registrationDate = registrationDate;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.country = country;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }
    public String getRegistrationDate() { return registrationDate; }
    public void setRegistrationDate(String registrationDate) { this.registrationDate = registrationDate; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + ", surname='" + surname + "', registrationDate='" + registrationDate + "', phoneNumber='" + phoneNumber + "', email='" + email + "', country='" + country + "'}";
    }
}
//kl