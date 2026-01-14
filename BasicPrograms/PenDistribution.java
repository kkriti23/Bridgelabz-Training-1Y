public class PenDistribution{
public static void main(String[] args){
	int total_pen = 14;
	int total_students = 3;
	int remaining_pen = total_pen % total_students;
	int pen_each = total_pen / total_students;
	System.out.println("The pen per student is "+pen_each+" and the remaining pen not distributed is "+remaining_pen);
}
}