package my.fizz.fizz;

import java.util.ArrayList;
import java.util.List;

import my.fizz.data.StringIterator;
import my.fizz.data.Token;
import my.fizz.factory.SeparatorTokenFactory;
import my.fizz.factory.WordTokenFactory;

public class Parser {
	
	public List<Token> parse(String string) {
		StringIterator s = new StringIterator(string);
		List<Token> ans = new ArrayList<Token>();
		while (!s.done()) {
			ans.add(parseOne(s));
		}
		return ans;
	}
	
	private Token parseOne(StringIterator s) {
		return (isSeparator(s.peek())) ? parseOneSeparator(s) : parseOneWord(s);
	}
	
	/** 
	 * supposes iterator to stand on word beginning
	 */
	private Token parseOneWord(StringIterator s) {
		StringBuilder str = new StringBuilder();
		while (!s.done() && !isSeparator(s.peek())) {
			str.append(s.next());
		}
		return wordTokenFactory.get(str.toString());
	}
	/** 
	 * supposes iterator to stand after word end.
	 * a copypaste from parseOneWord(StringIterator s)  :-(
	 * TODO: refactor this without copypaste,
	 * maybe Strategy pattern can be used 
	 * (with two methods: getTokenFactory and getPredicate)
	 */	
	private Token parseOneSeparator(StringIterator s) {
		StringBuilder str = new StringBuilder();
		while (!s.done() && isSeparator(s.peek())) {
			str.append(s.next());
		}
		return separatorTokenFactory.get(str.toString());
	}
	
	private WordTokenFactory wordTokenFactory = new WordTokenFactory();// numbering inside!
	private SeparatorTokenFactory separatorTokenFactory = new SeparatorTokenFactory();
	
	public static boolean isSeparator(char c) {
		return Character.isWhitespace(c); 
	}
}
