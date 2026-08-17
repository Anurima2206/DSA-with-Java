class D_LL{
    private int size;
    private Node head;
    private Node tail;
    public D_LL(){
        this.size=0;
    }
    public void insertfirst(int val){
        Node node=new Node(val);
        node.prev=null;
        if(head==null){
            head=node;
            tail=head;
            return;
        }
        node.next=head;
        head.prev=node;
        head=node;
        size++;
    }
    public void insertlast(int val){
        Node node=new Node(val);
        if(tail==null){
            insertfirst(val);
        }
        tail.next=node;
        node.prev=tail;
        tail=node;
        size++;
    }
    public void insert(int val,int index){
        Node node=new Node(val);
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
        node.next=temp.next;
        node.prev=temp.next.prev;
        temp.next.prev=node;
        temp.next=node;
        size++;
    }
    public int deletefirst(){
        Node temp=head;
        int val=head.data;
        head=temp.next;
        head.prev=null;
        temp=null;
        if(head==null){ 
            tail=null;
        }
        size--;
        return val;
    }
    public int deletelast(){
        if(size<=1){
            deletefirst();
        }
        int val=tail.data;
        Node temp=tail;
        tail=temp.prev;
        tail.next=null;
        temp=null;
        size--;
        return val;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("End");
    }

    public void display_rev(){
        Node temp=head;
        Node last=null;
        while(temp!=null){
            last=temp;
            temp=temp.next;   
        }
        while(last!=null){
            System.out.print(last.data+"->");
            last=last.prev;
        }
        System.out.println("Start");

    }

    private class Node{
        private int data;
        private Node next;
        private Node prev;

        public Node(int data){
            this.data=data;
        }
        public Node(int data,Node next,Node prev){
            this.data=data;
            this.next=next;
            this.prev=prev;
        }
    }
}
public class double_LL {
    public static void main(String[] args) {
        D_LL n1=new D_LL();
        n1.insertfirst(3);
        n1.insertfirst(4);
        n1.insertfirst(6);
        n1.insertlast(14);
        n1.insertlast(12);
        n1.insertlast(18);
        n1.insert(9, 3);
        n1.insert(11, 4);
        System.out.println(n1.deletefirst());
        System.out.println(n1.deletelast());
        n1.display();
        n1.display_rev();


    }
}
