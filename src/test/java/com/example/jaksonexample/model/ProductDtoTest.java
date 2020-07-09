package com.example.jaksonexample.model;

import com.example.jaksonexample.Model.ProductDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
public class ProductDtoTest extends BaseTest {

    @Test
    void testSerializeDto() throws JsonProcessingException {
        String jsonString = mapper.writeValueAsString(getDto());
        System.out.println(jsonString);
    }

    @Test void testDeserializeDto() throws JsonProcessingException {
        String json = "{\"name\":\"Mj\",\"style\":\"Big\",\"upc\":123123123123,\"price\":\"12.123\",\"createdDate\":\"2020-07-09T05:27:40+0430\",\"lastUpdateDate\":\"2020-07-09T05:27:40.6603325+04:30\",\"localDate\":\"20200709\",\"productId\":\"f887fe89-768f-4cb1-a410-6294068ee7bb\"}";
        ProductDto productDto = mapper.readValue(json,ProductDto.class);
        System.out.println(json);
    }
}
