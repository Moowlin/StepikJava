package stepikjava;

public class Bird extends Animal{
    // -----= ПЕРЕМЕННЫЕ =----- //
    private String area;
    private boolean winterFly;
    // -----= ИНИЦИАЛИЗАТОР =----- //
    {
        setType("Птица");
        setFly(true);
        area = "NoArea";
        winterFly = false;
    }
    // -----= КОНСТРУКТОРЫ =----- //
    public Bird(){}
    public Bird(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim, String area, boolean winterFly){
        super(type, name, age, weight, isFly, isWalk, isSwim);
        setArea(area);
        setWinterFly(winterFly);
    }
    // -----= СЕТТЕРЫ =----- //
    public void setArea(String area){
        this.area = area;
    }
    public void setWinterFly(boolean winterFly){
        this.winterFly = winterFly;
    }
    // -----= ГЕТТЕРЫ =----- //
    public String getArea(){
        return this.area;
    }
    public String isWinterFly(){
        if (this.winterFly == true){
            return "Да";
        } else {
            return "Нет";
        }
    }
    // -----= МЕТОДЫ =----- //
    public void chirick_chirick(){
        System.out.println("Chirik-Chirik");
    }
    @Override
    public void display(){
        //System.out.printf("I am a: %s\t ", getType());
        System.out.printf("Тип: %s\t Имя: %s\t Возраст: %s\t Вес: %.2f\t Умеет летать: %s\t Умеет ходить: %s\t Умеет плавать: %s\t Среда обитания: %s\t Умеет зимовать: %s\n", getType(), getName(), getAge(), getWeight(), isFly(), isWalk(), isSwimm(), getArea(), isWinterFly());
    }
}