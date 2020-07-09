package com.example.jaksonexample.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("kebab")
@JsonTest
public class ProductDtoKebabTest extends BaseTest {

    @Test
    void testSerializeDto() throws JsonProcessingException {
        String jsonString = mapper.writeValueAsString(getDto());
        System.out.println(jsonString);
    }
}
