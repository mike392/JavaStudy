package com.study.disassembler.util;

public class RegExp {
	public static final String PARAGRAPH_PATTERN = "(\n?)(.+)\n?";
	public static final String SENTENCE_PATTERN = "(\\s?)([^.!?:\n]+[.!?:])";
	public static final String WORD_PATTERN = "(\\s?)(\\S+)(\\s?)";
	public static final String SYMBOL_PATTERN = "(\\s?)(\\S)(\\s?)";
	public static final String LETTER_PATTERN = "(\\s?)([^\\p{Punct}]+)(\\s?)";
	public static final String PUNCT_PATTERN = "(\\s?)(\\p{Punct}+)(\\s?)";
}
