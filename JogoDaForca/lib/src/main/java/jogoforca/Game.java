package jogoforca;

import palavras.Dictionary;
import palavras.word;

public class Game {
	
	public void start() {
				
		Dictionary d = Dictionary.getInstance();
		
		word w = d.nextWord();
		System.out.println(w.getOriginalWord());
	}
}
