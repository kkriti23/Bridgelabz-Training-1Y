public class Demo{
static int x=6 ;
int y=6;

public static void m1(){
    int z = 3;
	int s = 6;
	System.out.println(z);
	System.out.println(s);
	System.out.println(x);
	}
	
void m2() {
    int w = 4;
	int k=  8;
	System.out.println(w);
	System.out.println(k);
	Demo obj = new Demo ();
    System.out.println(obj.y);
	}
	
public static void main(String[] args){
     int x =16;
	 System.out.println(x);
	 
	 Demo obj = new Demo();
	 System.out.println(obj.y);
	 obj.y=8;
	 System.out.println(obj.y);
	 
	 Demo obj1 = new Demo ();
	 obj1.m2();
	 
	 m1();
	 
	 System.out.println(args[0]+args[1]);
 	 System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));

	 }
}