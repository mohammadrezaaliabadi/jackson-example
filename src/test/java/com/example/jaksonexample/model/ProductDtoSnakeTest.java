package com.example.jaksonexample.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("snake")
@JsonTest
public class ProductDtoSnakeTest extends BaseTest {

    @Test
    void testSerializeDto() throws JsonProcessingException {
        String jsonString = mapper.writeValueAsString(getDto());
        System.out.println(jsonString);
    }
}
