package com.epam.interfaces;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Average {
	public static double average(List<Integer> list) {
		return list.parallelStream().mapToInt(i->i).average().getAsDouble();
	}
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(1,6,7,4,5,3,2,8,10,9);
		double res=average(l);
		System.out.println(res);
	}
}