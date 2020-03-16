package com.lab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StringOperationsTest
{

	StringOperations operation = new StringOperations();

	@DisplayName("Reverse string operation")
	@ParameterizedTest(name = "{0} -> {1}")
	@CsvSource({
			"asdf, fdsa",
			"1234567, 7654321",
			"a, a",
	})
	public void ReverseStringTest(String input, String reversed)
	{
		Assertions.assertEquals(reversed, operation.reverse(input));
	}

	@Test
	public void ReverseEmptyStringTest()
	{
		Assertions.assertEquals("", operation.reverse(""));
	}

	@Test
	public void ReverseNullStringTest()
	{
		Assertions.assertThrows(NullPointerException.class, () -> operation.reverse(null));
	}

//	@DisplayName("Concat strings operation")
//	@ParameterizedTest(name = "{0} + {1} -> {2}")
//	@CsvSource({
//			"asdf, fdsa, asdffdsa",
//			"1234567, , 1234567",
//			", a, a",
//			"a, , a",
//			",,"
//	})
//	public void ConcatStringTest(String inputA, String inputB, String output)
//	{
//		Assertions.assertEquals(output, operation.concat(inputA, inputB));
//	}
//
//	@Test
//	public void ConcatTwoEmptyStringsTest()
//	{
//		Assertions.assertEquals("", operation.concat("", ""));
//	}
//
//	@Test
//	public void ConcatEmptyAndNonEmptyStringsTest()
//	{
//		Assertions.assertEquals("asdf", operation.concat("", "asdf"));
//	}
//
//	@Test
//	public void ConcatNonEmptyAndEmptyStringsTest()
//	{
//		Assertions.assertEquals("asdf", operation.concat("asdf", ""));
//	}
}
