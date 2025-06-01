class CircularQueue{
    int arr[];
    int Front = -1;
    int Rear = -1;
    int Size;

    CircularQueue(int size){

        this.Size = size;
        arr = new int[Size];
    }

    public boolean IsEmpty(){
        if(Front == -1 && Rear == -1){
            return true;
        }else{
            return false;
        }
    }

    public boolean IsFull(){
        if((Rear + 1 )% Size == Front){
            return true;
        }else{
            return false;
        }
    }

    public void Enqueue(int val){
        if(IsFull()){
            System.out.println("The Queue Is Full");
            return;
        }else if(Front == -1 && Rear == -1){
            Front++;
            Rear++;
            arr[Rear] = val;
        }else{
            Rear = (Rear + 1 ) % Size;
            arr[Rear] = val;
        }
    }

    public void Dequeue(){

        int DVal;
        if(IsEmpty()){
            System.out.println("The Queue Is Empty");
            return;
        }else if(Front == Rear){
            DVal = arr[Front];
            Front--;
            Rear--;

            System.out.println(DVal);

        }else{
            DVal = arr[Front];
            Front = (Front + 1) % Size;
            System.out.println(DVal);
        }
    }

    public void Display(){
        int i = Front;

        while(i != Rear){
            System.out.print(arr[i] + " ");
            i = (i+1) % Size;
        }

        System.out.println(arr[Rear]);
    }
}

public class Java_05_Circular_Queue {

    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(10);

        q.Enqueue(0);
        System.out.println(q.Front + " " + q.Rear);
        q.Enqueue(1);
        System.out.println(q.Front + " " + q.Rear);
        q.Enqueue(2);
        System.out.println(q.Front + " " + q.Rear);
        q.Enqueue(3);
        System.out.println(q.Front + " " + q.Rear);
        q.Enqueue(4);
        System.out.println(q.Front + " " + q.Rear);
        q.Enqueue(5);
        System.out.println(q.Front + " " + q.Rear);
        q.Enqueue(6);
        System.out.println(q.Front + " " + q.Rear);
        q.Enqueue(7);
        System.out.println(q.Front + " " + q.Rear);
        q.Enqueue(8);
        System.out.println(q.Front + " " + q.Rear);
        q.Enqueue(9);
        System.out.println(q.Front + " " + q.Rear);

        q.Dequeue();
        System.out.println(q.Front + " " + q.Rear);

        q.Dequeue();
        System.out.println(q.Front + " " + q.Rear);

        q.Enqueue(0);
        System.out.println(q.Front + " " + q.Rear);

        q.Enqueue(1);
        System.out.println(q.Front + " " + q.Rear);

        q.Display();

        System.out.println(q.Front + " " + q.Rear);

        System.out.println(q.IsEmpty());
        System.out.println(q.IsFull());
    }
}
