/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pencryptor;

import java.util.Base64;

/**
 *
 * @author Administrator
 */
public class Encryptor {

    public String Encrypt(String Phrase) {

        int bytes = 0;
        char[] CHARACTER_MESSAGE = Phrase.toCharArray();
        String ENCRYPTED_ARRAY = "";

        for (int j = 0; j < CHARACTER_MESSAGE.length; j++) {
            bytes = (int) CHARACTER_MESSAGE[j];
            for (int i = 0; i < 99999; i++) {
                bytes = bytes + 23;
            }
            ENCRYPTED_ARRAY = ENCRYPTED_ARRAY + "." + bytes;
        }

        return ENCRYPTED_ARRAY;
    }

    public String Decryptor(String ENCRYPTED_ARRAY) {
        String[] Splited_Array = ENCRYPTED_ARRAY.split("\\.");

        String Dycrypted_String = "";

        for (int j = 0; j < Splited_Array.length; j++) {

            if (!Splited_Array[j].isEmpty()) {
                int Encrypted_String = Integer.valueOf(Splited_Array[j]);
                for (int i = 0; i < 99999; i++) {
                    Encrypted_String = Encrypted_String - 23;
                }
                Dycrypted_String = Dycrypted_String + "." + Encrypted_String;
            }

        }
        String[] Decrypted_Message = Dycrypted_String.split("\\.");

        String Decrypted = "";
        for (int i = 0; i < Decrypted_Message.length; i++) {
            if (!Decrypted_Message[i].isEmpty()) {
                int Char = Integer.valueOf(Decrypted_Message[i]);
                char ascii = (char) Char;
                Decrypted = Decrypted + "" + ascii;
            }

        }
        return Decrypted;
    }

}
