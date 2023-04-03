package com.amajidi.designpatternexample.structural.adapter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = AdapterApp.class)
public class AdapterAppTest {

    @Autowired
    private CatalogService catalogService;

    @Test
    void testAdapter() {
        Movie movie = new Movie("The Dark Knight", "Christopher Nolan", "13+");
        Book book = new Book("Inferno", "Dan Brown");
        Game game = new Game("The Legend of Zelda : Tears of The Kingdom", "Nintendo", 9.7);

        catalogService.display(movie);
        catalogService.display(new BookAdapter(book));
        catalogService.display(new GameAdapter(game));
    }
    
}
