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
public class box2 {
    double height;
    double width;
    double depth;
    void getvalue()
    {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the values");
    height =in.nextDouble();
    width =in.nextDouble();
    depth =in.nextDouble();
    }
    void volume()
    {
     double vol=height*width*depth;
     System.out.println("volume="+vol);
    }
}
public class boxx1{
public static void main(String[]args)
{ 
    box2 obj=new box2();
    obj.getvalue();
    obj.volume();
    
}

    
}
