import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JobsStandardizerTest {

	
	private JobStandardizer js;
	private StandardizerByChar sbc;

	
	@BeforeEach
	void setUp() throws Exception {
		
		js = new JobStandardizer();
		sbc = new StandardizerByChar();
		
	}

	@Test
	void findJavaEngineer() {
	String expected = "Software engineer";
	String result = js.standardize("Java engineer");
		
	assertEquals(expected, result);
	}
	
	@Test
	void findCEngineer() {
	String expected = "Software engineer";
	String result = js.standardize("C# engineer");
		
	assertEquals(expected, result);
	}
	
	@Test
	void findAccountant() {
	String expected = "Accountant";
	String result = js.standardize("Accountant");
		
	assertEquals(expected, result);
	}
	
	@Test
	void findChiefAccountant() {
	String expected = "Accountant";
	String result = js.standardize("Chief Accountant");
		
	assertEquals(expected, result);
	}
	
	@Test
	void noResultAssistant() {
	String expected = "No result";
	String result = js.standardize("Assistant");
		
	assertEquals(expected, result);
	}
	
	@Test
	void sbcFindJavaEngineer() {
	String expected = "Software engineer";
	String result = sbc.standardize("Java engineer");
		
	assertEquals(expected, result);
	}
	
	@Test
	void sbcFindCEngineer() {
	String expected = "Software engineer";
	String result = sbc.standardize("C# engineer");
		
	assertEquals(expected, result);
	}
	
	@Test
	void sbcFindAccountant() {
	String expected = "Accountant";
	String result = sbc.standardize("Accountant");
		
	assertEquals(expected, result);
	}
	
	@Test
	void sbcFindChiefAccountant() {
	String expected = "Accountant";
	String result = sbc.standardize("Chief Accountant");
		
	assertEquals(expected, result);
	}
	
	@Test
	void sbcNoResultAssistant() {
	String expected = "Software engineer";
	String result = sbc.standardize("enginer");
		
	assertEquals(expected, result);
	}

}
