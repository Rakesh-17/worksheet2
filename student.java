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
class student1{
    int m1;
    int m2;
    int m3;
    String name;
    String dept;
    String status;
    int avg;
    void getdata()
    {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the marks,name,dept");
    m1 =in.nextInt();
    m2 =in.nextInt();
    m3 =in.nextInt();
    name=in.next();
    dept=in.next();
    }
    void Markcal()
    {
     avg=(m1+m2+m3)/3;
     System.out.println("average="+avg);
     System.out.println("Status calculation:");
     if((m1>40)&&(m2>40)&&(m3>40))
     {
     status="pass";
     System.out.println(status);
     }
     else
     {
         status="fail";
         System.out.println(status);
         
     }
     System.out.println("Grade calculation:");
     if(avg>90&&avg<=100)
         System.out.println("o grade");
    if(avg>90&&avg<=100)
         System.out.println("a+ grade");
     if(avg>80&&avg<=90)
         System.out.println("a grade");
     if(avg>70&&avg<=80)
         System.out.println("b+ grade");
     if(avg>60&&avg<=70)
         System.out.println("b grade");
     if(avg>50&&avg<=60)
         System.out.println("c+ grade");
     if(avg>=40&&avg<=50)
         System.out.println("c grade");
     if(avg<40)
         System.out.println("RA ");
    }
    void display()
    {
        System.out.println("student name:"+name);
        System.out.println("student Department:"+dept);
        
    }
}
public class student{
public static void main(String[]args)
{ 
    int i;
    student1 obj=new student1();
    for(i=0;i<10;i++)
    {
    obj.getdata();
    obj.Markcal();
    obj.display();
    
    }
}
}
