
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean equals(Object compared) {
        // if the objectsr are in the same location return true
        if (this == compared) {
            return true;
        }

        // if the object is not of the type Person they are not equal and return false 
        if (!(compared instanceof Book)) {
            return false;
        }

        // convert the object inot Person type
        Book comparedBook = (Book) compared;

        // if the variables of the object are equal they are equal
        if (this.name.equals(comparedBook.name)
                && this.publicationYear == comparedBook.publicationYear) {
            return true;
        }
        // otherwise return false
        return false;
    }

}
