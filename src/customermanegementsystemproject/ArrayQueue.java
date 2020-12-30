package customermanegementsystemproject;

public class ArrayQueue<E> implements Queue<Customer>{

    private static final int CAPACITY = 100;
    private Customer[] data;
    private int f = 0;
    private int size = 0;
    
    public ArrayQueue(){
        this(CAPACITY);
    }
    
    public ArrayQueue(int capacity){
        data = new Customer[capacity];
    }
    
    
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }
    
    @Override
    public void enqueue(Customer e) throws IllegalStateException{
        
        if(isFull())throw new IllegalStateException();
        
        int avail = (f+size)%data.length;
        data[avail] = e;
        size++;
    }
    
    public Customer[] returnAll(){
        if(isEmpty()) return null;
        
        return data;
    }
    
    public Customer last(){
        if(isEmpty()) return null;
        
        return data[size - 1];
    }
    
       
    @Override
    public Customer first() {
        if(isEmpty())return null;   
        return data[f];
    }
    
    
    @Override
    public Customer dequeue() {
        if(isEmpty())return null;
        Customer dequeed = data[f];
        data[f] = null;
        f = (f+1)%data.length;
        size--;
        return dequeed;
    }

    
}
