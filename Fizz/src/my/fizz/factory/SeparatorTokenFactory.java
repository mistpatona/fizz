package my.fizz.factory;

import my.fizz.data.Token;

public class SeparatorTokenFactory implements TokenFactory {
	@Override
	public Token get(String s) {
		return new Token(s, 0);
	}

}
