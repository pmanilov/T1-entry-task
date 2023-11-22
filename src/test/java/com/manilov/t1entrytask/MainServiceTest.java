package com.manilov.t1entrytask;

import org.junit.jupiter.api.Test;
import com.manilov.t1entrytask.service.MainService;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MainServiceTest {
    @Test
    void testLettersFrequency() {
        MainService mainService = new MainService();
        String text = "aaaaabcccc";
        Map<Character, Integer> expectedResult = new LinkedHashMap<>();
        expectedResult.put('a', 5);
        expectedResult.put('c', 4);
        expectedResult.put('b', 1);
        Map<Character, Integer> result = mainService.lettersFrequency(text);
        List<Map.Entry<Character, Integer>> expectedList = new ArrayList<>(expectedResult.entrySet());
        List<Map.Entry<Character, Integer>> resultList = new ArrayList<>(result.entrySet());
        assertEquals(expectedList, resultList);
    }

    @Test
    void testLettersFrequencyEmpty() {
        MainService mainService = new MainService();
        String text = "";
        Map<Character, Integer> expectedResult = new LinkedHashMap<>();
        Map<Character, Integer> result = mainService.lettersFrequency(text);
        assertEquals(expectedResult, result);
    }

    @Test
    void testLettersFrequencyRussian() {
        MainService mainService = new MainService();
        String text = "ЫЫЫЫАЫФЧЧК";
        Map<Character, Integer> expectedResult = new LinkedHashMap<>();
        expectedResult.put('Ы', 5);
        expectedResult.put('Ч', 2);
        expectedResult.put('А', 1);
        expectedResult.put('Ф', 1);
        expectedResult.put('К', 1);
        Map<Character, Integer> result = mainService.lettersFrequency(text);
        List<Map.Entry<Character, Integer>> expectedList = new ArrayList<>(expectedResult.entrySet());
        List<Map.Entry<Character, Integer>> resultList = new ArrayList<>(result.entrySet());
        assertEquals(expectedList, resultList);
    }

    @Test
    void testLettersFrequencyIncorrectOrder() {
        MainService mainService = new MainService();
        String text = "aaaaabcccc";
        Map<Character, Integer> expectedResult = new LinkedHashMap<>();
        expectedResult.put('b', 1);
        expectedResult.put('c', 4);
        expectedResult.put('a', 5);
        Map<Character, Integer> result = mainService.lettersFrequency(text);
        List<Map.Entry<Character, Integer>> expectedList = new ArrayList<>(expectedResult.entrySet());
        List<Map.Entry<Character, Integer>> resultList = new ArrayList<>(result.entrySet());
        assertNotEquals(expectedList, resultList);
    }
}
