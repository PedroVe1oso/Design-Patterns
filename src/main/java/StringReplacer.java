public class StringReplacer  implements StringTransformer{

    private char a;
    private char b;

    public StringReplacer(char a, char b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void execute(StringDrink drink) {
        StringBuffer str = new StringBuffer(drink.getText());
        for (int i = 0; i < drink.getText().length(); i++) {
            if(str.charAt(i) == a) str.setCharAt(i, b);
        }
        drink.setText(str.toString());
    }
}
