package be.tomcools.upgrade.optional;

import org.junit.Test;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class OptionalTest {

    @Test
    public void shouldCreateEmptyOptional(){
        Optional<String> optional = null; // create empty optional
        assertThat(optional.isPresent(),equalTo(false));
    }

    @Test
    public void shouldReturnBookName(){
        Optional<Book> book = OptionalTarget.getBook();
        String bookName = null; // book. ....
        assertThat(bookName,equalTo("Game of Thrones"));
    }

    @Test
    public void shouldReturnBookAuthor(){
        Optional<Book> book = OptionalTarget.getBookWithAuthor();
        String authorName = null; // book. ....
        assertThat(authorName,equalTo("Martin The Destroyer"));
    }

    @Test(expected = NoSuchElementException.class)
    public void shouldThrowNoElementException(){
        Optional<Book> book = OptionalTarget.getBook();
        book.get().getAuthor();
    }

    @Test(expected = MyCustomException.class)
    public void shouldThrowOptionalEmptyException(){
        Optional<Book> book = OptionalTarget.getBook();
        book.get().getAuthor(); // getAuthor.or.....
    }

}
