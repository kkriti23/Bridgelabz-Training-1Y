public class OperatorsAndLoops{
public static void main(String[] args){
	int i = 0;
	System.out.println("val "+ i);   //0
	i++;
	System.out.println("val1 "+ i++);   //1
	System.out.println("val2 "+ i);     //2
	++i;
	System.out.println("val3 "+ i++);   //3
	System.out.println("val4 "+ i);
	
	
	for(int k=0;k<10;k++){
		System.out.println("k: "+k);
	}
	int j=10;
	while(j>0){
		System.out.println("j: "+j);
		j--;
	}
	int a=10;
	do{
		System.out.println("a: "+a);
		a--;
	}while(a>0);
}
}