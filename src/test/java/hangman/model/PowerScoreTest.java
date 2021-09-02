package hangman.model;
import static org.junit.Assert.assertEquals;

import org.junit.*;
/**
 * Especificaciones para la clase PowerBonusScore:
 * Clases de equivalencia:
 * 
 * 1. Valor de alguno de los argumentos incorrectCount o correctCount negativo.Se debe lanzar la 
 * excepcion IllegalArgumentException.
 * 
 * 2. Valor de correctCount mayor a 3 valor de incorrectCount igual a 0. El puntaje obtenido 
 * es 500.
 *  
 * 3. El valor de correctCount se evalua como la sumatoria de 1 hasta el valor de i = correctCount 
 * de 5^i. El valor de incorrectCount se resta como incorrectCount*8 cuando la diferencia es mayor 
 * a 0 y menor a 500. 
 *
 * 4. El valor de correctCount se evalua como la sumatoria de 1 hasta el valor de i = correctCount 
 * de 5^i. El valor de incorrectCount se resta como incorrectCount*8, cuando la diferencia es menor 
 * a 0 el puntaje obtenido debe ser 0. 
 * 
 * @author Camilo Pichimata - Zuly Vargas
 * @version 1.0
 *
 */
public class PowerScoreTest {
	
	@Test
	public void pruebaNegativosPowerScore(){
		try {
		PowerScore powerScore = new PowerScore();
		powerScore.calculateScore(-1,-1);
		}catch(Exception e) {
			assertEquals(e.getMessage(), "Los argumentos deben ser positivos.");
		} 
	}
	@Test
	public void pruebaClaseDosPowerScore(){
		try {
		PowerScore powerScore = new PowerScore();
		int puntaje = powerScore.calculateScore(4,0);
		assertEquals(500, puntaje);
		}catch(Exception e) {
			assertEquals(e.getMessage(), "Los argumentos deben ser positivos.");
		} 
	}
	
	@Test
	public void pruebaClaseTresPowerScore(){
		try {
		PowerScore powerScore = new PowerScore();
		int puntaje = powerScore.calculateScore(3,1);
		assertEquals(147, puntaje);
		}catch(Exception e) {
			assertEquals(e.getMessage(), "Los argumentos deben ser positivos.");
		} 
	}
	
	@Test
	public void pruebaClaseCuatroPowerScore(){
		try {
		PowerScore powerScore = new PowerScore();
		int puntaje = powerScore.calculateScore(2,4);
		assertEquals(0, puntaje);
		}catch(Exception e) {
			assertEquals(e.getMessage(), "Los argumentos deben ser positivos.");
		} 
	}

}
