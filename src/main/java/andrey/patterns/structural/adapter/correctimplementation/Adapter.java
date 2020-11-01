package andrey.patterns.structural.adapter.correctimplementation;

public class Adapter extends VoiceMassage implements PhoneScreen {
    @Override
    public void showMassage(String massage) {
        StringBuilder stringBuilder = new StringBuilder("Сообщение преобразовано в голосовое: ");
        stringBuilder.append(massage);
        playMassage(stringBuilder.toString());
    }
}
