package com.example.buildertwo.Configuration;


import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class KeyConfig {


    private KeyConfig() {}

    static KeyPair generateRsaKey() {
        KeyPair keyPair;


        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            keyPair = keyPairGenerator.generateKeyPair();
            return keyPair;

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }


}
