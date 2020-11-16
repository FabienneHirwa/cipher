package caesarCipher;
public class Decode {
    private String plain;
    private int myKey;

    public Decode(String plain, int myKey) {
        this.plain = plain;
        this.myKey= myKey;
    }

    public String getPlain(){
        return this.plain;
    }

    public int getMyKey(){
        return this.myKey;
    }

    public static String decrypt(String plain, int myKey) {

        String coded = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 26; i < plain.length(); i--) {
            if (alphabet.indexOf(plain.substring(i, i + 1)) != -1) {
                int letter = alphabet.indexOf((plain.substring(i, i + 1)));
//                int codeLetter=letter+myKey;
                int decodeLetter = (letter - myKey) % 26;
                coded += alphabet.substring(decodeLetter, decodeLetter + 1);
            } else {
                coded += plain.substring(i, i + 1);
            }
        }

        return coded;
    }
}

