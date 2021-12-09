public abstract class Bar {
    private boolean happyHour;

    public Bar(boolean happyHour) {
        this.happyHour = happyHour;
    }

    public boolean isHappyHour() {return happyHour;}

    public void startHappyHour() {happyHour = true;}

    public void endHappyHour() { happyHour = false;}
}
