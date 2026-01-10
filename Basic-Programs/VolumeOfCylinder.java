import java.util.Scanner;
public class VolumeOfCylinder{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter Radius : ");
int radius = scanner.nextInt();
System.out.print("Enter Height : ");
int height = scanner.nextInt();
float Volume = (22/7)*(radius*radius)*height;
System.out.println("Volume of Cylinder : " + Volume);
}
}