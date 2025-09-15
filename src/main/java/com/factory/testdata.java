package com.factory;

import java.util.LinkedHashMap;
import java.util.Map;

public class testdata {
	public static void main(String[] args) {

	
		String name ="sachinnn";
		name=name.toLowerCase( );
		
		Map<Character, Integer> count = new LinkedHashMap<Character, Integer>();
		
		for(char ch : name.toCharArray()) {
			count.put(ch, count.getOrDefault(ch, 0) +1);
		}
		
		count.forEach((k, c)->{
			if(c>1) {
				System.out.println( k + " "+ c );
			}
		});
	}
}
