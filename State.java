package Main;

//Интерфейс состояния
public interface State {

    //Отправка
    void departure();

    //переключение в другое состояние
    State nextStation();
}
