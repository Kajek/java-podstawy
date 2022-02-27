package com.company.javaZaawansowanaZadania.WyjatkiZadania;

import java.util.Objects;

public class Book {

    private long isbn;
    private String title;
    private String author;
    private int releasedIn;

    public Book(long isbn, String title, String author, int releasedIn) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.releasedIn = releasedIn;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleasedIn() {
        return releasedIn;
    }

    public void setReleasedIn(int releasedIn) {
        this.releasedIn = releasedIn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", releasedIn=" + releasedIn +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getIsbn() == book.getIsbn() && getReleasedIn() == book.getReleasedIn() && Objects.equals(getTitle(), book.getTitle()) && Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIsbn(), getTitle(), getAuthor(), getReleasedIn());
    }
}
