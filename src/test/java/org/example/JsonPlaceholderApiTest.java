package org.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class JsonPlaceholderApiTest {

    @Test
    void testPosts() throws IOException {
        //Arrange
        JsonPlaceholderApi service = JsonPlaceholderApi.getInstance();

        //Act
        List<Post> result = service.posts().execute().body();

        //Assert
        assertNotNull(result);
        assertEquals(100, result.size(), "Post count should be 100");

    }


}