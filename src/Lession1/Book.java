package Lession1;

import java.util.Objects;

public class Book {
    private String nameBook;
    private Author author;
    private int year;


    public Book(String nameBook,  Author author, int year){
        this.nameBook = nameBook;
        this.author = author;
        this.year = year;

    }
    public String getNameBook(){
        return this.nameBook;
    }
    public int getYear(){
      return this.year;
    }
    public Author getAuthor(){
        return this.author;
    }
    public void setYear(int year){
        this.year=year;
    }
    public String toString(){
        return " Название книги: " + this.nameBook+", год: "+this.year+", Автор: "+author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && nameBook.equals(book.nameBook) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, year);
    }
}
