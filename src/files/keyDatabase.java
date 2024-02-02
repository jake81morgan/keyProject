package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class keyDatabase {

	ArrayList<key> keys;
	
	public void initDatabase() {
			this.keys = new ArrayList<key>();
	}
	
	public void loadData(String fileName) {
		
		
		try {
			File file = new File(fileName);
			Scanner scan = new Scanner(file);
			while(scan.hasNext()) {
				
				key id = new key();
				String data = scan.nextLine();
				String[] info = new String[6];
				info = data.split(",");
				if(info.length > 1) {
					id.setStock_number(info[0]);
					id.setYear(info[1]);;
					id.setMake(info[2]);
					id.setModel(info[3]);
					id.setDate(info[4]);
					if(info.length > 5) {
						id.setPerson(info[5]);
					}
					System.out.println(id);
				}
			}
			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found...");
			e.printStackTrace();
		}
	
		
	}
	
}
