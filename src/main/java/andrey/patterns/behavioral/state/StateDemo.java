package andrey.patterns.behavioral.state;

public class StateDemo {
    public static void main(String[] args) {
        TwentyFourHours twentyFourHours = new TwentyFourHours();
        OneWeek week = new OneWeek(twentyFourHours);
        week.liveOutOneWeek();
    }
}
