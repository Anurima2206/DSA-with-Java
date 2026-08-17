    class LL {
    private int size;
    private Node head;
    private Node tail;
    public LL(){
        this.size=0;
    }
    public void insertfirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }

    public void insertlast(int val){
        Node node=new Node(val);
        if(tail==null){
            insertfirst(val);
        }
        tail.next=node;
        node=tail;
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
    
    public void insertrec(int index,int i,int val,Node temp){
        if(i==0){
            Node node=new Node(val);
        }
        if(i==index-1){
            Node node=new Node(val);
            node.next=temp.next;
            temp.next=node;
            size++;
            return; 
        } 
        insertrec(index, i+1, val,temp.next);  
    }

    public int deletefirst(){
        Node temp=head;
        int val=temp.data;
        head=head.next;
        temp.next=null;
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
        Node secondlast=get(size-2);
        int val=secondlast.next.data;
        secondlast.next=null;
        size--;
        return val;    
    }
    
    public Node get(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        //System.out.println(temp.data);
        return temp;
    }

    public int delete(int index){
        Node n=get(index-1);
        if(index==0){
            deletefirst();
        }
        if(index==size-1){
            deletelast();
        }
        int val=n.next.data;
        n.next=n.next.next;
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
        //System.out.println(size);
    }

    public Node find(int value){
        Node temp=head;
        while(temp!=null){
            if(temp.data==value){
                return temp;
            }
            temp=temp.next;
        }
        return null;
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
public class singly_LL{
    public static void main(String[] args) {
        LL n1=new LL();
        n1.insertfirst(14);
        n1.insertfirst(9);
        n1.insertfirst(5);
        n1.insertfirst(8);
        n1.insertrec(2, 0, 69,n1.get(0));
        n1.display();
        //System.out.println(n1.deletefirst());
        //System.out.println(n1.deletelast());
        //System.out.println(n1.delete(3));
        //n1.display();
    }
}
