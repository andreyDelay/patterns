package andrey.patterns.structural.composite;


import java.util.ArrayList;
import java.util.List;

public class Composite implements Screen {
    private List<Screen> components = new ArrayList<>();

    public void addComponent(Screen component) {
        components.add(component);
    }

    public void removeComponent(Screen component) {
        components.remove(component);
    }

    @Override
    public void showContent() {
        for (Screen component: components) {
            component.showContent();
        }
    }
}
