import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {

	static Cuenta cta12345;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cta12345 = new Cuenta("12345", "Raul", 50.00);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testIngreso() {
		cta12345.ingresar(50.00);
		assertEquals(100, cta12345.getSaldo());
	}

}
