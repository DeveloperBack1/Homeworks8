package homework4;

public class RunTranslator {
    public static void main(String[] args) {

        TranslatorFromEngToRus translator =
                new TranslatorFromEngToRus("Robert", 35, "Male");

        translator.infoTranslator();
        System.out.println(translator.translate(" What is your name?\n"));

        TranslatorfromFrToEng translatorfromFrToEng =
                new TranslatorfromFrToEng("Anna", 32, "Female");

        translatorfromFrToEng.infoTranslator();
        System.out.println(translatorfromFrToEng.translate(" Quel est votre nom?\n"));

        TranslatorFromRuToEng translatorFromRuToEng =
                new TranslatorFromRuToEng("Алексей", 30, "Male");
        translatorFromRuToEng.infoTranslator();
        System.out.println(translatorFromRuToEng.translate(" Как тебя зовут?"));
    }
}
