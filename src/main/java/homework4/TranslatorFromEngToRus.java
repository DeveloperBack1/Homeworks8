package homework4;

public class TranslatorFromEngToRus extends Translator {

    public TranslatorFromEngToRus(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String translate(String str) {
        return "Kann von Englisch ins Russisch übersetzen: " + str;
    }

    @Override
    public void infoTranslator() {
        super.infoTranslator();
    }
}
