class SinglyLL{

    int Size;

    SinglyLL(){
        this.Size = 0;
    }

    class Node{
        int Data;
        Node next;

        Node(int Data){
            this.Data = Data;
        }

        Node(int Data,Node next){
            this.Data = Data;
            this.next = next;
        }
    }

    Node Head = null;
    Node Tail = null;

    public void CreateList(int Data){
        if(Size == 0){
            Node NewNode = new Node(Data);
            Head = NewNode;
            Tail = NewNode;
            this.Size++;
        }
    }

    public void InsertFirst(int Data){

        if(Size == 0){
            CreateList(Data);
            return;
        }

        Node newNode = new Node(Data);
        newNode.next = Head;

        Head = newNode;

        this.Size++;

    }

    public void InsertEnd(int Data){
        if(Size == 0){
            CreateList(Data);
            return;
        }

        Node newNode = new Node(Data);
        Tail.next = newNode;
        newNode.next = null;

        Tail = newNode;

        this.Size++;
    }

    public void DisplayList(){
        Node Temp = Head;

        if(Size == 0){
            System.out.println(Temp.Data + " -> null");
        }

        for(int i=0;i<Size;i++){
            System.out.print(Temp.Data + " -> ");
            Temp = Temp.next;
        }
        System.out.println("null");
    }

}


public class Java_06_LinkedList {

    public static void main(String[] args) {

        SinglyLL ll = new SinglyLL();

        ll.CreateList(2);

        ll.InsertFirst(7);
        ll.InsertFirst(5);

        ll.InsertEnd(9);
        ll.InsertEnd(11);

        ll.DisplayList();

        System.out.println("Head = " + ll.Head.Data);
        System.out.println("Tail = " + ll.Tail.Data);
    }
}
