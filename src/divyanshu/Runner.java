package divyanshu;

public class Runner {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(5);
        q.enQueue(7);
        q.enQueue(13);
        q.enQueue(15);
        q.enQueue(17);
        q.deQueue();
        q.deQueue();
        q.show();
        System.out.println("Size is :"+q.getSize());
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
    }
}
