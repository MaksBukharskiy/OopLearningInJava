package PolymorphysmProgram;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed(){
        return breed;
    }

    @Override
    public void displayInfo(){
        System.out.println("Animal: " + getName() + " Breed: " + breed +" Age: " + getAge());
    }
}
