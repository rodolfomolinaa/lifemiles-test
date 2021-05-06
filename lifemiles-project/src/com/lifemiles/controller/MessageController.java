package com.lifemiles.controller;

import com.lifemiles.service.EncryptMessageImp;

public class MessageController {
	private static final EncryptMessageImp encryptMessage = new EncryptMessageImp();

	public static String medicalUnitEncryption(String message) {
		return encryptMessage.medicalUnit(message);
	}

	public static String infantryUnitEncryption(String message) {
		return encryptMessage.infantryUnit(message);
	}

	public static String airUnitEncryption(String message) {
		return encryptMessage.airUnit(message);
	}
}
