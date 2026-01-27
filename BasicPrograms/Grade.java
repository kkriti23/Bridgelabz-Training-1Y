import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Physics : ");
        int phy = sc.nextInt();
        System.out.println("Chemistry : ");
        int chem = sc.nextInt();
        System.out.println("maths : ");
        int maths = sc.nextInt();
        int avg = (phy + maths + chem)/3;
        System.out.println("Average : "+avg);
        if(avg>79){
            System.out.println("Grade: "+avg+"%");
            System.out.println("Level 4, above agency-normalized standards");
        }else if(avg<80 && avg>69){
            System.out.println("Grade: "+avg+"%");
            System.out.println("Level 3, at agency-normalized standards");
        }else if(avg<70 && avg>59){
            System.out.println("Grade: "+avg+"%");
            System.out.println("Level 2, below, but approaching agency-normalized standards");
        }else if(avg<60 && avg>49){
            System.out.println("Grade: "+avg+"%");
            System.out.println("Level 1, well below agency-normalized standards");
        }else if(avg<50 && avg >39){
            System.out.println("Grade: "+avg+"%");
            System.out.println("Level -1, too below agency-normalized standards");
        }else{
            System.out.println("Grade: "+avg+"%");
            System.out.println("remidial standards");
        }
    }
}
