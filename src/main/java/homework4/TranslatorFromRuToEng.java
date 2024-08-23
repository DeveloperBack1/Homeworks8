package homework4;

public class TranslatorFromRuToEng extends Translator {

    public TranslatorFromRuToEng(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String translate(String str) {
        return "Übersetzer kann von Russisch auf Englisch übersetzen: "+str;
    }

    @Override
    public void infoTranslator() {
        super.infoTranslator();
    }
}
