package air_quality_and_plant;

import java.sql.SQLException;
import java.util.Scanner;

public class InsertPlant {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scanner=new Scanner(System.in);
		PlantCrud crud=new PlantCrud();
		char key='y';
		while(key=='y') {
		
		System.out.println("------------Enter plant details -------- ");
		System.out.println("Enter plant Scientific name : ");
		String sciName=scanner.nextLine();
		//String ip=scanner.next();
		System.out.println("Enter plant Common name : ");
		String commName=scanner.nextLine();
		
		System.out.println("Enter plant absorbtion commponent : ");
		String component=scanner.nextLine();
		System.out.println("Enter plant Image URl : ");
		String img=scanner.nextLine();
		System.out.println("Enter plant  Species : ");
		String species=scanner.nextLine();
		System.out.println("Enter plant air absorbtion radius : ");
		//String ip=scanner.next();
		int  radius=scanner.nextInt();
		
		System.out.println("Enter plant origin : ");
		 String ip=scanner.next();
		String origin=scanner.nextLine();
		System.out.println("Enter wikipedia link : ");
		String link=scanner.nextLine();
		System.out.println("Enter plant description : ");
		String desc=scanner.nextLine();
		
		Plant plant=new Plant(sciName, commName, desc, component, radius, img, link, origin, species);
		crud.addPLant(plant);
		
		System.out.println("Enter 'y' for continue else 'n' ");
		key=scanner.nextLine().charAt(0);
		}
	}
}
