package ru.mirea.practice.task1;

public class Author {
    private final char gender;
    private String name;
    private String email;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return "Author{" + "name=" + name + ", Email=" + email + ", gender=" + gender + '\'' + '}';
    }
}
