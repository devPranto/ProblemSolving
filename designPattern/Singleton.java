package BackendEngineering.src.designPattern;

public class Singleton {
    private static Singleton single= new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return single;
    }
    public void calculator(int a , int b){
        System.out.println(a+b);
    }

    @Override
    public String toString() {
        return "I am a singleton design pattern object";
    }
}
