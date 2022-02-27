package com.company.javaZaawansowanaZadania.KolekcjeZadania.Zadnie1245;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book  {

    private String title;
    private float price;
    private int realeaseDate;
    List<Author> authors = new ArrayList<>();
    public Genre genre;

    public Book(String title, float price, int realeaseDate, List<Author> authors, Genre genre) {
        this.title = title;
        this.price = price;
        this.realeaseDate = realeaseDate;
        this.authors = authors;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getRealeaseDate() {
        return realeaseDate;
    }

    public void setRealeaseDate(int realeaseDate) {
        this.realeaseDate = realeaseDate;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", realeaseDate=" + realeaseDate +
                ", authors=" + authors +
                ", genre=" + genre +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Float.compare(book.getPrice(), getPrice()) == 0 && getRealeaseDate() == book.getRealeaseDate() && getTitle().equals(book.getTitle()) && getAuthors().equals(book.getAuthors()) && getGenre() == book.getGenre();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getPrice(), getRealeaseDate(), getAuthors(), getGenre());
    }
}
