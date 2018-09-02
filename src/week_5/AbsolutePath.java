package week_5;

public class AbsolutePath {
	
	public static String ensureAbsolute(String path) {
		if (path.startsWith("/")) {
			return path;
		} else {
			return System.getProperty("user.dir") + "/" + path;
		}
	}
	
	public static String[] absoluteSplitPath(String s) {
		String[] components = SplitPathName.splitPath(s);
		components[0] = ensureAbsolute(components[0]);
		return components;
	}
}
