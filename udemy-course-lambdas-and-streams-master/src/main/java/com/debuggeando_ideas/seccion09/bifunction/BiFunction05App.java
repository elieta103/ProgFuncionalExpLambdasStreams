package com.debuggeando_ideas.seccion09.bifunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunction05App {

    private static <T, U, R> List<R> listCombiner(
            List<T> listFirstArg,
            List<U> listSecondArg,
            BiFunction<T, U, R> combiner) {

        List<R> listResult = new ArrayList<>();
        for (int i = 0; i < listFirstArg.size(); i++) {
            listResult.add(combiner.apply(listFirstArg.get(i), listSecondArg.get(i)));
        }
        return listResult;
    }

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("a", "b", "c");
        List<Integer> list2 = Arrays.asList(1, 2, 3);

        List<String> resp = listCombiner(list1, list2, (l1, l2)-> l1+l2);
        System.out.println(resp);

    }


}
