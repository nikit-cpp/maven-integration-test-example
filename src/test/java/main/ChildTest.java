package main;

import static org.junit.Assert.*;

import org.junit.Test;

// unit test case - with Test suffix
public class ChildTest {

	@Test
	public void test() {
		Child child = new Child();
		assertEquals(child.getString(), "i am string");
	}

}
