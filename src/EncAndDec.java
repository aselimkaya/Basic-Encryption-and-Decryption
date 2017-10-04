/**
 * Created by ask on 3.10.2017.
 */
class EncAndDec {

    static String encryption(String text, String[] key){
        StringBuilder encBits = new StringBuilder();

        for(int i=0;i<text.length();i++){
            int textBit = Character.getNumericValue(text.charAt(i));
            int keyBit = Integer.parseInt(key[i%16]);

            int result = textBit ^ keyBit;
            encBits.append(result);
        }

        StringBuilder toRet = new StringBuilder();
        for(int i=0;i<encBits.length()/8;i++){
            String subStr = encBits.substring(i*8,(i+1)*8);
            int charCode = Integer.parseInt(subStr, 2);
            toRet.append(Character.toString((char) charCode));
        }

        return toRet.toString();
    }
}