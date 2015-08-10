package example;

import java.util.ArrayList;
import java.util.List;

public class Location {

	private static List<String> locations = new ArrayList<String>();
	
	protected static void initList(){
		locations.add("臺北巿大安運動中心");
		locations.add("臺北巿中正運動中心");
		locations.add("臺北巿北投運動中心");
		locations.add("臺北巿萬華運動中心");
		locations.add("臺北巿士林運動中心");
	}
	
	public static List<String> getLocations() {
		if (locations.size() == 0){
			initList();
		}
		return locations;
	}


	
}
