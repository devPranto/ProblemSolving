package JavaBasic;

public class StaticDemo {
    public static void main(String[] args) {
        Emp prova = new Emp();
        prova.eid = 1;
        prova.salary = 50000;
        System.out.println(prova);

    }
}

class Emp {
    int eid;
    int salary;
    static String ceo;

    static {
        ceo = "Pranto Dev";
        // you can only static var inside static method
    }

    public Emp() {
        eid = 101;
        salary = 10000;
    }

    public int getEid() {
        return eid;
    }

    public int getSalary() {
        return salary;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return getEid()+" || "+getSalary() ;   }
}
