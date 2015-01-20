package com.dataethos.java8.traversal;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Ben Tran
 */
public class CollectionTraveralTest {
    @Test
    public void forEach() {
        List<String> helloWorldList = Arrays.asList("Hello", ", ", "World!");

        helloWorldList.forEach(System.out::print);
    }
}
