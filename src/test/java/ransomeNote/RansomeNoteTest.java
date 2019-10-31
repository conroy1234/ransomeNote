package ransomeNote;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

class RansomeNoteTest {

	RansomeNote notes = new RansomeNote();
	
	@Test
	void scanNewsArticle_with_useable_words_Test() {
		
		String[] expected= {"writing unit test is a part of development","I am writing unit test"};
		String[] actual= {"writing unit test is a part of development","I am writing unit test"};
		assertThat(notes.scanNewsArticle(expected, actual),is(Boolean.TRUE));
		
	}
	
	@Test
	void scanNewsArticle_with_none_useable_words_Test() {
		
		String[] expected= {"writing unit test is a part of development","I am writing unit test"};
		String[] actual= {"writing unit test is a part of development","I am writing unit test","this is a negative test"};
		assertThat(notes.scanNewsArticle(expected, actual),is(Boolean.FALSE));
		
	}

}
