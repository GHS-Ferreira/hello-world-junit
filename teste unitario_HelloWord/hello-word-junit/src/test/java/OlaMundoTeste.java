import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OlaMundoTeste {

	@Test
	void testOlaMundo() {
		Olamundo Olamundo = new Olamundo ();
		assertEquals("Hello Word!", Olamundo.olaMundo() );
	}

}
