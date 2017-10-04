package text;

/**
 * Created by ask on 3.10.2017.
 */
public class Text {
    private String text;

    public Text(String text) {
        if(text.length() % 2 == 1)
            text += " ";
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        if(text.length() % 2 == 1)
            text += " ";
        this.text = text;
    }

    public String getBinaryText(){
        StringBuilder toRet = new StringBuilder();

        for(Character c: this.text.toCharArray()){
            StringBuilder temp = new StringBuilder();
            temp.append(Integer.toBinaryString(c));
            while(temp.length()<8)
                temp.insert(0, "0");
            toRet.append(temp);
        }

        return toRet.toString();
    }
}
