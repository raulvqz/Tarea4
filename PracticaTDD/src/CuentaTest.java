import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {

	static Cuenta cta12345;
	static Cuenta cta67890;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cta12345 = new Cuenta("12345", "Raul", 50.0);
		cta67890 = new Cuenta("67890", "Jose", 0.0);
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
	void test0014() throws Exception{
		
		cta12345.retirar(200);
		cta67890.retirar(350);
		cta12345.ingresar(100);
		try {
			cta67890.retirar(200);
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}

		cta67890.retirar(150);
		cta12345.retirar(200);
		cta67890.ingresar(50);
		try {
			cta67890.retirar(100);
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}

		assertEquals(-250, cta12345.getSaldo());
		assertEquals(-450, cta67890.getSaldo());
	}

}
