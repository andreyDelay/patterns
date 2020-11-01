package andrey.patterns.behavioral.state;

public class NightLight implements Light{
    @Override
    public void spreadLight(TwentyFourHours context) {
        System.out.println("Cold white light of the Moon, it's night time!!!");
        context.setState(this);
    }
}
