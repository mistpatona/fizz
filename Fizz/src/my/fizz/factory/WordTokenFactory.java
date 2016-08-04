package my.fizz.factory;

import my.fizz.data.Token;

public class WordTokenFactory implements TokenFactory {
	
	private int counter = 1;

	@Override
	public Token get(String s) {
		return new Token(s, counter++);
	}

}
