package andrey.patterns.structural.facade;

public class ClownsConcert implements Concert{

    @Override
    public void entrance() {
        System.out.println("Смешное приветствие, плавное знакомство с участниками представления.");
    }

    @Override
    public void mainEvent() {
        System.out.println("Основная часть представления, сложная программа.");
    }

    @Override
    public void conclusion() {
        System.out.println("Завершающая стадия выступления, прощание с аудиторией.");
    }

    @Override
    public void stageCurtain() {
        System.out.println("Занавес. Авации))!");
    }
}
