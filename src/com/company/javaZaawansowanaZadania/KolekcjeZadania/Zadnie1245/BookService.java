package com.company.javaZaawansowanaZadania.KolekcjeZadania.Zadnie1245;

import java.util.*;

public class BookService {

    List<Book> books = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String title) throws NoBookFoundExeption {
        for (Book b : books) {
            if (b.getTitle().equals(title)) {
                books.remove(b);
            } else {
                throw new NoBookFoundExeption("No such book exists");
            }
        }
    }

    public List<Book> getAllBooksList() {
        return books;
    }

    public Book getChepestBook() {
        Book cheapestBook = null;
        for (Book b : books) {
            if (cheapestBook == null || b.getPrice() < cheapestBook.getPrice()) {
                cheapestBook = b;
            }
        }
        return cheapestBook;
    }

    public Book getMostExpensiveBook() {
        Book mostExpensiveBook = null;
        for (Book b : books) {
            if (mostExpensiveBook == null || b.getPrice() > mostExpensiveBook.getPrice()) {
                mostExpensiveBook = b;
            }
        }
        return mostExpensiveBook;
    }

    public Book getBookWithAtLeast3Authors() {
        for (Book b : books) {
            if (b.authors.size() >= 3) {
                return b;
            }
        }
        return null;
    }

    public Book findBook(String title) throws NoBookFoundExeption {
        for (Book b : books) {
            if (b.getTitle().equals(title)) {
                return b;
            }
        }
        throw new NoBookFoundExeption("No such book");
    }

    public List<Book> findBookByGenre(String genre) {
        List<Book> booksByGenre = new ArrayList<>();
        for (Book b : books) {
            if (b.genre.name().equals(genre.toUpperCase())) {
                booksByGenre.add(b);
            }
        }
        return booksByGenre;
    }

    public List<Book> findBookReleasedBefore(int releaseYear) {
        List<Book> booksReleasedBeforeResult = new ArrayList<>();
        for (Book b : books) {
            if (b.getRealeaseDate() < releaseYear) {
                booksReleasedBeforeResult.add(b);
            }
        }
        return booksReleasedBeforeResult;
    }

    public List<Book> findBooksByAuthor(Author author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book b : books) {
            for (Author a : b.authors) {
                if (a.equals(author)) {
                    booksByAuthor.add(b);
                }
            }
        }
        return booksByAuthor;
    }

    Comparator<Book> bookComparatorByPriceAscending = new Comparator<Book>() {
        @Override
        public int compare(Book b1, Book b2) {
            return Float.compare(b1.getPrice(), b2.getPrice());
        }
    };
    Comparator<Book> getBookComparatorByPriceDescending = new Comparator<Book>() {
        @Override
        public int compare(Book b1, Book b2) {
            return Float.compare(b2.getPrice(), b1.getPrice());
        }
    };

    Comparator<Book> bookTitleComparatorAscending = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    };
    Comparator<Book> bookTitleComparatorDescending = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return o2.getTitle().compareTo(o1.getTitle());
        }
    };


    public List<Book> sortBooks(String sortParameter) {
        List<Book> booksSorted = new ArrayList<>();
        System.out.println("You can sort by: title or price");
        System.out.println("Choose Argument to sort by: ");
        String userSortsBy = scanner.nextLine();
        switch (userSortsBy) {
            case "title":
                if (sortParameter.equals("ascending")) {
                    Collections.sort(books, bookTitleComparatorAscending);
                    booksSorted.addAll(books);
                } else if (sortParameter.equals("descending")) {
                    Collections.sort(books, bookTitleComparatorDescending);
                    booksSorted.addAll(books);
                }
            case "price":
                if (sortParameter.equals("ascending")) {
                    books.sort(bookComparatorByPriceAscending);
                    booksSorted.addAll(books);
                } else if (sortParameter.equals("descending")) {
                    books.sort(getBookComparatorByPriceDescending);
                    booksSorted.addAll(books);
                }
        }
        return booksSorted;
    }

    public boolean isBookInList(Book book) {
        return books.contains(book);
    }

    public Map<Genre, String> getMapOfBooks() {
        Map<Genre, String> mapOfBooksGenreTitle = new HashMap<>();
        for (Book b : books) {
            mapOfBooksGenreTitle.put(b.getGenre(), b.getTitle());
        }
        return mapOfBooksGenreTitle;
    }

    public Stack<Book> generateBooksStackByPriceDescending() {
        books.sort(getBookComparatorByPriceDescending);
        Stack<Book> stackOfBooksByPriceDescending = new Stack<>();
        for (Book b:books){
            stackOfBooksByPriceDescending.push(b);
        }return stackOfBooksByPriceDescending;
    }
}