package homework4;

public class TranslatorfromFrToEng extends Translator {

    public TranslatorfromFrToEng(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    void translate() {
        System.out.println("Kann von französisch auf Englisch übersetzen");
    }

    @Override
    public void infoTranslator() {
        super.infoTranslator();
    }
}
