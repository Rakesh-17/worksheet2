
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
public class Q5 {
    public static void main(String[]args)
    {
        customer in=new customer(17,"rak",15);
        System.out.println(in.getid());
        System.out.println(in.getname());
        System.out.println(in.getdiscount());
        in.setdiscount(10);
        System.out.println(in.getdiscount());
        System.out.println(in);
        invoice b= new invoice(1001,"aaa",2500);
        System.out.println(b.getid());
        System.out.println(b.getcustomer());
        customer r=new customer(91,"rvb",20);
        b.setcustomer(r);
        System.out.println(in.getamount());
        b.setamount(3000);
        System.out.println(in.getcustomername());
        System.out.println(in.getamountafterdiscount());
    } 
    
}
class customer
{
    int id;
    String name;
    int discount;
    
    customer(int i,String n,int d)
    {
        id=i;
        name=n;
        discount=d;
    }
    int getid()
    {
        return id;
    }
    String getname()
    {
        return name;
    }
    int getdiscount()
    {
        return discount;
    }
    void setdiscount(int dis)
    {
        discount=dis;
    }
    @Override
    public String toString()
    {
       return "name:"+name+"\nID:"+id; 
    }
}
class invoice
{
        int id;
        customer o;
        double amount;
        invoice(int i,customer o1,double q)
        {
            id=i;
            o=o1;
            amount=q;
        }
        int getid()
        {
            return id;
        }
        customer getcustomer()
        {
        return o;
        }
        void setcustomer(customer o2)
        {
          o=o2;  
        }
        double getamount()
        {
            return amount;
        }
        void setamount(double m)
        {
            amount=m;
        }
        String getcustomername()
        {
            return o.name;
        }
        double getamountafterdiscount()
        {
            return amount=(amount*o.discount)/100;
        }
        
}
