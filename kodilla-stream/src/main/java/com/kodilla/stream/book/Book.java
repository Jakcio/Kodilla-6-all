package com.kodilla.stream.book;

public final class Book {
    private final String author;
    private final String title;
    private final int yearofPublication;
    private final String signature;


    public Book(final String author, final String title, final int yearofPublication, final String signature) {
        this.author = author;
        this.title = title;
        this.yearofPublication = yearofPublication;
        this.signature = signature;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearofPublication() {
        return yearofPublication;
    }
    public String getSignature(){
        return signature;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearofPublication=" + yearofPublication +
                '}';
    }
}
