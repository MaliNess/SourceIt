package hw8;

public class RomanNumeralsConverter {

	private static String[] buf = { "I", "V", "X", "L", "C" };

	private static String getRoman(int x, int current) {
		StringBuilder sb = new StringBuilder();
		if (x != 0) {
			if (x - 5 >= 4) {
				current++;
				if (x - 5 == 4) {
					sb.append(buf[checkCurrent(current) - 1] + buf[current]);
				} else
					sb.append(buf[current] + getRoman(x - 5, current + 1));
			} else if (x - 5 < -1) {
				if (current > 0)
					sb.append(buf[current - 1] + getRoman(x - 1, checkCurrent(current)));
				else
					sb.append(buf[current] + getRoman(x - 1, checkCurrent(current)));
			} else if (x - 5 == -1) {
				sb.append(buf[checkCurrent(current) - 1] + buf[current]);
			} else {
				sb.append(buf[current] + getRoman(x - 5, current));
			}
		}
		return sb.toString();
	}

	private static int checkCurrent(int current) {
		if (current != 0 && (buf[current - 1] == "L" || buf[current - 1] == "V")) {
			current--;
		}
		return current;
	}

	public static String decimal2Roman(int x) {
		int hun = 0;
		int dec = 0;
		int ed = 0;

		if (x / 100 != 0)
			hun = x / 100;
		x %= 100;
		if (x / 10 != 0)
			dec = x / 10;
		x %= 10;
		if (x != 0)
			ed = x;

		StringBuilder sb = new StringBuilder();

		sb.append(getRoman(hun, 5));
		sb.append(getRoman(dec, 3));
		sb.append(getRoman(ed, 1));

		return sb.toString();
	}

	public static int toDecimal(char c) {
		if (c == 'I')
			return 1;
		if (c == 'V')
			return 5;
		if (c == 'X')
			return 10;
		if (c == 'L')
			return 50;
		if (c == 'C')
			return 100;
		return 0;
	}

	public static int getIndex(char c) {
		if (c == 'I')
			return 0;
		if (c == 'V')
			return 1;
		if (c == 'X')
			return 2;
		if (c == 'L')
			return 3;
		if (c == 'C')
			return 4;
		return 0;
	}

	public static int roman2Decimal(String s) {
		char[] charArray = s.toCharArray();
		int res = 0;
		for (int i = 0; i < charArray.length; i++)
			if (i == charArray.length - 1)
				res += toDecimal(charArray[i]);
			else {
				if (getIndex(charArray[i]) < getIndex(charArray[i + 1])) {
					res += (toDecimal(charArray[i + 1]) - toDecimal(charArray[i]));
					i++;
				} else
					res += toDecimal(charArray[i]);
			}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 101; i++) {
			System.out.println(i + "\t==decimal2Roman==>\t"+ decimal2Roman(i) + "\t==roman2Decimal==>\t" + roman2Decimal(decimal2Roman(i)));
		}
		
	}

}
