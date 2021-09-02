package hangman.model;

public class OriginalScore implements GameScore {

	// @pre, @pos, @param, @throws 
	
	/**
	 *Calcula el puntaje total segun el conteo de letras incorrectas.
	 *
	 *@param correctCount - Número de letras correctas.
	 *@param incorrectCount - Número de letras incorrectas.
	 *
	 */
	@Override
	public int calculateScore(int correctCount, int incorrectCount) {
		int puntaje = 0;
		if ( (correctCount< 0) || (incorrectCount <0)) throw new IllegalArgumentException("Los argumentos deben ser positivos.");
		else {
			puntaje = 100 - incorrectCount*10;
		}
		return puntaje < 0 ? 0 : puntaje ;
	}

}
