package hangman.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Especificaciones para la clase BonusScore:
 * Clases de equivalencia:
 * 1. Valor de alguno de los argumentos incorrectCount o correctCount negativo.Se debe lanzar la 
 * excepcion IllegalArgumentException.
 * 
 * 2. Valor de incorrectCount es como maximo el doble del argumento correctCount.En este caso 
 * el puntaje obtenido es (10*correctCount - 5*incorrectCount).Ambos argumentos deben ser positivos.
 * 
 * 3.  Valor de incorrectCount es mayor que el doble del argumento correctCount.El puntaje obtenido
 * es 0.Ambos argumentos deben ser positivos.
 * 
 * @author Camilo Pichimata - Zuly Vargas
 *
 */
public class BonusScoreTest {
	
	@Test
	public void pruebaNegativosBonusScore(){
		try {
		BonusScore bonusScore = new BonusScore();
		bonusScore.calculateScore(-1,-1);
		}catch(Exception e) {
			assertEquals(e.getMessage(), "Los argumentos deben ser positivos.");
		} 
	}
	
	@Test
	public void pruebaClaseDosFronteraBonusScore() {
		try {
			BonusScore bonusScore = new BonusScore();
			int puntaje= bonusScore.calculateScore(10,20);
			assertEquals(0,puntaje);
			}catch(Exception e) {
				assertEquals(e.getMessage(), "Los argumentos deben ser positivos.");
			} 
	}
	
	@Test
	public void pruebaClaseDosBonusScore() {
		try {
			BonusScore bonusScore = new BonusScore();
			int puntaje= bonusScore.calculateScore(9,2);
			assertEquals(80,puntaje);
			}catch(Exception e) {
				assertEquals(e.getMessage(), "Los argumentos deben ser positivos.");
			} 
	}
	
	@Test
	public void pruebaClaseTresBonusScore() {
		try {
			BonusScore bonusScore = new BonusScore();
			int puntaje= bonusScore.calculateScore(10,30);
			assertEquals(0,puntaje);
			}catch(Exception e) {
				assertEquals(e.getMessage(), "Los argumentos deben ser positivos.");
			} 
	}
}
