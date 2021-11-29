package com.java.Demo;

import java.util.Comparator;


public class movies {

	private double rating;
	private String name;
	private int year;

	// Constructor
	public movies(String nm, double rt, int yr)
	{
		this.name = nm;
		this.rating = rt;
		this.year = yr;
	}

	// Getter methods for accessing private data
	public double getRating() { return rating; }
	public String getName() { return name; }
	public int getYear()	 { return year; }
}

//Class to compare Movies by ratings
class RatingCompare implements Comparator<movies>
{
	public int compare(movies m1, movies m2)
	{
		if (m1.getRating() < m2.getRating()) return -1;
		if (m1.getRating() > m2.getRating()) return 1;
		else return 0;
	}
}

