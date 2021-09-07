/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.setup.guice;

import hangman.model.BonusScore;

/**
 *
 * @author 2106913
 */

import hangman.model.French;
import hangman.model.GameScore;
import hangman.model.Language;
import hangman.model.OriginalScore;
import hangman.model.PowerScore;
import hangman.model.Spanish;
import hangman.model.dictionary.HangmanDictionary;
import hangman.model.dictionary.SpanishDictionaryDataSource;
import hangman.model.dictionary.EnglishDictionaryDataSource;
import hangman.model.dictionary.FrenchDictionaryDataSource;
import hangman.view.HangmanColoridoPanel;
import hangman.view.HangmanNoviolentoPanel;
import hangman.view.HangmanPanel;
import hangman.view.HangmanStickmanPanel;


public class HangmanFactoryServices extends com.google.inject.AbstractModule {

    @Override
    protected void configure() { 
        /* Guice dependency injection */
        // bind(Interface.class).to(Concrete.class);
    	//Agregar Score
    	bind(GameScore.class).to(PowerScore.class);
    	//Agregar Diccionario - lenguaje francés
    	bind(HangmanDictionary.class).to(EnglishDictionaryDataSource.class);
    	//Agregando Panel
    	bind(HangmanPanel.class).to(HangmanStickmanPanel.class);
    	//Agregar idioma
    	bind(Language.class).to(Spanish.class);
    	
    }

}
