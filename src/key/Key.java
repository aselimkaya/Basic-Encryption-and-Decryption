package key;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by ask on 29.09.2017.
 */
public class Key {
    private String[] bitRepOfKey; // Bit representation of the key

    public Key(){
        this.bitRepOfKey = generateRandomKey();
    }

    public Key(String[] bitRepOfKey){
        this.bitRepOfKey = bitRepOfKey;
    }

    public String[] getBitRepOfKey() {
        return bitRepOfKey;
    }

    public void setBitRepOfKey(String[] bitRepOfKey) {
        this.bitRepOfKey = bitRepOfKey;
    }

    private String[] generateRandomKey(){
        Random rand = new Random();
        List<String> list = new ArrayList<String>();
        for(int i=0;i<16;i++)
            list.add(""+rand.nextInt(2));
        return list.toArray(new String[0]);
    }
}