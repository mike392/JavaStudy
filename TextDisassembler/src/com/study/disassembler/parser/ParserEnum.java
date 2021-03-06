package com.study.disassembler.parser;

import com.study.disassembler.parser.impl.SymbolParser;
import com.study.disassembler.parser.impl.ParagraphParser;
import com.study.disassembler.parser.impl.PunctParser;
import com.study.disassembler.parser.impl.SentenceParser;
import com.study.disassembler.parser.impl.WordParser;

public enum ParserEnum {
	PUNCT(new PunctParser()),
	SYMBOL(new SymbolParser()),
	WORD(new WordParser()),
	SENTENCE(new SentenceParser()),
	PARAGRAPH(new ParagraphParser());
	
	private TextComponentParser parser;
	
	private ParserEnum(TextComponentParser parser){
		this.setParser(parser);
	};

	public void setParser(TextComponentParser parser) {
		this.parser = parser;
	}
	
	public TextComponentParser getParser() {
		return this.parser;
	}
}
