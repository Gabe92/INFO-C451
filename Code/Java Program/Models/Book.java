/*
 * Gabriel Agbo
 * Virtual Library/Library Management System Project
 * INFO-C451
 * 03/11/2022
 */
package com.teamsix.virtuallibrary.models;

public class Book {
    
    public int bookId;
    public int libraryId;
    public int iSBN;
    public String bookTitle;
    public String bookAuthor;
    public int yearPublished; 
    public Boolean isFiction;
    

    
    public Book (int bookId, int libraryId, int iSBN, String bookTitle, 
            String bookAuthor, int yearPublished, Boolean isFiction){
    
        this.bookId = bookId;
        this.libraryId = libraryId;
        this.iSBN = iSBN;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor; 
        this.yearPublished = yearPublished;
        this.isFiction = isFiction;
    }      
    
    public int getBookId () {
        return this.bookId;
    }
   
    public void setBookId (int bookId) {
        this.bookId = bookId;
    }
    
    public int getLibraryId () {
        return this.libraryId;
    }
   
    public void setLibraryId (int libraryId) {
        this.libraryId = libraryId;
    }
    
    public int getISBN () {
        return this.iSBN;
    }
   
    public void setISBN (int iSBN) {
        this.iSBN = iSBN;
    }
    
    public String getBookAuthor () {
        return this.bookAuthor; 
    }
    
    public void setBookAuthor (String bookAuthor) {
        this.bookAuthor = bookAuthor; 
    }
    
    public String getBookTitle () {
        return this.bookTitle; 
    }
    
    public void setBookTitle (String bookTitle) {
        this.bookTitle = bookTitle; 
    }
    
    public boolean getIsFiction () {
        return this.isFiction;
    }
   
    public void setIsFiction (boolean isFiction) {
        this.isFiction = isFiction;
    }
}
    
