package com.crimsonlogic.mapexamples.librarymanagement;

import java.util.Objects;

public class BookClass {

    private int bookId;

    private double bookPrice;
    private String title;
    private String author;
    private String category;

    private boolean issued;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }


    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isIssued() {
        return issued;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookClass bookClass = (BookClass) o;
        return bookId == bookClass.bookId && Double.compare(bookPrice, bookClass.bookPrice) == 0 && issued == bookClass.issued &&  Objects.equals(title, bookClass.title) && Objects.equals(author, bookClass.author) && Objects.equals(category, bookClass.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId,  bookPrice, title, author, category, issued);
    }

    @Override
    public String toString() {
        return "BookClass{" +
                "bookId=" + bookId +
                ", bookPrice=" + bookPrice +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", issued=" + issued +
                '}';
    }
}
