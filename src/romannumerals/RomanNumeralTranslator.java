package romannumerals;

import java.util.Collections;

public class RomanNumeralTranslator {
	private int[] numberArr = {1,1,1,5,10,50,100,500,1000,5000,10000,50000,100000,500000,1000000};
	private String[] romanArr = {"I","I","I","V","X","L","C","D","M","v","x","l","c","d","m"};
	
	public String translateToRoman(int value) {		
		String subString = "";
		String subString2 = "";
		String finalString = "";
		
		for (int i = 14; i >= 2; i--){
			int remainder = 0;
			int quotient = 0;
			int j = i-1;
			int k = i-2;
			remainder = value % numberArr[i];
			quotient = value / numberArr[i];
			
			if (j%2==0){
				if (quotient > 0){
					subString = subString.join("", Collections.nCopies(quotient, romanArr[i]));
					finalString = finalString+subString;
					value = remainder;
				}
				boolean boolTest = (remainder < numberArr[i] && (remainder >= numberArr[i]-numberArr[j]));
				if (boolTest && remainder > 0){
					subString = romanArr[j];
					subString2 = finalString;
					finalString = finalString+subString+romanArr[i];
					value = value-(numberArr[i]-numberArr[j]);
					if (value == numberArr[i]){
						finalString = subString2+romanArr[i]+subString+romanArr[i];
						value -= numberArr[i];
					}
					
				}
			}
			else if (k%2==0){
				if (quotient > 0){
					subString = subString.join("", Collections.nCopies(quotient, romanArr[i]));
					finalString = finalString+subString;
					value = remainder;
				}
				boolean boolTest = (remainder < numberArr[i] && (remainder >= numberArr[i]-numberArr[k]));
				if (boolTest && remainder > 0){
					subString = romanArr[k];
					subString2 = finalString;
					finalString = finalString+subString+romanArr[i];
					value = value-(numberArr[i]-numberArr[k]);
					if (value == numberArr[i]){
						finalString = subString2+romanArr[i]+subString+romanArr[i];
						value -= numberArr[i];
					}
				}
			
			}
			
		}
		System.out.println(finalString);
		return finalString;
	}
	

}
