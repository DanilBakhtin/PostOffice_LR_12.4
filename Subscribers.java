package Main;

//Класс подписчики
public class Subscribers implements State{
    @Override
    public void departure() {
        System.out.println("Получение подписчиками газет и журналов");
    }

    @Override
    public State nextStation() {
        System.out.println("Все подписчики довольны! :)");
        return null;
    }
}
