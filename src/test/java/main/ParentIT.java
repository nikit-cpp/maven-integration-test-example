package main;

import static org.junit.Assert.*;

import org.junit.Test;

// integratiin test case - with IT suffix
// http://docs.codehaus.org/display/MAVENUSER/Maven+and+Integration+Testing
public class ParentIT {

	@Test
	public void test() {
		Parent parent = new Parent();
		assertEquals(parent.getString(), "i am string");
	}

}
