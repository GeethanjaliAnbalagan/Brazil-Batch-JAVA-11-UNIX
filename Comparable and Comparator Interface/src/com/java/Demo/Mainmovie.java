package com.java.Demo;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;

import java.util.*;
public class Mainmovie
{
public static void main(String[] args)
		{
			ArrayList<movies> list = new ArrayList<movies>();
			list.add(new movies("Force Awakens", 8.3, 2015));
			list.add(new movies("Star Wars", 8.7, 1977));
			list.add(new movies("Empire Strikes Back", 8.8, 1980));
			list.add(new movies("Return of the Jedi", 8.4, 1983));

			// Sort by rating : (1) Create an object of ratingCompare
			//				 (2) Call Collections.sort
			//				 (3) Print Sorted list
			System.out.println("Sorted by rating");
			RatingCompare ratingCompare = new RatingCompare();
			Collections.sort(list, ratingCompare);
			for (movies movies: list)
				System.out.println(movies.getRating() + " " +
								movies.getName() + " " +
								movies.getYear());


			
		}
	}


