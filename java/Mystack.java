public class Mystack {
    static int max=100;
    int arr[]=new int[max];
    int top;
    boolean isEmpty()
    {
        return(top<0);

    }
    Mystack()
    {
     top=-1;
    }
       boolean push(int x) {
           if (top >= (max - 1)) {
               System.out.println("Stack overflow");
               return false;
           } else {
               arr[++top] = x;
               System.out.println(x + "pushed");
               return true;
           }
       }
       int pop(){
        if (top<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            int x=arr[top--];
            return x;
        }
       }
       int peek(){
        if (top<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else {
            int x=arr[top];
            return x;
        }
       }
       void print(){
        for (int i=top;i>-1;i--)
            System.out.println(arr[i]);
       }

    public static void main(String[] args) {
        Mystack s=new Mystack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.top+"popped element");
        System.out.println("Element at top"+s.peek());
        System.out.println("total elements");
        s.print();
}

    }

