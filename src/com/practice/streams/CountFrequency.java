package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequency {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 1, 3, 6, 7, 8);

		Map<Integer, Long> output1 = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(output1);
	}
}
