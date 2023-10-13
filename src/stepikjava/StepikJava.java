package stepikjava;

public class StepikJava {

    public static void main(String[] args) {
        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
        duck.display();
        Animal.displayDescription();
        duck.displayDescription();
        Fish okun = new Fish();
        okun.display();
        Fish.displayDescription();
        okun.displayDescription();
    }   
}