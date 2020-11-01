package andrey.patterns.behavioral.state;

public class TwentyFourHours {
    Light state;

    public TwentyFourHours() {
        state = new DayLight();
    }

    public void setState(Light state) {
        this.state = state;
    }

    public Light getState() {
        return state;
    }

}
