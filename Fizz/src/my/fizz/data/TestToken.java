package my.fizz.data;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class TestToken {

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void testFizzHappens() {
		Token t = new Token("aaa",3);
		assertEquals("before fizzbuzz","aaa", t.value);
		t = t.fizzBuzzed();
		
		assertEquals("after fizzbuzz","fizz", t.value);
	}

	@Test
	public void testFizzNotHappens() {
		Token t = new Token("aaa",4);
		assertEquals("before fizzbuzz","aaa", t.value);
		t = t.fizzBuzzed();
		assertEquals("after fizzbuzz","aaa", t.value);
	}
	
	
	@Test
	public void testMultipleFizzHappens() {
		Token t = new Token("aaa",3);
		assertEquals("before fizzbuzz","aaa", t.value);
		Tokens ts = new Tokens();
		ts.add(t);
		List<Token> list = ts.fizzBuzzed().getTokens();
		t = list.get(0);		
		assertEquals("after fizzbuzz","fizz", t.value);
	}
}
