package files;

public class Main {

	public static void main(String[] args) {
		
		keyDatabase bmw = new keyDatabase();
		bmw.initDatabase();
		bmw.loadData("C:\\Users\\jake8\\OneDrive - University of Missouri\\Classes\\ObjOriented\\Repositories\\keyProject\\src\\files\\test.txt");
		System.out.println("Hello and welcome");
		
		keyGUI test = new keyGUI();

	}

}
