package com.example.demo.polymorphism;

public class Contact implements Comparable<Contact>{
    private String firstName;
    private String lastName;
    private String phone;

    public Contact(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        return (lastName.equals(((Contact)other).getLastName()) &&
                firstName.equals(((Contact)other).getFirstName()));
    }

    public int compareTo(Contact other)
    {
        int result;
        if (lastName.equals(other.getLastName()))
            result = firstName.compareTo(other.getFirstName());
        else
            result = lastName.compareTo(other.getLastName());
        return result;
    }

}