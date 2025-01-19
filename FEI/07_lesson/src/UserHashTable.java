import java.util.LinkedList;
import java.util.Objects;

class User {
    private String username;
    private String hashedPassword;
    private String firstName;
    private String surname;
    private String email;

    public User(String username, String hashedPassword, String firstName, String surname, String email) {
        this.username = username;
        this.hashedPassword = hashedPassword;
        this.firstName = firstName;
        this.surname = surname;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

class UserHashTable {
    private class Entry {
        String key;
        User value;

        Entry(String key, User value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] table;
    private int capacity;

    @SuppressWarnings("unchecked")
    public UserHashTable(int capacity) {
        this.capacity = capacity;
        table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(String key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void insert(String key, User value) {
        int index = hash(key);
        for (Entry entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        table[index].add(new Entry(key, value));
    }

    public void delete(String key) {
        int index = hash(key);
        table[index].removeIf(entry -> entry.key.equals(key));
    }

    public User lookup(String key, String hashedPassword) {
        int index = hash(key);
        for (Entry entry : table[index]) {
            if (entry.key.equals(key) && entry.value.getHashedPassword().equals(hashedPassword)) {
                return entry.value;
            }
        }
        return null;
    }

    public void display() {
        for (int i = 0; i < capacity; i++) {
            System.out.print("Bucket " + i + ":");
            for (Entry entry : table[i]) {
                System.out.print(" -> [" + entry.key + ", " + entry.value + "]");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        UserHashTable userTable = new UserHashTable(5);

        User user1 = new User("user1", "pass1hash", "John", "Doe", "john.doe@example.com");
        User user2 = new User("user2", "pass2hash", "Jane", "Smith", "jane.smith@example.com");
        User user3 = new User("user3", "pass3hash", "Emily", "Jones", "emily.jones@example.com");
        User user4 = new User("user4", "pass4hash", "Michael", "Brown", "michael.brown@example.com");
        User user5 = new User("user5", "pass5hash", "Sarah", "Wilson", "sarah.wilson@example.com");

        userTable.insert(user1.getUsername(), user1);
        userTable.insert(user2.getUsername(), user2);
        userTable.insert(user3.getUsername(), user3);
        userTable.insert(user4.getUsername(), user4);
        userTable.insert(user5.getUsername(), user5);

        System.out.println("State of the hash table with all users:");
        userTable.display();

        userTable.delete("user3");

        System.out.println("State of the hash table after deleting user3:");
        userTable.display();

        User lookupUser = userTable.lookup("user2", "pass2hash");
        System.out.println("Lookup result for user2: " + lookupUser);
    }
}
