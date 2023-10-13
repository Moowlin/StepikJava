package stepikjava;

public class Insect extends Animal{
    // -----= ПЕРЕМЕННЫЕ =----- //
    private int wingCount;
    private boolean likeJesus;
    // -----= ИНИЦИАЛИЗАТОР =----- //
    {
        setType("Насекомое");
        setWalk(true);
        wingCount = 0;
        likeJesus = false;
    }
    // -----= КОНСТРУКТОРЫ =----- //
    public Insect(){
        super();
        setType("Насекомое");
        setWalk(true);
    }
    public Insect(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim){
        super(type, name, age, weight, isFly, isWalk, isSwim);
    }
    // -----= СЕТТЕРЫ =----- //
    public void setWingCount(int wingCount){
        this.wingCount = wingCount;
    }
    public void setLikeJesus(boolean likeJesus){
        this.likeJesus = likeJesus;
    }
    // -----= ГЕТТЕРЫ =----- //
    public int getWingCount(){
        return this.wingCount;
    }
    public String isLikeJesus(){
        if (this.likeJesus == true){
            return "Да";
        } else {
            return "Нет";
        }
    }
    // -----= МЕТОДЫ =----- //
    public void ggggg(){
        System.out.println("Ggggg");
    }
    @Override
    public void display(){
        //System.out.printf("I am a: %s\t ", getType());
        System.out.printf("Тип: %s\t Имя: %s\t Возраст: %s\t Вес: %.2f\t Умеет летать: %s\t Умеет ходить: %s\t Умеет плавать: %s\t Количество крыльев: %s\t Умеет ли ходить по воде: %s\n", getType(), getName(), getAge(), getWeight(), isFly(), isWalk(), isSwimm(), getWingCount(), isLikeJesus());
    }
}