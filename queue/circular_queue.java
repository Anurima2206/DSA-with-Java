class Cir_queue{
    protected int[] data;
    private static final int DEFAULT_SIZE=5;
    int front=-1;
    int rear=-1;
    
    public Cir_queue(int size){
        this.data=new int[size];
    }
    public Cir_queue(){
        this(DEFAULT_SIZE);
    }

    void add(int val){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        
        else if(isEmpty()){
            front++;
        }
        rear=(rear+1)%data.length;
        data[rear]=val;
    }
    boolean isEmpty(){
        if(front==-1){
            return true;
        }
        return false;
    }

    boolean isFull(){
        if((rear+1)%data.length==front){
            return true;
        }
        return false;
    }
    int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        else if(front==rear){
            int popped=data[front];
            front=-1;
            rear=-1;
            return popped;
        }
        int popped=data[front];
        front=(front+1)%data.length;
        return popped;
    }

    int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        } 
        int peek=data[front];
        return peek;
    }
}
public class circular_queue {
    public static void main(String[] args) throws Exception{
        //Cir_queue q=new Cir_queue();
        dynamic_cq q=new dynamic_cq();
        q.add(5);
        q.add(3);
        q.add(1);
        System.out.println("peeked "+q.peek());
        //System.out.println("popped "+q.remove());
        q.add(2);
        q.add(7);
        q.add(9);
    }
}
