

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchTennisGarden {

	private ArrayList garden;
	public List listGardon() {
		garden = new ArrayList<String>();
		garden.add("1.大安羽球場");
		garden.add("2.內湖羽球場");
		garden.add("3.淡水羽球場");
		garden.add("4.南港羽球場");
		garden.add("5.新店羽球場");
		garden.add("6.南崁羽球場");
		garden.add("7.新竹羽球場");
		garden.add("8.苗栗羽球場");
		garden.add("9.台中羽球場");
		garden.add("10.彰化羽球場");
		return garden;
	}
	
	public String toString() {
		String location = "";
		for (int j = 0; j < garden.size(); j ++) {
			location += this.listGardon().get(j)+" ";
		}
		return location;
	}
	
	public static void main(String args[]){
		System.out.println("請從下列選取一個場地：");
		System.out.println(new SearchTennisGarden().listGardon().toString());
		Scanner scanner=new Scanner(System.in);
		System.out.println("請選取一個場地：");
		int input=scanner.nextInt();
		System.out.print("你選取的場地為：\n");
		System.out.print(new SearchTennisGarden().listGardon().get(input-1));
	}
}
