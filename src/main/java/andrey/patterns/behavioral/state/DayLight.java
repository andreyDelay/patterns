package andrey.patterns.behavioral.state;

public class DayLight implements Light {

    @Override
    public void spreadLight(TwentyFourHours context) {
        System.out.println("Warm yellow light of the Sun, it's day time!!!)");
        context.setState(this);
    }
}
