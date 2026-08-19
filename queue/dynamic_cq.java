public class dynamic_cq extends Cir_queue{
    public dynamic_cq(){
        super();
    }
    public dynamic_cq(int size){
        super(size);
    }
    @Override
    public void add(int val){
        if(this.isFull()){
            int[] temp= new int[data.length * 2];
            for (int i=0;i<data.length;i++) {
                temp[i]=data[(front + i) % data.length];
            }
            front=0;
            rear=data.length;
            data=temp;
        }
        super.add(val);
        return;
    }
}
