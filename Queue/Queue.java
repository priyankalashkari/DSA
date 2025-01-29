package Queue;

public class Queue {
        private int front, rear, size;
        private int capacity;
        private int[] array;
    
        public Queue(int capacity) {
            this.capacity = capacity;
            this.front = 0;
            this.rear = -1;
            this.size = 0;
            this.array = new int[capacity];
        }
    
        // Check if the queue is full
        public boolean isFull() {
            return size == capacity;
        }
    
        // Check if the queue is empty
        public boolean isEmpty() {
            return size == 0;
        }
    
        // Enqueue operation
        public void enqueue(int item) {
            if (isFull()) {
                System.out.println("Queue is full. Cannot enqueue " + item);
                return;
            }
            rear = (rear + 1) % capacity;
            array[rear] = item;
            size++;
            System.out.println(item + " enqueued to the queue.");
        }
    
        // Dequeue operation
        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Cannot dequeue.");
                return Integer.MIN_VALUE;
            }
            int item = array[front];
            front = (front + 1) % capacity;
            size--;
            System.out.println(item + " dequeued from the queue.");
            return item;
        }
    
        // Peek operation (get front element without removing it)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty. No front element.");
                return Integer.MIN_VALUE;
            }
            return array[front];
        }
    
        // Display the queue elements
        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return;
            }
            System.out.print("Queue: ");
            for (int i = 0; i < size; i++) {
                System.out.print(array[(front + i) % capacity] + " ");
            }
            System.out.println();
        }
    
        public static void main(String[] args) {
            Queue queue = new Queue(5);
            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            queue.enqueue(40);
            queue.enqueue(50);
            queue.enqueue(60); // This will show a full queue message
            
            queue.display();
            
            queue.dequeue();
            queue.dequeue();
            
            queue.display();
            
            System.out.println("Front element: " + queue.peek());
        }    
}
