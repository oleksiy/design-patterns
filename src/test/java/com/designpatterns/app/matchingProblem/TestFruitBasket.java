package com.designpatterns.app.matchingProblem;

import com.designpatterns.app.matchingproblem.FruitBasket;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
public class TestFruitBasket {
    @Autowired
    private FruitBasket fruitBasket;

    @Disabled("needs to be addressed")
    @Test
    public void testWinner() {
        List<String> codes = List.of("orange", "apple apple", "banana orange apple", "banana");
        List<String> cart = List.of("orange","apple", "apple", "banana", "orange", "apple", "banana");
        fruitBasket = new FruitBasket(codes, cart);

        assertEquals(1, fruitBasket.isWinner(codes,cart));
    }

    @Test
    public void testPq() {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((n1, n2) -> n1 - n2);
        maxHeap.add(5);
        maxHeap.add(1);
        maxHeap.add(15);
        maxHeap.add(2);
        List<Integer> list = new ArrayList<>(maxHeap);
        maxHeap.forEach(x -> System.out.println(x));
        log.info("poll returns {} {} {} {}", maxHeap.poll(), maxHeap.poll(), maxHeap.poll(), maxHeap.poll());
    }
}
