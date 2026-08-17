class Custom_stack{
    protected int[] data;
    private static final int DEFAULT_SIZE=5;
    int top=-1;
    
    public Custom_stack(int size){
        this.data=new int[size];
    }
    public Custom_stack(){
        this(DEFAULT_SIZE);
    }

    void push(int val){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        top++;
        data[top]=val;
    }
    int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        } 
        int popped=data[top];
        top--;
        return popped;
    }

    int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        } 
        int peek=data[top];
        return peek;
    }

    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }

    boolean isFull(){
        if(top==data.length-1){
            return true;
        }
        return false;
    }
}
public class custom {
    public static void main(String[] args) throws Exception{
        //Custom_stack s=new Custom_stack();
        dynamic s=new dynamic();
        s.push(5);
        s.push(3);
        s.push(8);
        s.push(2);
        s.push(9);
        s.push(4);
        System.out.println("peeked = " + s.peek());
        //System.out.println("popped = " + s.pop());
        //System.out.println("peeked = " + s.peek());
    }
}
