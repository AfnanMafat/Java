class Stack{

    int arr[];
    int top = -1;

    Stack(int Size){
        arr = new int[Size];
    }

    public boolean IsEmpty(){
        if(top == -1){
            return true;
        }

        return false;
    }

    public boolean IsFull(){
        if(top == arr.length-1){
            return true;
        }

        return false;
    }

    public void Push(int val){
        if(IsFull()){
            System.out.println("Stack Is Full");
            return;
        }

        top++;
        arr[top] = val;
    }

    public void Pop(){
        if(IsEmpty()){
            System.out.println("The Stack Is Empty");
            return;
        }

        int popVal = arr[top];
        top--;

        System.out.println("The Pop Value Is : " + popVal);
    }

    public int Peek(){
        if(IsEmpty()){
            System.out.println("The Stack Is Empty");
            return -1;
        }

        return arr[top];
    }

    public void Display(){
        System.out.print("[ ");
        for(int i=top;i>=0;i--){
            System.out.print(arr[i] + " ");
        }

        System.out.print("]");

        System.out.println();
    }
}

public class Java_03_Stack {

    public static void main(String[] args) {

        Stack st = new Stack(10);

        st.Push(15);
        st.Push(7);
        st.Push(20);
        st.Pop();
        st.Pop();
        st.Pop();
        st.Pop();
        st.Push(15);
        st.Push(7);
        st.Push(20);
        st.Push(15);
        st.Push(7);
        st.Push(20);
        st.Push(15);
        st.Push(7);
        st.Push(20);
        st.Push(15);
        st.Push(7);
        st.Push(20);
        System.out.println(st.Peek());
        st.Display();
        System.out.println(st.IsEmpty());
        System.out.println(st.IsFull());
    }
}
