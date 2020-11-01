package andrey.patterns.structural.proxy;

public class RealImage implements Image {
    private String url;

    public RealImage(String url) {
        this.url = url;
        loadImage();
    }

    private void loadImage() {
        System.out.println("Loading real image from the Internet.");
    }

    @Override
    public void displayImage() {
        System.out.println("Displaying the image.");
    }
}
