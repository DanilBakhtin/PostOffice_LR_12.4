package Main;

//Почтовое отделение
public class PostOffice implements State{


    @Override
    public void departure() {
        System.out.println("Почтовое отделение получило газеты и журналы");
    }

    @Override
    public State nextStation() {
        System.out.println("Отправка газет и журналов подписчикам");
        return new Subscribers();
    }
}
