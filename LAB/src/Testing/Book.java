package Testing;

public class Book {


    public static final String FIRST_BOOK_PUBLISHED_YEAR = "1455";
    public static String activity = "Reading";

    private int year;
    private String title;
    private String firstName;
    private String surName;

    public Book(int year, String title, String name, String surname) {
        this.year = year;
        this.title = title;
        this.firstName = name;
        this.surName = surname;
    }

    public static String getActivity() {
        return activity;
    }

    public String getAuthorInitials() {

        String firstInitial = String.valueOf(firstName.charAt(0));
        String secondInitial = String.valueOf(surName.charAt(0));

        return firstInitial.toUpperCase() + "." + secondInitial.toUpperCase() + ".";
    }

    public String getTitle() {

        String output = title.substring(0, 1).toUpperCase() + title.substring(1).toLowerCase();
        return output;
    }

    public int getYearPublished() {
        return year;
    }

    public String getAuthorFirstName() {
        return firstName;
    }

    public String getAuthorLastName() {
        return surName;
    }

    public String getDetails() {

        String details = title + " was published by " + firstName + " " + surName + " in " + year + "!";
        return details.toUpperCase();
    }
}
