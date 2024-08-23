package homework4;

public class TranslatorFromRuToEng extends Translator {

    public TranslatorFromRuToEng(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    void translate() {
        System.out.println("Übersetzer kann von Russisch auf Englisch übersetzen");
    }

    @Override
    public void infoTranslator() {
        super.infoTranslator();
    }
}
