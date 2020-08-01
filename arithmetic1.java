/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2;

import java.util.Scanner;

/**
 *
 * @author rakesh
 */
class arithmetic {
    int a,b,c;  
    void getvalue()
    {
    System.out.println("ENTER THE VALUES OF A AND B");
    Scanner in= new Scanner(System.in);
    a=in.nextInt();
    b=in.nextInt();
    }
    void add()
    {
    c=a+b;
    System.out.println("addition is done:a+b="+c);
    }
    void sub()
    {
    c=a-b;
    System.out.println("subraction is done:a-b="+c);
    }
    void mul()
    {
    c=a*b;
    System.out.println("multiplication is done:a*b="+c);
    }
    void div()
    {
    c=a/b;
    System.out.println("division is done:a/b="+c);
    }
 }
public class arithmetic1{
public static void main(String[]args)
{ 
    arithmetic obj=new arithmetic();
    obj.getvalue();
    obj.add();
    obj.sub();
    obj.mul();
    obj.div();
    
}

}
