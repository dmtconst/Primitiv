package Metods;

import Inheritance.AnimalColor;

public class Pig implements AnimalColor {
    private String name = "Naf-Naf";

    public void say(){
        System.out.println("Xru-xru");
    }

    public String getName() {
        return name;
    }

    public void getColor(){
        System.out.println("Pink");
    }


    @Override
    public void getHobbie(){
        System.out.println("Eating");
    }


}
