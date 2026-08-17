import java.util.*; 
public class inbuiltLL {
    public static void main(String[] args){
        LinkedList<Integer> ll =new LinkedList<>();
        ll.add(2);
        ll.add(3);
        ll.add(5);
        ll.add(5);
        ll.add(3);
        ll.add(4);
        System.out.println(ll);
        //removedup(ll);
        //System.out.println(ll);
        LinkedList<Integer> ll1 =new LinkedList<>();
        ll1.add(1);
        ll1.add(2);
        ll1.add(5);
        System.out.println(ll1);

        LinkedList<Integer> ll2 =new LinkedList<>();
        ll2.add(3);
        ll2.add(4);
        ll2.add(6);
        System.out.println(ll2);
        LinkedList<Integer>list=mergesortedLL(ll1, ll2);
        System.out.println(list);
    }
    static void removedup(LinkedList<Integer> ll){
        HashSet<Integer> set=new HashSet<>();
        Iterator<Integer> it = ll.iterator();
        while(it.hasNext()){
            int num=it.next();
            if(set.contains(num)){
                it.remove();
            }
            else{
                set.add(num);
            }
        }
        return;
    }

    static LinkedList<Integer> mergesortedLL(LinkedList<Integer> ll1,LinkedList<Integer> ll2){
        LinkedList<Integer> list=new LinkedList<>();
        Iterator<Integer> it2 = ll2.iterator();
        while(it2.hasNext()){
            int num=it2.next();
            ll1.add(num);
        }
        Collections.sort(ll1);
        return ll1;
    }

    
}
