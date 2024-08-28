package homework4;

public class TranslatorfromFrToEng extends Translator {

    public TranslatorfromFrToEng(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String translate(String str) {
        return "Kann von französisch auf Englisch übersetzen: "+str;
    }

    @Override
    public void infoTranslator() {

        super.infoTranslator();
    }
}
