import key.Key;
import text.Text;

/**
 * Created by ask on 29.09.2017.
 */
public class Main {
    public static void main(String[] args) {
        Text text = new Text("Better Latte than never");

        Key k1 = new Key();
        String[] key = k1.getBitRepOfKey();

        String encryption = EncAndDec.encryption(text.getBinaryText(), key);
        System.out.println(encryption);

        Text text2 = new Text(encryption);
        String decryption = EncAndDec.encryption(text2.getBinaryText(), key);
        System.out.println(decryption);
    }
}