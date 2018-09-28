package TDDtest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class rovarTest {
rovar r = new rovar();
	@Test	
	void testEnrov() {
		
		assertEquals("nonorormomalol",  rovar.enrov("normal"));
	
		
		assertEquals("zozoo", rovar.enrov("zoo"));
		
		
		assertEquals("dodooror", rovar.enrov("door"));
		
		assertEquals("WOWAROR", rovar.enrov("WAR"));
		
		String normal = null;
		assertEquals(null, rovar.enrov(normal));
	}

	@Test
	void testDerov() {
		
		assertEquals("normal", rovar.derov("nonorormomalol"));
		
		assertEquals("no", rovar.derov("nono"));
		
		assertEquals("zero", rovar.derov("zozeroro"));
		
		String rov = null;
		assertEquals( null , rovar.derov(rov));
	}

} 
