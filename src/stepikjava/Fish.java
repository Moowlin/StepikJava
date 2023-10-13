package stepikjava;

public class Fish extends Animal{
    // -----= ПЕРЕМЕННЫЕ =----- //
    private String squama;
    private boolean upStreamSwim;
    // -----= ИНИЦИАЛИЗАТОР =----- //
    {
        setType("Рыба");
        setSwimm(true);
        squama = "NoType";
        upStreamSwim = false;
    }
    // -----= КОНСТРУКТОРЫ =----- //
    public Fish(){
        super();
        setType("Рыба");
        setSwimm(true);
    }
    public Fish(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim){
        super(type, name, age, weight, isFly, isWalk, isSwim);
    }
    // -----= СЕТТЕРЫ =----- //
    public void setSquama(String squama){
        this.squama = squama;
    }
    public void setUpStreamSwim(boolean upStreamSwim){
        this.upStreamSwim = upStreamSwim;
    }
    // -----= ГЕТТЕРЫ =----- //
    public String getSquama(){
        return this.squama;
    }
    public String isUpStreamSwim(){
        if (this.upStreamSwim == true){
            return "Да";
        } else {
            return "Нет";
        }
    }
    // -----= МЕТОДЫ =----- //
    public void bul_bul(){
        System.out.println("Bul-bu");
    }
    @Override
    public void display(){
        //System.out.printf("I am a: %s\t ", getType());
        System.out.printf("Тип: %s\t Имя: %s\t Возраст: %s\t Вес: %.2f\t Умеет летать: %s\t Умеет ходить: %s\t Умеет плавать: %s\t Тип чешуи: %s\t Умеет ли плавать против течения: %s\n", getType(), getName(), getAge(), getWeight(), isFly(), isWalk(), isSwimm(), getSquama(), isUpStreamSwim());
    }
}