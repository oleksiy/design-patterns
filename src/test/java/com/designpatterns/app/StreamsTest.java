package com.designpatterns.app;

import com.designpatterns.app.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;


import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
public class StreamsTest {

    @Test
    public void testStreams() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, 150000L));
        employees.add(new Employee(2, 50000L));
        employees.add(new Employee(3, 85500L));
        StringBuffer sb = new StringBuffer();
        sb.append("a");
        StringBuffer sb2 = sb.delete(0, 1);
        log.info("Before {}, after {}", sb, sb2);
        Queue<Character> longestString = new LinkedList<>();
        longestString.add('a');
        longestString.add('b');
        longestString.add('c');
        longestString.add('z');
        ArrayList<String> list = new ArrayList<>();
        list.add(String.valueOf(longestString.toArray().toString()));
        System.out.println("This is a list -> " + list);
        System.out.println(longestString.contains('c'));
        System.out.println(longestString);
        while(longestString.peek() != 'c') {
            char x =    longestString.remove();
        }

        System.out.println(longestString);

        assertEquals(1, employees.get(0).getId());
    }

    @Test
    public void testJavaLibraries() {
        StringBuffer sb = new StringBuffer();
        sb.append("a");
        sb.append("b");
        sb.append("c");
        sb.append("z");
        log.info("prior to method call {}", sb);
        cleanUpToChar(sb, 'b');
        log.info("after method call {}", sb);


    }

    @Test
    public void testMathFunctions() {
        int[] x = new int[0];
        int[] y = new int []{1,2,3};
        log.info("Resulting merged list is {}", mergeAndSortArrays(x, y));

    }

    @Test
    public void testDualLoop() {
        String word = "RACECAR";
        char[] wordArray = word.toCharArray();

        for(int i=0, j = wordArray.length - 1; i < j; i++, j--) {
            System.out.println("comparing i " + i + " and j " + j);
            System.out.println("comparing " + wordArray[i] + " and " + wordArray[j]);
        }
    }

    public List<Integer> mergeAndSortArrays(int[] num1, int[] num2) {
        List<Integer> sortedList = new ArrayList<>();
        for(int i: num1) {
            sortedList.add(i);
        }

        for(int x: num2) {
            sortedList.add(x);
        }
        int[] x = new int[2];

        Collections.sort(sortedList);

        return sortedList;
    }

    private void cleanUpToChar(StringBuffer sb, char c) {
        Map<String, String> test = new HashMap<>();
        sb.delete(0, sb.indexOf(String.valueOf(c)));
    }


}
