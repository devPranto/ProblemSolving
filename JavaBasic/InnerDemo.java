package JavaBasic;

public class InnerDemo {
    public static void main(String[] args) {
        Outer obj = new Outer();

        Outer.Inner obj2 = obj.new Inner();
        System.out.println(obj);
        System.out.println(obj2);
    }
}

class Outer {
    String name;

    class Inner {
        String name;

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "Hi from inner";
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "HI from outer";
    }
}