package andrey.patterns.structural.decorator;

public class OverHeadPhones implements HeadPhones{
    @Override
    public void phones() {
        System.out.print("This is an overhead headphones.");
    }
}
