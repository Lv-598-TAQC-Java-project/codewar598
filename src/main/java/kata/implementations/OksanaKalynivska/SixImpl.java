package kata.implementations.OksanaKalynivska;

import kata.Six;

public class SixImpl implements Six {

	@Override
	public long findNb(long m) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String balance(String book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double f(double x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double mean(String town, String strng) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double variance(String town, String strng) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String nbaCup(String resultSheet, String toFind) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
		if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
			return "";
		}

		int tempTotal;
		for (int i = 0; i < lstOf1stLetter.length; i++) {
			tempTotal = 0;

			for (String someBooks : lstOfArt) {

				if (someBooks.substring(0, 1).equals(lstOf1stLetter[i])) {

					tempTotal += Integer.parseInt(someBooks.replaceAll("[^\\d]", ""));
				}
			}

			lstOf1stLetter[i] = "(" + lstOf1stLetter[i] + " : " + tempTotal + ")";
		}

		return String.join(" - ", lstOf1stLetter);
	}

}
