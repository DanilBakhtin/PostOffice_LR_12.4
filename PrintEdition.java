package Main;

//Печатное издание
public class PrintEdition implements State{

    @Override
    public void departure() {
        System.out.println("Печать газет и журналов");
    }

    @Override
    public State nextStation() {
        System.out.println("Отправка газет и журналов в почтовое отделение");
        return new PostOffice();
    }
}
