package TennisGarden;

import java.util.ArrayList;
import java.util.List;

public class SearchTennisGarden {

	private ArrayList garden;
	public List listGardon() {
		garden = new ArrayList<String>();
		garden.add("大安羽球場");
		garden.add("內湖羽球場");
		garden.add("淡水羽球場");
		garden.add("南港羽球場");
		garden.add("新店羽球場");
		garden.add("南崁羽球場");
		garden.add("新竹羽球場");
		garden.add("苗栗羽球場");
		garden.add("台中羽球場");
		garden.add("彰化羽球場");
		return garden;
	}

}
