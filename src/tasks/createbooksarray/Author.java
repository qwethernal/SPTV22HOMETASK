package tasks.createbooksarray;

import java.util.Arrays;
import java.util.Objects;

public class Author {
    private String lastname;
    private String firstname;
    private Book[] books;

    public Author() {}

    public Author(String lastname, String firstname, Book[] books) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.books = books;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.lastname);
        hash = 97 * hash + Objects.hashCode(this.firstname);
        hash = 97 * hash + Arrays.deepHashCode(this.books);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Author other = (Author) obj;
        if (!Objects.equals(this.lastname, other.lastname)) {
            return false;
        }
        if (!Objects.equals(this.firstname, other.firstname)) {
            return false;
        }
        if (!Arrays.deepEquals(this.books, other.books)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder booksList = new StringBuilder();
        if (books.length > 0) {
            for (int i = 0; i < books.length - 1; i++) {
                booksList.append(books[i].getTitle()).append(", ");
            }
            booksList.append(books[books.length - 1].getTitle());
        }

        return firstname + " " + lastname + ": " + booksList;
    }
}
