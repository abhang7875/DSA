package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CapgeminiL1 {
	public static void main(String[] args) {
		List<String> data = Arrays.asList("5AA", "8XX", "YY", "XX");

		Map<String, Long> output1 = data.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		List<String> output2 = data.stream().filter(temp -> temp.charAt(0) >= '0' && temp.charAt(0) <= '9')
				.collect(Collectors.toList());

		System.out.println(output1);
		System.out.println(output2);
	}
}
