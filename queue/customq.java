class Custom_queue{
    protected int[] data;
    private static final int DEFAULT_SIZE=5;
    int front=-1;
    int rear=-1;
    
    public Custom_queue(int size){
        this.data=new int[size];
    }
    public Custom_queue(){
        this(DEFAULT_SIZE);
    }
    public void add(int val){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        else if(isEmpty()){
            front++;
        }
        rear++;
        data[rear]=val;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int popped=data[front];
        for(int i=1;i<=rear;i++){
            data[i-1]=data[i];
        }
        rear--;
        return popped;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        } 
        int peek=data[front];
        return peek;
    }

    public void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(data[i] + " -> ");
        }
        System.out.println("END");
    }

    public boolean isEmpty(){
        if(front==-1){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(rear==data.length-1){
            return true;
        }
        return false;
    }
}

public class customq {
    public static void main(String[] args) throws Exception{
        Custom_queue q=new Custom_queue();
        q.add(5);
        q.add(4);
        q.add(7);
        System.out.println("peeked = "+q.peek());
        q.display();
        System.out.println("popped = "+q.remove());
        q.add(3);
        q.add(2);
        q.add(1);
        q.display();
    }
}
