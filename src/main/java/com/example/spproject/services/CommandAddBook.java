package com.example.spproject.services;
import com.example.spproject.Book;
public class CommandAddBook implements Command<Book> {
    private BookServices books;

    private Book newBook;

    @Override
    public Book execute() {
        return books.createBook(newBook);
    }

    public CommandAddBook(BookServices contextbooks){
        this.books = contextbooks;
    }

    public void setAtribute(Book newBook){
        this.newBook = newBook;
    }
}