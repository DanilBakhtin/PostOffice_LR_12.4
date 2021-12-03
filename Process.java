package Main;

//Процесс отправки газет и журналов
public class Process {

    //начальное состояние
    State nach_state = new PrintEdition();
    Context context = new Context();

    //Старт отправки
    public void start(){
        context.setState(nach_state);

        while (context.getState() != null){
            context.departure();
            context.nextStation();
        }
    }
}
