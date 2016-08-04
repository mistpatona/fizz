package my.fizz.fizz;

import my.fizz.data.Tokens;

public class Fizz {

	public static void main(String[] args) {
		String s = "aa bb cc      dd ee ff gg    hh   kkk llllllll   m nn ooo ppppp qqqqqqqq r";
		Parser p = new Parser();
		Tokens ts = new Tokens(p.parse(s));
		System.out.println(ts.fizzBuzzed());
	}

}
