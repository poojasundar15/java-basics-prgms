abstract class Animal {
    abstract void dog();
    abstract void cat();
    abstract void pig();
}
class AnimalImpl extends Animal{
    private String animals;

     String getAnimals() {
        return animals;
    }
    void setAnimals(String animals) {
        this.animals=animals;
    }
    @Override
    void dog() {
        System.out.println("Dog");
    }
    @Override
    void cat() {
        System.out.println("Cat");
    }
    @Override
    void pig() {
        System.out.println("Pig");
    }
    public static void main(String[] args) {
        AnimalImpl animal = new AnimalImpl();
        animal.dog();
        animal.cat();
        animal.pig();
        animal.setAnimals("Donkey");
        System.out.println(animal.getAnimals());
    }
}

