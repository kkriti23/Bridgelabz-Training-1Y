public class VolumeOfEarth{
public static void main(String[] args){
	float radius = 6378;
	double volume_km = (4/3)*(3.14)*radius*radius*radius;
	double volume_miles = volume_km * 1.8;
	System.out.println("The volume of earth in cubic kilometers is "+volume_km+" and cubic miles is "+volume_miles);
}
}