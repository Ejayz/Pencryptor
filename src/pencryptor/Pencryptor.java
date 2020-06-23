/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pencryptor;

/**
 *
 * @author Administrator
 */
public class Pencryptor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Encryptor enc = new Encryptor();
        System.out.println(enc.Encrypt("Hi this is a test will this try"));
        System.out.println(enc.Decryptor(enc.Encrypt("Hi this is a test will this try")));

    }

}
