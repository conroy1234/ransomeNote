package ransomeNote;

import java.util.HashMap;
import java.util.Map;

public class RansomeNote {

	// scan through array of words an add them to a map
	public Map<String,Integer> mapMagazene(String[] words){
		Map<String,Integer> scanWords = new HashMap<>();
		for(int i=0;i<words.length; i++) {
			scanWords.merge(words[i], 1, Integer::sum);
		}
		return scanWords;
	}
	
	// check to see if article can be use as ransome note
	public boolean scanNewsArticle(String[] article, String[] ransomeNote) {
		 Map<String, Integer> wordsFound =mapMagazene(article);
		 for (int i = 0; i < ransomeNote.length; i++) {
		        if (wordsFound.containsKey(ransomeNote[i]) && wordsFound.get(ransomeNote[i]) > 0) {
		        	wordsFound.merge(ransomeNote[i], -1, Integer::sum); 
		        } else {
		            System.out.println("No");
		            return false;
		        }
		    }
		   System.out.println("Yes");
		 return true;
		 
	}	
}
