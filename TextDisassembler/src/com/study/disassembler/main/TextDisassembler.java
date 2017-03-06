package com.study.disassembler.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.study.disassembler.util.Constants;
import com.study.disassembler.util.InputFileReader;

public class TextDisassembler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = InputFileReader.readInput();
		Matcher mc = Pattern.compile(Constants.PARAGRAPH_PATTERN).matcher(input);
		
		while (mc.find()){
			Matcher mc1 = Pattern.compile(Constants.WORD_PATTERN).matcher(mc.group(2));
			while (mc1.find()){
				System.out.println(mc1.group(2));
			}			
			System.out.println(mc.group(2));
		}
	}

}
