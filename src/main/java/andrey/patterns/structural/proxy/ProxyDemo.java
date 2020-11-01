package andrey.patterns.structural.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Image image = new RealImageProxy("http://patternsJava.com/proxy_pattern_scheme");
        image.displayImage();
    }
}
