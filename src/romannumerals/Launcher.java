package romannumerals;

public class Launcher {

	public static void main(String[] args) {
		RomanNumeralTranslator rnt = new RomanNumeralTranslator();
		ScannerInput input = new ScannerInput();
		rnt.translateToRoman(input.getInput(1));

	}

}
