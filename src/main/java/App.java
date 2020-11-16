
import caesarCipher.Decode;
import caesarCipher.Encode;

import java.io.Console;

public class App {
    public static void main(String[] args) {

        Console myConsole = System.console();
        System.out.println("Enter the word you want to encrypt:");
        String plainText = myConsole.readLine();
        System.out.println("Enter number you want to be shifted: ");
        String theKey = myConsole.readLine();
        Integer key  = Integer.parseInt(theKey);
        System.out.println("Encoded text: " + Encode.encrypt(plainText,key));
        System.out.println("Decoded text: " + Decode.decrypt(Encode.encrypt(plainText,key),key));






    }



}

