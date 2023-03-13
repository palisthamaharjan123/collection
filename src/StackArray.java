import java.util.Scanner;

public class StackArray {
    static int MAX=100;
    static int stack[]=new int[MAX];
    static int top=-1;
    public void push(){
        System.out.println("enter the value you want to enter:");
        Scanner s=new Scanner(System.in);
        int val=s.nextInt();
        String result=" ";
        if(top==MAX-1){
            System.out.println("operation failed");
        }else{
            top++;
            stack[top]=val;
            System.out.println("pushed into the stack");
        }
    }
    public void pop(){
        if(top==-1){
            System.out.println("the stack is empty");
        }else{
            int temp=stack[top];
            stack[top]=0;
            top--;
            System.out.println("the value popped sucessfully");
        }
        for(int i=0;i<=top;i++){
            System.out.println(stack[i]);
        }
    }
}
