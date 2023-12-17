package org.example;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> num = Lists.newArrayList();
        Collections.addAll(num, 1, 3, 4, 5, 22);
        List<Integer> reverse = Lists.reverse(num);
        ImmutableList<Character> charsList = Lists.charactersOf("abcdefgh");
        var a = Lists.cartesianProduct(charsList, charsList);

        Set<Integer> a1 = new HashSet<>(num);
        Set<Integer> a2 = new HashSet<>(reverse);


        Sets.SetView<Integer> intersection = Sets.intersection(a1, a2);
        Sets.SetView<Integer> diff = Sets.difference(a1, a2);

    }
}