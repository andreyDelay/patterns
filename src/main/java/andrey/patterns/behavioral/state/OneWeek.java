package andrey.patterns.behavioral.state;

public class OneWeek {
    TwentyFourHours tfh;

    public OneWeek(TwentyFourHours tfh) {
        this.tfh = tfh;
    }

    public void liveOutOneWeek() {
        for (int i = 0; i < 14; i++) {
            if (tfh.getState() instanceof DayLight) {
                tfh.setState(new NightLight());
            } else if (tfh.getState() instanceof NightLight) {
                tfh.setState(new DayLight());
            }
            tfh.getState().spreadLight(tfh);
        }
        System.out.println("Congrats! You've lived(lost) out one week!");
    }
}
