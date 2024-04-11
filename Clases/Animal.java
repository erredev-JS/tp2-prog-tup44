package Clases;

public abstract class Animal {

    private String name;
    private int age;
    private String animalType;
    private double price;


    public void feed(String nombre){

    }
    public String toString(){
        return "Nombre: " + this.name + " Edad: " + this.age + " Tipo de animal: " + this.animalType + " Precio: " + this.price;
    }

    public Animal(){

    };

    public Animal(String name, int age, String animalType, double price) {
        this.name = name;
        this.age = age;
        this.animalType = animalType;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
