public class StringInverter implements StringTransformer{

    @Override
    public void execute(StringDrink drink) {
        StringBuilder text = new StringBuilder(drink.getText());
        drink.setText(text.reverse().toString());
    }
}
