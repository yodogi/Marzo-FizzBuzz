package org.kata;

/**
 * Hello world!
 *
 */
public class FizzBuzz 
{

	public String evaluate(int i) {
		String num = "";
		if (i % 3 == 0)
			num += "Fizz";
		if (i % 5 == 0)
			num += "Buzz";

		return (num.equals("")) ? String.valueOf(i) : num;
	}

	public String evaluateStage2(int i) {
		String num = "";
		if (i % 3 == 0)
			num += "Fizz";
		if (i % 5 == 0)
			num += "Buzz";

		if (num.equals("")) {
			num = String.valueOf(i);
			if (num.contains("3"))
				return "Fizz";
			else if (num.contains("5"))
				return "Buzz";
		}
		return  num;
	}
}
