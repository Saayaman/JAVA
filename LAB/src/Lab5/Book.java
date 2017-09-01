package Lab5;

public class Book {

    Name firstName;
    Name lastName;

    protected String title;
    protected int yearPublished;

    public Book(Name firstName, Name lastName, String title, int yearPublished) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.yearPublished = yearPublished;
    }

}
