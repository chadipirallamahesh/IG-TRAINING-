package com.LambdaExpressions;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LambdaExExample {

	public static void main(String[] args) {
		Map<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "mahesh");
		hm.put(3, "hari");
		hm.put(5, "shiva");
		hm.put(2, "rakesh");
		hm.put(4, "shravan");
		//hm.forEach((k,v) -> System.out.println("Key : "+k +" Value : "+v));
		
		Map<Integer,String> result = hm.entrySet().stream()
				.filter(map -> map.getKey().intValue() > 2)
				.collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
		System.out.println(result);

	}

}
