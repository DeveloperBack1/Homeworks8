package homework4;

public class RunTranslator {
    public static void main(String[] args) {

TranslatorFromEngToRus translator = new TranslatorFromEngToRus("Robert", 35, "Male");

translator.infoTranslator();
translator.translate();

TranslatorfromFrToEng translatorfromFrToEng = new TranslatorfromFrToEng("Anna", 32, "Female");

translatorfromFrToEng.infoTranslator();
translatorfromFrToEng.translate();

TranslatorFromRuToEng translatorFromRuToEng = new TranslatorFromRuToEng("Алексей", 30, "Male");
translatorFromRuToEng.infoTranslator();
translatorFromRuToEng.translate();
    }
}
