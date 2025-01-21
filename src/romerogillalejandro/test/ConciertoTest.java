package romerogillalejandro.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConciertoTest {

	/**
	 * Comprueba que el concierto se cree correctamente, dada la siguiente información:
	 * [Nombre, fecha, hora, lugar, aforo, precioEntrada]
	 * 
	 * Tras crearlo, inicialmente el concierto deberá tener una lista de entradas cuya longitud debe ser 0
	 * 
	 * Usar el constructor de la clase Concierto
	 */
	@Test
	void testConcierto() {
		//TODO
	}
	
	

	/**
	 * Comprueba que devuelva el importe correspondiente a la suma del precio de todas las entradas vendidas.
	 * Para ello se deberá crear un concierto y vender alguna entrada.
	 * 
	 * Usar getRecaudación() de la clase Concierto
	 */
	@Test
	void testGetRecaudacion() {
		//TODO
	}
	
	

	/**
	 * Tras crear el concierto, comprueba que inicialmente haya aforo disponible y,
	 * cuando se vendan todas las entradas, el aforo esté completo
	 * 
	 * Usar esCompleto() de la clase Concierto
	 */
	@Test
	void testEsCompleto() {
		//TODO
	}
	
	

	/**
	 * Tras crear el concierto, comprueba que se puedan vender entradas hasta llegar al aforo máximo indicado.
	 * En caso de que se haya realizado la venta correctamente, devuelve la información de la entrada. Null en caso contrario
	 * 
	 * Usar venderEntrada() de la clase Concierto
	 */
	@Test
	void testVenderEntrada() {
		//TODO
	}

}
