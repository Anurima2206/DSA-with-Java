class C_LL{
    private int size;
    private Node head;
    private Node tail;
    public C_LL(){
        this.size=0;
    }
    public void insertfirst(int val){
        Node n=new Node(val);
        if(head==null){
            head=n;
            tail=n;
        }
        tail.next=n;
        n.next=head;
        head=n;
        size++;
    }

    public void insertlast(int val){
        Node n=new Node(val);
        if(head==null){
            head=n;
            tail=n;
        }
        n.next=head;
        tail.next=n;
        tail=n;
        size++;
    }

    public void insert(int val,int index){
        Node temp=head;
        if(index==0){
            insertfirst(val);
        }
        if(index==size-1){
            insertlast(val);
        }
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        Node node=new Node(val);
        node.next=temp.next;
        temp.next=node;
        size++;        
    }

    public void deletevalue(int value){  
        Node temp=head;
        for(int i=0;i<size;i++){
            if(temp.next.data==value){
                temp.next=temp.next.next;
                size--;
                return;
            }
            else{
            temp=temp.next;
            }
        }
    }

    public void display(){
        //Node temp=head;
        System.out.print(head.data+"->");
        Node temp=head.next;
        while(temp!=head){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("head");
    }
    private class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data=data;
        }
        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
}
public class circular_LL {
    public static void main(String[] args) {
        C_LL n1=new C_LL();
        n1.insertlast(5);
        n1.insertlast(7);
        n1.insertlast(2);
        n1.insertlast(4);
        n1.insertfirst(6);
        n1.insertfirst(8);
        n1.insert(9, 4);
        n1.display();
        System.out.println();
        n1.deletevalue(2);
        n1.display();
    }
}
