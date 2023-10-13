package stepikjava;

public class Animal {
  // -----= ПЕРЕМЕННЫЕ =----- //
    private String type;
    private String name;
    private int age;
    private double weight;
    private boolean isFly;
    private boolean isWalk;
    private boolean isSwim;
    static String description;
    // -----= ИНИЦИАЛИЗАТОРЫ =----- //
    {
        type    = "NoType";
        name    = "NoName";
        age     = 0;
        weight  = 0.0;
        isFly   = false;
        isWalk  = false;
        isSwim  = false;
    }
    static{
        description = "Класс животное с полями: тип, имя, возраст, вес, умения летать, ходить, плавать";
    }
    // -----= КОНСТРУКТОРЫ =----- //
    public Animal(){}
    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim){
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }
    // -----= СЕТТЕРЫ =----- //
    public void setType(String type){
        this.type = type;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setFly(boolean isFly){
        this.isFly = isFly;
    }
    public void setWalk(boolean isWalk){
        this.isWalk = isWalk;
    }
    public void setSwimm(boolean isSwim){
        this.isSwim = isSwim;
    }
    // -----= ГЕТТЕРЫ =----- //
    public String getType(){
        return this.type;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double getWeight(){
        return this.weight;
    }
    public String isFly(){
        if (this.isFly == true){
            return "Да";
        } else {
            return "Нет";
        }
    }
    public String isWalk(){
        if (this.isWalk == true){
            return "Да";
        } else {
            return "Нет";
        }
    }
    public String isSwimm(){
        if (this.isSwim == true){
            return "Да";
        } else {
            return "Нет";
        }
    }
    // -----= МЕТОДЫ =----- //
    public void display(){
        System.out.printf("Тип: %s\t Имя: %s\t Возраст: %s\t Вес: %.2f\t Умеет летать: %s\t Умеет ходить: %s\t Умеет плавать: %s\n", type, name, age, weight, isFly(), isWalk(), isSwimm());
    }
    public void holiday(int day){
        this.weight = weight + 0.1 * day;
    }
    public void  holiday(double m, int n){
        this.weight = weight + m * n;
    }
    public void holiday(double m) {
        this.weight = weight + m;
    }
    static void displayDescription(){
        System.out.println(description);
    }
}