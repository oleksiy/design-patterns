package com.designpatterns.app.matchingProblem;

import com.designpatterns.app.matchingproblem.FruitBasket;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
public class TestFruitBasket {
    @Autowired
    private FruitBasket fruitBasket;

    @Test
    public void testWinner() {
        List<String> codes = List.of("orange", "apple apple", "banana orange apple", "banana");
        List<String> cart = List.of("orange","apple", "apple", "banana", "orange", "apple", "banana");
        fruitBasket = new FruitBasket(codes, cart);

        assertEquals(1, fruitBasket.isWinner(codes,cart));
    }
}
