package com.study.disassembler.util;

public class Constants {
	public static final String INPUT_PATH = "./resource/inFile.txt";
	public static final String OUTPUT_PATH = "./resource/outFile.txt";
	public static final String WRONG_OUTPUT_MESSAGE = "Please, enter a valid tune recodring!";
	public static final String PARAGRAPH_PATTERN = "(\n?)(.+)\n?";
	public static final String SENTENCE_PATTERN = "(\\s?)([^.!?:\n]+[.!?:])";
	public static final String WORD_PATTERN = "(\\s?)(\\S+)(\\s?)";
	public static final String SYMBOL_PATTERN = "(\\s?)(\\S)(\\s?)";
	public static final String LETTER_PATTERN = "(\\s?)([^\\p{Punct}]+)(\\s?)";
	public static final String PUNCT_PATTERN = "(\\s?)(\\p{Punct}+)(\\s?)";
	public static final String TOP_LEVEL_PARSER = "PARAGRAPH";
	public static final String PARAGRAPH_START_END_SYMBOL = "\n";
	public static final String STANDARD_START_END_SYMBOL = "\\s";
}