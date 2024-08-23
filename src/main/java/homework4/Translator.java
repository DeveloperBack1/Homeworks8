package homework4;

//1) Есть абстрактный класс Переводчик, который имеет характеристики имя,
// возраст,
// пол и умеет переводить с одного языка на другой.
//Реализовать данный класс и создать несколько потомков классов различных
// переводчиков с одного языка на другой,
//например с английского на русский, с русского на немецки и т.п.
//Продумайте какова архитектура наследования будет в данном приложении.
//Можем ли мы использовать абстрактные классы и методы?

public abstract class Translator {

    protected String name;
    protected int age;
    protected String gender;

    public Translator(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public abstract String translate(String str);

    public void infoTranslator() {
        System.out.println("Name: " + name + " Age: " + age + " Gender: " + gender);
    }
}
