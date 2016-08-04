package my.fizz.data;

/**
 * holds a part of string. a part can be a word, then it has its number, or a
 * space, so it has no number
 */
public class Token {

	public final int number;
	public final String value;

	public Token(String s, int n) {
		number = n;
		value = s;
	}

	public Token(String s) {
		number = 0;
		value = s;
	}

	public boolean isWord() {
		return number > 0;
	}

	public String toString() {
		return value;
	}
    /* Effectively these are Singletons. 
     * Their numbers do not matter for now. */
	static Token fizz = new Token("fizz", -3);
	static Token buzz = new Token("buzz", -5);
	static Token fizzBuzz = new Token("fizzbuzz", -15);

	public Token fizzBuzzed() {
		if (!this.isWord()) return this;
		final int n = this.number;
		final int f = 3;
		final int b = 5;
		if (n % (f*b) == 0) return fizzBuzz; 
		if (n % f == 0) return fizz;
		if (n % b == 0) return buzz;
		return this;
	}

}
