package andrey.patterns.structural.proxy;

public class RealImageProxy implements Image {
    private String url;
    private RealImage image;

    public RealImageProxy(String url) {
        this.url = url;
    }

    @Override
    public void displayImage() {
        if (image == null) {
            image = new RealImage(url);
        }
        image.displayImage();
    }
}
