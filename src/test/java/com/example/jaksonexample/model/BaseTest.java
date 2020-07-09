package com.example.jaksonexample.model;

import com.example.jaksonexample.Model.ProductDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest {
    @Autowired
    ObjectMapper mapper;

    ProductDto getDto(){
        return ProductDto.builder()
                .id(UUID.randomUUID())
                .name("Mj")
                .style("Big")
                .price(new BigDecimal("12.123"))
                .upc(123123123123L)
                .createdDate(OffsetDateTime.now())
                .lastUpdateDate(OffsetDateTime.now())
                .localDate(LocalDate.now())
                .build();
    }
}
