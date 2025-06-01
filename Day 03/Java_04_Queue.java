class Queue{
    int arr[];
    int Front = -1;
    int Rear = -1;

    Queue(int Size){
        arr = new int[Size];
    }

    public boolean IsEmpty(){
        if(Front == -1 && Rear == -1){
            return true;
        }

        return false;
    }

    public boolean IsFull(){
        if(Rear == arr.length - 1){
            return true;
        }

        return  false;
    }

    public void Enqueue(int val){
        if(IsFull()){
            System.out.println("The Queue Is Full");
            return;
        }

        Front = 0;
        Rear++;

        arr[Rear] = val;
    }

    public void Dequeue(){

        if(IsEmpty()){
            System.out.println("The Queue Is Empty");
            return;
        }

        if(Front > Rear){
            System.out.println("The Queue Is Empty");
            return;
        }

        int DequeueValue = arr[Front];

        Front++;

        System.out.println("Dequeue Value : " + DequeueValue);


    }

    public void Display(){
        for(int i=Front;i<=Rear;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


public class Java_04_Queue {

    public static void main(String[] args) {

        Queue queue = new Queue(10);

        queue.Enqueue(12);
        System.out.println(queue.Front + " " + queue.Rear);
        queue.Enqueue(14);
        System.out.println(queue.Front + " " + queue.Rear);
        queue.Enqueue(12);
        System.out.println(queue.Front + " " + queue.Rear);
        queue.Enqueue(14);
        System.out.println(queue.Front + " " + queue.Rear);
        queue.Enqueue(12);
        System.out.println(queue.Front + " " + queue.Rear);
        queue.Enqueue(14);
        System.out.println(queue.Front + " " + queue.Rear);

        queue.Dequeue();
        System.out.println(queue.Front + " " + queue.Rear);

        queue.Dequeue();
        System.out.println(queue.Front + " " + queue.Rear);
        queue.Dequeue();
        System.out.println(queue.Front + " " + queue.Rear);
        queue.Dequeue();
        System.out.println(queue.Front + " " + queue.Rear);
        queue.Dequeue();
        System.out.println(queue.Front + " " + queue.Rear);
//        queue.Dequeue();
//        System.out.println(queue.Front + " " + queue.Rear);
//        queue.Dequeue();
//        System.out.println(queue.Front + " " + queue.Rear);
//        queue.Dequeue();
//        System.out.println(queue.Front + " " + queue.Rear);

        queue.Display();

        System.out.println(queue.IsEmpty());
        System.out.println(queue.IsFull());
    }

}
