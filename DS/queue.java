package DS;

public class queue {
     public static void main(String[] args) {
         
     }
     public static void q(int...a){
        if(a.length==0) return;
        Node head=new Node();
        for(int i: a){
            head.setData(i);
        }

     }
     
}
 class Node{
     private int data;
     public Node next; 
    Node(int data){
    this.data=data;
    }
    Node(){

    }
    public void setData(int data) {
        this.data = data;
    }
}