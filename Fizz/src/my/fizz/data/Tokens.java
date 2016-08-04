package my.fizz.data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Tokens {
	private List<Token> list;
	public Tokens (List<Token> inlist) {
		list = inlist;
		}
	public Tokens () {
		list = new ArrayList<Token>();
		}
	public void add(Token token) {
		list.add(token);
	}
	public List<Token> getTokens() {
		return list;
	}
/*	public List<Token> getWordTokens() {
		return list.stream().filter(t -> t.isWord()).collect(Collectors.toList());
	}	
*/
	public String toString() {
		StringBuilder str = new StringBuilder();
		for(Token t: list) {
			str.append(t.value);
		}
		return str.toString();
	}
	public Tokens fizzBuzzed() {
		List<Token> newList = 
		 list.stream().map(t-> t.fizzBuzzed()).collect(Collectors.toList());
		return new Tokens(newList);
	}
	
	/*public void applyFizzBuzz() {
		for(Token t: list) {
			t = t.fizzBuzzed();
		}
	}*/
}
