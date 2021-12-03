package Main;

/*
Класс, объекты которого меняют свое поведение
в зависимости от состояния
 */
public class Context {

    //Текущее состояние
    State state;

    public void setState(State state){
        this.state = state;
    }

    public State getState() {
        return state;
    }

    //Следующее состояние
    public void nextStation(){
        this.state = state.nextStation();
    }

    public void departure(){

        System.out.println(">>>");
        this.state.departure();
        System.out.println(">>>");
    }
}
