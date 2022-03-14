package com.src;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintWhichIntegerNumberStartWithOne {
	public static void main(String[] args) {
		List<String> collect = Arrays.asList(12, 13, 81, 4, 19, 4).stream().map(number -> number + "")
				.filter(string -> string.startsWith("1")).collect(Collectors.toList());
	}
}
