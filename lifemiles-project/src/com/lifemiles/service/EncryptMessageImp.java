package com.lifemiles.service;

import java.util.HashMap;

public class EncryptMessageImp implements IEncryptMessage {

	@Override
	public String medicalUnit(String text) {
		String encodedText = "";
		Character[] characters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
				'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "..", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
				"..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----" };
		char[] splitText = text.toCharArray();

		HashMap<Character, String> morseLetter = new HashMap<>();

		for (int i = 0; i <= characters.length - 1; i++) {
			morseLetter.put(characters[i], morse[i]);
		}

		for (char c : splitText) {
			encodedText += morseLetter.get(Character.toUpperCase(Character.valueOf(c))) + " ";
		}

		return encodedText;
	}

	@Override
	public String infantryUnit(String text) {
		String encodedText = "";
		Character[] characters = { 'B', 'A', 'C', 'E', 'D', 'I', 'F', 'O', 'G', 'U' };
		Integer[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		char[] splitText = text.toCharArray();

		HashMap<Character, Integer> characterNumber = new HashMap<>();

		for (int i = 0; i <= characters.length - 1; i++) {
			characterNumber.put(characters[i], numbers[i]);
		}

		for (char c : splitText) {
			if (characterNumber.containsKey(Character.toUpperCase(Character.valueOf(c)))) {
				encodedText += characterNumber.get(Character.toUpperCase(Character.valueOf(c)));
			} else {
				encodedText += c;
			}
		}

		return encodedText;
	}

	@Override
	public String airUnit(String text) {
		String encodedText = "";
		for (int i = 0; i < text.length(); i++) {
			encodedText += Integer.toOctalString(text.charAt(i)) + " ";
		}
		return encodedText;
	}

}
