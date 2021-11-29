package com.java.ApachePOIText;
//Using FileUtils.readLines(File, Charset) method
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.apache.commons.io.FileUtils;

public class POITextFile {
	public static void main(String[] args) {
		File file = new File("D:\\demo.txt");

		try {
			List<String> lines = FileUtils.readLines(file, StandardCharsets.UTF_8);
			// lines.forEach(System.out::println);
			for (String str : lines) {
				System.out.println(str);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}