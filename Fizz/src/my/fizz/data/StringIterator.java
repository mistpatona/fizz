package my.fizz.data;

public class StringIterator {
	private final String string;
	private int index = 0;
	public StringIterator(String s) {
		string = s;
	}
	public boolean done() {// hasNext() would be better
		return index >= string.length(); //index ranges from 0 to length() - 1.
	}
	public char next() {
		return string.charAt(index++);
	}
	/** 
	 * just look, don't shift to next position
	 */
	public char peek() {
		return string.charAt(index);
	}

}
