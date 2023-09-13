package ru.netology.javaql.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestServiceTest {
    @Test
    public void calculateForMinIncome() {
        RestService service = new RestService();

        int actual = service.calculate(10000, 3000, 20000);
        int expectes = 3;

        Assertions.assertEquals(expectes, actual);
    }
}

