package com.company.javaZaawansowanaZadania.WyjatkiZadania;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    List<Book> books = new ArrayList<>();

    public  void add(Book book){
        books.add(book);
    }

    public Book findBookByTitle(String title) throws NoBookFoundExeption {
        for(Book b: books){
            if(b.getTitle().equals(title)){
                return b;
            }
        }throw new NoBookFoundExeption("Can't find book: " + title);
    }


    public Book findBookByID(long id) throws NoBookFoundExeption {
        for(Book b: books){
            if( b.getIsbn() == id){
                return b;
            }
        }
        throw new NoBookFoundExeption("Can't find book: " + id);
    }
    public void deleteBookById(long id) throws NoBookFoundExeption {
        for (Book b: books){
            if( b.getIsbn() == id){
                books.remove(b);
            }else{
                throw new NoBookFoundExeption("Can't find book: " + id);
            }
        }
    }
}
