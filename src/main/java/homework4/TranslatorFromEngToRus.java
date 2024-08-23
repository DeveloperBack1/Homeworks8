package homework4;

public class TranslatorFromEngToRus extends Translator{

    public TranslatorFromEngToRus(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    void translate() {
        System.out.println("Kann von Englisch auf Russisch übersetzen");
    }

    @Override
    public void infoTranslator() {
        super.infoTranslator();
    }
}
