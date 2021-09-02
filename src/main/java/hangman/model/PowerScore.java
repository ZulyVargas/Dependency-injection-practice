package hangman.model;

public class PowerScore implements GameScore {

	@Override
	/**
	 *Calcula el puntaje total segun el conteo de letras correctas e incorrectas.  
	 *@param correctCount - Número de letras correctas.
	 *@param incorrectCount - Número de letras incorrectas.
	 *
	 */
	public int calculateScore(int correctCount, int incorrectCount) {
		int puntaje = 0;
		if ( (correctCount<0) || (incorrectCount <0)) throw new IllegalArgumentException("Los argumentos deben ser positivos.");
		else {
			for (int i = 1 ; i <= correctCount; i++ ) {
				puntaje = puntaje + (int) Math.pow(5,i);
			}
			puntaje = puntaje - incorrectCount*8;
			
			if (puntaje>500) puntaje = 500;
		}
		
		return puntaje < 0 ? 0 : puntaje ;
	}

}
