package example;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Iterator<String> iter = Location.getLocations().iterator();
		System.out.println("目前系統可用場地如下:");
		int locationNum = 0;
		while(iter.hasNext()){
			System.out.println(locationNum++ + ":" + iter.next());
		}
		
	}

}
