package week_5;

public class SplitPathName {
	
	public static String[] splitPath(String s) {
		String[] components = new String[4];
		
		// Directory:
		if (s.lastIndexOf("/") == -1) {
			components[0] = "";
			components[1] = s;
		} else {
			components[0]  = s.substring(0, s.lastIndexOf("/") + 1);
			components[1] = components[1] = s.substring(s.lastIndexOf("/") + 1);
		}

		// Filename:
		if (s.lastIndexOf(".") == -1) {
			components[2] = components[1];
			components[3] = "";
		} else {
			components[2] = s.substring(s.lastIndexOf("/") + 1, s.indexOf("." ));
			components[3] = s.substring(s.indexOf("."));
		}
		
		return components;
	}
	
	public static void main(String[] args) {
		for (String arg : args) {
			String[] components = splitPath(arg);
			System.out.printf("File: %s Type: %s [%s]\n", components[1], components[3], components[0]);
		}
	}
}
