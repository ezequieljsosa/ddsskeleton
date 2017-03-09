package skeleton;



import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class MagnitudTest {

	@Test
	public void testMagnitudValida(){
		Magnitud m = new Magnitud();
		m.setMax(10);
		m.setMin(0);
		Muestra muestra = new Muestra();
		muestra.setValor(3);
		assertTrue( m.validar(muestra));
	}
	
}
