package org.webService.Service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HashCoderTest {

	@Test
	void test() {
		HashCoder coder = new HashCoder();
		byte[] bytes = {105, 109, 112, 111, 114, 116, 32, 103, 114, 111, 111, 118, 121, 46, 106, 115};
		String result = coder.getHashCode(bytes);
		assertEquals("288b49702b909f3009a4297c8eb3e506d86ca6ae281025bd799ba67cf6370d77", result);
	}

}
