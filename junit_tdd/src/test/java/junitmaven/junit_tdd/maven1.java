package junitmaven.junit_tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class maven1 {

	@Test
	void test1char() {
		remove1char removechar=new remove1char();
		String actual=removechar.delete("ABCD");
		assertEquals("BCD",actual);
	}
	@Test
	void test2char() {
		remove1char remove2char=new remove1char();
		String actual=remove2char.delete("AACD");
		assertEquals("CD",actual);
	}
	@Test
	void test3char() {
		remove1char remove3char=new remove1char();
		String actual=remove3char.delete("BADC");
		assertEquals("BDC",actual);
	}
    @Test
	void test4char() {
		remove1char remove4char=new remove1char();
		String actual=remove4char.delete("BBAA");
		assertEquals("BBAA",actual);
	}
	@Test
	void test5char() {
		remove1char remove5char=new remove1char();
		String actual=remove5char.delete("AABAA");
		assertEquals("BAA",actual);
	}	
	
}
