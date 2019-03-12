
public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue(10);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.deque();
		
       	}
	  int size ,first , last , capacity;
      int arr[]  ;
       // constructor for  initialize purpose 
      public Queue(int capacity){
    	  this.capacity = capacity;
    	  first = this.size = 0;
    	  last = capacity -1;
    	  arr = new int[capacity];
    	  
      }
      
      //check queue is full
        boolean isFull(Queue q){
        	return(q.size == q.capacity);
        }
        // check queue is empty 
        boolean isEmpty(Queue q){
        	return(q.size==0);
        }
         // for inserting elements in queue
        void enqueue(int element){
        	if(isFull(this))
        		return;
        	this.last = (this.last+1)%this.capacity;
        	this.arr[last] = element;
        	this.size = this.size+1;
        	System.out.println("element entered in queue : " +element);
        }
        // for removing elements from queue
        int deque(){
        	if(isEmpty(this))
        		return 0;
        	int element = this.arr[first];
        	this.first = (this.first+1)%this.capacity; 
        	this.size = this.size-1;
        	System.out.println("element removed : " + element);
        	return element;
        	
        }
}
