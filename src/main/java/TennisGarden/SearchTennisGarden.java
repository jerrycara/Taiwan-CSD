package TennisGarden;

import java.util.ArrayList;
import java.util.List;

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
}
