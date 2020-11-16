package com.hz;

public class Checker {
	
	public boolean checkAnswer(String response) {

	    //String maken van positieve antwoorden om mee te vergelijken
	    String[] positiveAnswers = {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};
	        
	    //Antwoord van response variabel vergelijken met de mogelijke positieve antwoorden
	    for (String i: positiveAnswers) {
	    	
	    	//System.out.println(ans2 + " & " + i);
	    	
	    	//Als response overeen komt met een positief antwoord dan word ans1 op true gezet
	        if (response.equals(i)){
	        	//System.out.println("TEST");
	        	return true;
	        }
	    }
	    return false;
	}
}
