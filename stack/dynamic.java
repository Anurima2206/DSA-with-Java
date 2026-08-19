public class dynamic extends Custom_stack{
    public dynamic(){
        super();
    }
    public dynamic(int size){
        super(size);
    }
    @Override
    public void push(int val){
        if(this.isFull()){
           int[] temp=new int[data.length*2];
           for (int i = 0; i < data.length; i++) {
               temp[i]=data[i];
           }
           data=temp;
        }
        super.push(val);
        return;
    }
}
