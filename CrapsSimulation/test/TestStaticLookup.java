import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.princeton.cs.introcs.StdOut;

class TestStaticLookup
{

	@Test
	void test_static_methods_dont_override()
	{
		Die alias = new CrookedDie1();
		//CrookedDie1 test2 = new CrookedDie1(); 
		
		assertEquals("Die.testStatic()",alias.testStatic(), "error for this");
		
		//StdOut.println(((CrookedDie1)alias).testStatic());
	}

	@Test
	void test_downcasting_changes_static_lookup()
	{
		Die alias = new CrookedDie1();
		//CrookedDie1 test2 = new CrookedDie1(); 
		
		assertEquals("CrookedDie1.testStatic()",((CrookedDie1)alias).testStatic(), "error for this");
		
		//StdOut.println(((CrookedDie1)alias).testStatic());
	}

}
