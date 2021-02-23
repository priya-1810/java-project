package project;
import java.util.*;

interface getable
{  
void getinfo();  
}
interface printable
{  
void display();  
}
class Details implements getable,printable
{
   
 
       public
     Scanner op=new Scanner(System.in);

     int n=op.nextInt();

 


    int[] roll_no=new int[n];
    String[] name=new String[n];
String[] dept=new String[n];
int[] m1=new int[n];
int[] m2=new int[n];
int[] m3=new int[n];
int[] m4=new int[n];
int[] m5=new int[n];




    public void getinfo()
    {

        for(int i=0;i<n;i++)
        {
            Scanner ip=new Scanner(System.in);
            System.out.println("Enter your name:");
            name[i]=ip.nextLine();
            System.out.println("Enter your roll_no:");
            roll_no[i]=ip.nextInt();
            System.out.println("Enter your department");
            dept[i]=ip.next();
            System.out.println("Enter your Java mark:");
            m1[i]=ip.nextInt();
            System.out.println("Enter your C mark:");
            m2[i]=ip.nextInt();
            System.out.println("Enter your CA mark:");
            m3[i]=ip.nextInt();
            System.out.println("Enter your Python mark:");
            m4[i]=ip.nextInt();
            System.out.println("Enter your ECS mark:");
            m5[i]=ip.nextInt();

        }
    }
    public void display()
    {
        System.out.println("\n           *****************STUDENT DETAILS*****************");
        System.out.println("NAME\tROLLNO\tDEPARTMENT\tJAVA MARK\tC MARK     CA MARK\t PYTHON MARK\t ECS MARK");
        for(int i=0;i<n;i++)
        {
            System.out.println(name[i]+"\t"+roll_no[i]+"\t"+dept[i]+"\t\t"+m1[i]+"\t\t"+m2[i]+"\t\t"+m3[i]+"\t\t"+m4[i]+"\t\t"+m5[i]);
        }
       
    }
}

 


class Cgpa extends Details

{

int a,b,c,d,e;


public Cgpa(int c1 , int c2, int c3, int c4, int c5)
{
a =c1;
b =c2;
c = c3;
d = c4;
e = c5;
}

int[] cgpa=new int[n];
public void calculate()
{
    System.out.println("CGPA OF STUDENTS");
         for(int i=0;i<n;i++)
{

  cgpa[i]=(m1[i]/10)*a+(m2[i]/10)*b+(m3[i]/10)*c+(m4[i]/10)*d+(m5[i]/10)*e;
          cgpa[i]=cgpa[i]/(a+b+c+d+e);
System.out.println(name[i]+" = "+cgpa[i]);

}







}
}

public class Student 
{
public void print(){

System.out.println("            *************PROJECT ENDS***************");
}


   public static void main(String[] args)
{
 

        System.out.println("Enter no of students");
        Cgpa obj=new Cgpa(4,3,3,3,3);
        obj.getinfo();
       

     
        obj.display();
        obj.calculate();

   
     
}
     
       
}

