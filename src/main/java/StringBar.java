public class StringBar extends Bar
{
    private boolean ishappy;
    public StringBar(){ishappy = false;}
    @Override
    public boolean isHappyHour() {
        return ishappy;
    }
    @Override
    public void startHappyHour()
    {
        ishappy = true;
        notifyObservers();
    }
    @Override
    public void endHappyHour() {
        ishappy = false;
        notifyObservers();
    }
}
