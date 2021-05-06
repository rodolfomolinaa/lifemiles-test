package com.lifemiles.main;

import com.lifemiles.controller.MessageController;

public class Main {

	public static void main(String[] args) {

		System.out.println("Morse " + MessageController.medicalUnitEncryption("ayuda"));
		System.out.println("BACEDIFOGU " + MessageController.infantryUnitEncryption("ayuda"));
		System.out.println("Octal " + MessageController.airUnitEncryption("ayuda"));
	}

}
