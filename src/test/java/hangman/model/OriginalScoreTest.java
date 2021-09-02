package hangman.model;

import static org.junit.Assert.assertEquals;

import org.junit.*;

/**
 * Especificaciones para la clase OriginalScore:
 * Clases de equivalencia:
 * 
 * 1. Valor de alguno de los argumentos incorrectCount o correctCount negativo.Se debe lanzar
 *  la excepcion IllegalArgumentException.
 * 
 * 2. Valores entre 0 y 10 para el argumento incorrectCount.El puntaje obtenido corresponde a 
 * 100 - (incorrectCount*10).El argumento de correctCount debe ser positivo.
 * 
 * 3. Valores mayores a 10 para el argumento incorrectCount.El puntaje obtenido debe ser 
 * 0. El argumento de correctCount debe ser positivo.
 * 
 * @author Camilo Pichimata - Zuly Vargas  
 * @version 1.0
*/
public class OriginalScoreTest {
	@Test
	public void pruebaNegativosOriginScore(){
		try {
		OriginalScore originalScore = new OriginalScore();
		originalScore.calculateScore(-1,-1);
		}catch(Exception e) {
			assertEquals(e.getMessage(), "Los argumentos deben ser positivos.");
		} 
	}
	@Test
	public void pruebaClaseDosOriginScore(){
		try {
		OriginalScore originalScore = new OriginalScore();
		int puntaje = originalScore.calculateScore(10,3);
		assertEquals(70,puntaje);
		}catch(Exception e) {
			assertEquals(e.getMessage(), "Los argumentos deben ser positivos.");
		} 
	}
	
	@Test
	public void pruebaClaseDosFronteraInferiorOriginScore(){
		try {
		OriginalScore originalScore = new OriginalScore();
		int puntaje = originalScore.calculateScore(10,0);
		assertEquals(100,puntaje);
		}catch(Exception e) {
			assertEquals(e.getMessage(), "Los argumentos deben ser positivos.");
		} 
	}
	
	@Test
	public void pruebaClaseDosFronteraSuperiorOriginScore(){
		try {
		OriginalScore originalScore = new OriginalScore();
		int puntaje = originalScore.calculateScore(10,10);
		assertEquals(0,puntaje);
		}catch(Exception e) {
			assertEquals(e.getMessage(), "Los argumentos deben ser positivos.");
		} 
	}
}
