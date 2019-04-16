package be.tomcools.upgrade.optional;

import java.util.Optional;

public class OptionalTarget {

    public static Optional<Book> getBook(){
        return Optional.of(new Book("Game of Thrones"));
    }

    public static Optional<Book> getBookWithAuthor(){
        return Optional.of(new Book("Game of Thrones", "Martin The Destroyer"));
    }

}
