package caesarCipher;

public class Encode {
    private String plain;
    private int myKey;

    public Encode(String plain, int myKey) {
        this.plain = plain;
        this.myKey= myKey;
    }

    public String getPlain(){
        return this.plain;
    }

    public int getMyKey(){
        return this.myKey;
    }


    public static String encrypt(String plain, int myKey){

        String coded="";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for(int i=0; i<plain.length(); i++){
            if(alphabet.indexOf(plain.substring(i,i+1))!=-1){
                int letter=alphabet.indexOf((plain.substring(i,i+1)));
                int codeLetter=letter+myKey;
                codeLetter%=26;
                coded+=alphabet.substring(codeLetter,codeLetter+1);
            }
            else{
                coded+=plain.substring(i,i+1);
            }
        }

        return coded;
    }


}


