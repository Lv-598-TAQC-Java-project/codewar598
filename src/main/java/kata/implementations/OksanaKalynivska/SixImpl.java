package kata.implementations.OksanaKalynivska;

import kata.Six;

public class SixImpl implements Six {

	@Override
	public long findNb(long m) {
		long cubes = 0;
		long i = 0;
		for (i = 1; cubes < m; i++) {

			cubes += (long) Math.pow(i, 3);
		}
		return (cubes == m) ? (i - 1) : -1;
	}

	@Override
	public String balance(String book) {
		StringBuilder sb = new StringBuilder();
		double priceOfEl = 0;
		double genSum = 0;

		String[] lines = book.split("\n");
		double firstLine = Double.valueOf(lines[0].replaceAll("[^\\d.]", ""));

		sb.append(String.format("Original Balance: %.2f\\r\\n", firstLine));
		for (int i = 1; i < lines.length; i++) {
			String categ = lines[i].replaceAll("[^A-Za-z0-9 .]", "").replaceAll("\\s+", " ");
			String[] arrOfCateg = categ.split(" ");

			priceOfEl = Double.valueOf(arrOfCateg[2]);
			genSum += priceOfEl;
			firstLine -= priceOfEl;
			sb.append(
					String.format("%s %s %.2f Balance %.2f\\r\\n", arrOfCateg[0], arrOfCateg[1], priceOfEl, firstLine));

		}
		sb.append(String.format("Total expense  %.2f\\r\\n", genSum));
		sb.append(String.format("Average expense  %.2f", genSum / (lines.length - 1)));
		return sb.toString();
	}

	@Override
	public double f(double x) {

		return x / 2 - x * x / 8 + x * x * x / 16 - x * x * x * x * 5 / 128;
	}

	@Override
	public double mean(String town, String strng) {
		String[] cities = strng.split("\\n");
		double sum = 0.0;
		int counter = 0;
		for (String city : cities) {
			String[] data = city.split(":");
			if (data[0].equals(town)) {
				String[] months = data[1].split(",");
				for (String month : months) {
					String[] values = month.split(" ");
					sum += Double.parseDouble(values[1]);
					counter++;
				}
			}
		}
		return (sum == 0) ? -1 : (sum / (double) counter);
	}

	@Override
	public double variance(String town, String strng) {
		double average = mean(town, strng);
		double variance = 0.0;
		String[] cities = strng.split("\\n");
		double sum = 0.0;
		int counter = 0;
		for (String city : cities) {
			String[] data = city.split(":");
			if (data[0].equals(town)) {
				String[] months = data[1].split(",");
				for (String month : months) {
					String[] values = month.split(" ");
					variance += Math.pow((average - Double.parseDouble(values[1])), 2);
					counter++;
				}
			}
		}
		return (variance == 0) ? -1 : (variance / (double) counter);
	}

	@Override
	public String nbaCup(String resultSheet, String toFind) {

		if (toFind.length() == 0) {
			return "";
		}

		if (resultSheet.contains(toFind + " ") == false) {
			return toFind + ":" + "This team didn't play!";
		}

		String results[] = resultSheet.split(",");
		int won = 0, draw = 0, lost = 0, scored = 0, conceded = 0;
		for (int i = 0; i < results.length; i++) {

			if (results[i].contains(toFind)) {

				boolean homeTeam = false;
				if (results[i].indexOf(toFind) == 0) {
					homeTeam = true;
				}
				String info[] = results[i].split(" ");
				int scores[] = new int[] { 0, 0 };
				int at = 0;
				for (int j = 0; j < info.length; j++) {

					if (info[j].matches("\\d*")) {
						scores[at] = Integer.parseInt(info[j]);
						at++;
					}
					if (info[j].matches("\\d*\\.\\d*")) {
						return "Error(float number):" + results[i];
					}
				}
				if (homeTeam) {
					scored += scores[0];
					conceded += scores[1];
					if (scores[0] > scores[1]) {
						won++;
					} else if (scores[0] < scores[1]) {
						lost++;
					} else {
						draw++;
					}
				} else {
					scored += scores[1];
					conceded += scores[0];
					if (scores[0] > scores[1]) {
						lost++;
					} else if (scores[0] < scores[1]) {
						won++;
					} else {
						draw++;

					}
				}

			}
		}

		int points = 3 * won + 1 * draw + 0 * lost;
		String result = toFind + ":W=" + won + ";D=" + draw + ";L=" + lost + ";Scored=" + scored + ";Conceded="
				+ conceded + ";Points=" + points;

		return result;
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
