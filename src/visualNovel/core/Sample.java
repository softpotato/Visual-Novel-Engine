package visualNovel.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * This class serves as the brief description of the novel in the server. 
 * 
 * @author Soft Potato
 *
 */
public class Sample {
	
	/**
	 * A private internal class for the rating system in the novel. Ratings are only seem in the
	 * shop window, so this is the best place to put it.
	 * 
	 * <p>
	 * 
	 * Another note, this class will emulate a Linked-list in a way. I don't know why I want to do
	 * it like that, but it seems more natural to make it a linked-list because you usually scroll
	 * down through the list, and you just load one after another as you go further and further.
	 * 
	 * @author Soft Potato
	 *
	 */
	private class Rating implements Serializable, Iterable {
		
		/**
		 * An iterator class for the Internal Rating Class. This is a little messy, but mostly
		 * using it to make it easy to just use the for-each when loading the page. I think this
		 * is unnecessary, but meh.
		 * 
		 * @author Soft Pretzel
		 *
		 */
		private class RatingIterator implements Iterator {
			Rating pointer;
			
			/**
			 * TODO: Check If I implemented this right.
			 * 
			 * This is the no-args constructor that initializes the pointer to point at the
			 * root of the basic linked-list
			 */
			public RatingIterator() {
				pointer = Sample.Rating.this.root;
			}
			
			@Override
			public boolean hasNext() {
				return pointer != null;
			}

			/**
			 * This method iterators over the whole list and returns the whole Rating class linked
			 * -list
			 */
			@Override
			public Object next() {
				if (hasNext()) {
					Rating temp = pointer;
					pointer = pointer.next;
					return temp;
				}
				
				// Hopefully did this
				throw new NoSuchElementException();
			}
			
		}
		
		private Rating next;						// The next Rating node
		private String commentator;					// Commenter's name
		private String[] comment = new String[500];	// The comment. It can only be 500 character
													// because I want to save space and not get
													// spams. Class Invariant
		private Rating root;						// root node of the ratings
		
		
		/**
		 * This method returns the iterator class of this class
		 */
		@Override
		public Iterator iterator() {
			return new RatingIterator();
		}
		
	}
	
	/*
	 * Note: The book only has KEYWORDS, like every part of the words in the titles and such are
	 * key words that the user can use to search, so they can type part of the title
	 */
	private String id;					// ID of the book
	private String[] title;				// title of the book
	private String[] description;		// Description of the book
	private String[] author;			// The author's name broken up to keywords
	private double avgRating;			// A cumulative sum of all the ratings
	private double cost;				// Maybe let the author sell their novel?!?! Idk if I
										// should implement a payment system because I don't like
										// paying for stuff and it's difficult to do, but 
										// put a note on it. TODO: implement payment system
	private ArrayList<Rating> ratings;	// A list of the ratings of the book
	
	/**
	 * A useless constuctor that needs to be rethought for later, because I am too lazy and bored
	 * right now.
	 * 
	 * @param id
	 * @param title
	 * @param description
	 * @param author
	 * @param avgRating
	 * @param cost
	 */
	public Sample(String id,String[] title,String[] description,String[] author,double avgRating
			,double cost) {
		this.title = title;
		this.description = description;
		this.author = author;
		this.avgRating = avgRating;
		this.cost = cost;
	}
	
	public Sample() {
		
	}
}
