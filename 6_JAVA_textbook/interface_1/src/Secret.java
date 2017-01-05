import java.util.Random;

//represents a message that can be encrypted and decrypted
public class Secret implements Encryptable{


    private String message;
    private int shift;
    private boolean encrypted;
    private Random generator;


    //constructor
    public Secret(String msg){
        message = msg;
        //put a default
        encrypted = false;
        //random generates
        generator = new Random();
        shift = generator.nextInt(10)+5;
    }

    public boolean isEncrypted(){
        return encrypted;
    }

    public void encrypt(){

        if(!encrypted){
            String masked = "";
            for(int index = 0; index < message.length(); index++){
                masked = masked + (char)(message.charAt(index)+shift);
            }
            message = masked;
            encrypted = true;
        }
    }

    public String decrypt(){
        if (encrypted){
            String unmasked = "";
            for (int index = 0; index < message.length(); index++){
                unmasked = unmasked + (char)(message.charAt(index)-shift);
            }
            message = unmasked;
            encrypted = false;
        }
        return message;
    }

    public String toString(){
        return message;
    }
}
