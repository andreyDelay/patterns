package andrey.patterns.structural.decorator;

public class InEarPhones implements HeadPhones{
    @Override
    public void phones() {
        System.out.print("This is an in-ear headphones.");
    }
}
