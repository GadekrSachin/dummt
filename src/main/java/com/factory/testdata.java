package com.factory;


import java.util.LinkedHashMap;
import java.util.Map;

public class testdata {
	public static void main(String[] args) {


		String nString="sachin a";

		nString= nString.toLowerCase().replaceAll("\\$", "");


		Map<Character, Integer> countiMap= new LinkedHashMap<Character, Integer>();

		for(char ch :nString.toCharArray()) {
			countiMap.put(ch, countiMap.getOrDefault(ch , 0)+1 );
		}

		countiMap.forEach((a , b)->{
			if(b>1) {
				System.out.println( a +  "="  + b);
			}
		});




	}
}
