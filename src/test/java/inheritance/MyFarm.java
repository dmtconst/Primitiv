package inheritance;


import metods.Pig;

public class MyFarm {
    public static void main(String[] args) {
        Cat koshka2 = new Cat("MARFA");
        koshka2.say();
        koshka2.setName("Киса");
        System.out.println("Новое имя:" + koshka2.getName());

        Dog sobaka1 = new Dog("TIM");
        sobaka1.getColor();

        Pig svin = new Pig("Nux-nux");
        System.out.println(svin.getName());
        svin.say();
        svin.getHobbie();

    }
}
