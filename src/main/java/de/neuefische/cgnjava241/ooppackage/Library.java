package de.neuefische.cgnjava241.ooppackage;

import java.util.Arrays;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "{Library books:" + Arrays.toString(books) + "}";
    }

}
