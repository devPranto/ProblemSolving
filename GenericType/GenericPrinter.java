package GenericType;

public  class GenericPrinter <type extends Number>{
    public <t> void genPrinter(t num){
        System.out.println(num);
    }
}
