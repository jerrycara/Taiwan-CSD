

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchTennisGarden {

	private ArrayList garden;
	public List listGardon() {
		garden = new ArrayList<String>();
		garden.add("1.�j�w�вy��");
		garden.add("2.����вy��");
		garden.add("3.�H���вy��");
		garden.add("4.�n��вy��");
		garden.add("5.�s���вy��");
		garden.add("6.�n�r�вy��");
		garden.add("7.�s�˦вy��");
		garden.add("8.�]�ߦвy��");
		garden.add("9.�x���вy��");
		garden.add("10.���Ʀвy��");
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
		System.out.println("�бq�U�C����@�ӳ��a�G");
		System.out.println(new SearchTennisGarden().listGardon().toString());
		Scanner scanner=new Scanner(System.in);
		System.out.println("�п���@�ӳ��a�G");
		int input=scanner.nextInt();
		System.out.print("�A��������a���G\n");
		System.out.print(new SearchTennisGarden().listGardon().get(input-1));
	}
}
