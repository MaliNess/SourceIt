package hw8;

import java.io.File;

public class FindFile {

	public static int countByTypeRecursivly(File dir, String type) {
		int counter = 0;
		for (File file : dir.listFiles()) {
			if (file.isFile() && file.getName().endsWith(type))
				counter++;
			else if (file.isDirectory()) {
				counter += countByTypeRecursivly(file, type);
			}
		}
		return counter;
	}

	public static String findByTypeJavaWithDepth(File dir, int depth) {
		int currentDepth = 0;
		StringBuilder sb = new StringBuilder();
		for (File file : dir.listFiles()) {
			if (file.isFile() && file.getName().endsWith("java"))
				sb.append(file.getName() + " ");
			else if (file.isDirectory()) {
				currentDepth++;
				if (currentDepth <= depth)
					sb.append(findByTypeJavaWithDepth(file, depth - currentDepth));
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File test = new File("test");
		String type = ".docx";
		int res;
		String result;
		if (test.exists()) {
			res = countByTypeRecursivly(test, type);
			result = findByTypeJavaWithDepth(test, 1);
		}

		else {
			res = 0;
			result = null;
		}
		if (res != 0)
			System.out.println(res + " file(s) whith type " + type + " was(were) found in catalogue '" + test + "'.");
		else
			System.out.println("No files with type " + type + " were found in catalogue '" + test + "'!");
		if (!result.equals(""))
			System.out.println("File name(s) with type '.java': " + result + "." + "");
		else
			System.out.println("No files were found!");
	}

}
