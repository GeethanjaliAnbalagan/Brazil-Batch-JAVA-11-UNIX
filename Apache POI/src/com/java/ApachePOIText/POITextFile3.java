package com.java.ApachePOIText;

//How do I write a String to a File using Commons IO?
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class POITextFile3 {

	public static void main(String[] args) throws IOException {
		String string = "This is\n a test file Guys";
		File file = new File("D:\\test.txt");
		FileUtils.writeStringToFile(file, string);
	}
}