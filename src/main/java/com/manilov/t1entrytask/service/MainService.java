package com.manilov.t1entrytask.service;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class MainService {

    public Map<Character, Integer> lettersFrequency(String text) {
        Map<Character, Integer> resultMap = new HashMap<>();
        for (Character letter : text.toCharArray()){
            resultMap.compute(letter, (key, value) -> (value == null) ? 1 : value + 1);
        }
        return resultMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, Integer::sum, LinkedHashMap::new));
    }
}