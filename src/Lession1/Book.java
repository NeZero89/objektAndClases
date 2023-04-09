package Lession1;

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
}
