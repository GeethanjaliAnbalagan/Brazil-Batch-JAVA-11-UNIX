package com.java.Comparator;

//A Java program to demonstrate Comparator interface
import java.io.*;
import java.util.*;

//A class 'Movie' that implements Comparable
class Movie implements Comparable<Movie>
{
	private double rating;
	private String name;
	private int year;

	// Used to sort movies by year
	public int compareTo(Movie m)
	{
		return this.year - m.year;
	}

	// Constructor
	public Movie(String nm, double rt, int yr)
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
class RatingCompare implements Comparator<Movie>
{
	public int compare(Movie m1, Movie m2)
	{
		if (m1.getRating() < m2.getRating()) return -1;
		if (m1.getRating() > m2.getRating()) return 1;
		else return 0;
	}
}

//Class to compare Movies by name
class NameCompare implements Comparator<Movie>
{
	public int compare(Movie m1, Movie m2)
	{
		return m1.getName().compareTo(m2.getName());
	}
}

