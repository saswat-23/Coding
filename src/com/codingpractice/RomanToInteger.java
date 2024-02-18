package com.codingpractice;

import java.util.HashMap;
import java.util.Map;

class RomanToInteger {
    
	public int romanToInt(String s) {
		System.out.println("Input: "+s);
        Map<String, Integer> romanMap = getRomanMap();
        
        for(int i=s.length()-1; i>=0; i--){
//        	romanMap.get(s.substring(i, i))
        	System.out.print(String.valueOf(s.charAt(i)));
        	System.out.println("\t"+romanMap.get(String.valueOf(s.charAt(i))));
        }
		
        
        return 0;

    }

    private Map<String, Integer> getRomanMap(){
        Map<String, Integer> romanMap = new HashMap<>();
        romanMap.put("I",1);
        romanMap.put("V",5);
        romanMap.put("X",10);
        romanMap.put("L",50);
        romanMap.put("C",100);
        romanMap.put("D",500);
        romanMap.put("M",1000);

        return romanMap;
    }
}