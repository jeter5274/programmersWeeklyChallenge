package week4;

import java.util.HashMap;

class Solution {
    public String solution(String[] table, String[] languages, int[] preference) {
        
    	int maxScore = Integer.MIN_VALUE;
    	String answer = "";
    	
    	HashMap<String, Integer> myLang = new HashMap<>();
    	
    	for(int i=0; i<languages.length; i++) {
    		myLang.put(languages[i], preference[i]);
    	}
    	
    	for(String jobGroup : table) {
    		String[] langPoint = jobGroup.split(" ");
    		
    		int jobGroupScore = 0;
    		
    		for(int i=1; i<langPoint.length; i++) {
    			if(myLang.containsKey(langPoint[i])) {
    				jobGroupScore += (6-i) * myLang.get(langPoint[i]);
    			}
    		}
    		
    		if(maxScore < jobGroupScore) {
    			maxScore = jobGroupScore;
    			answer = langPoint[0];
    		}
    		else if(maxScore == jobGroupScore && answer.compareTo(langPoint[0]) > 0) {
    			answer = langPoint[0];
    		}
    	}
    	
        return answer;
    }
}
