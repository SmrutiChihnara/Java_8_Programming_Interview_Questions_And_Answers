package com.src;

import java.util.Arrays;

public class FindEvenNumerUsingJava8 {
public static void main(String[] args) {
	Arrays.asList(2,1,8,4,9,4).stream().filter(number->number%2==0).forEach(System.out::println);
}
}
