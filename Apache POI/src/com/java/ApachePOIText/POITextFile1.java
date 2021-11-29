package com.java.ApachePOIText;
//Using FileUtils.readFileToString(File, Charset) method

	import java.io.File;
	import java.io.IOException;
	import java.nio.charset.StandardCharsets;
	import org.apache.commons.io.FileUtils;
	 
	public class POITextFile1 {
	    public static void main(String[] args)
	    {
	        File file = new File("D:\\demo.txt");
	 
	        String content = null;
	        try {
	            content = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	 
	        System.out.println(content);
	    }
	}


