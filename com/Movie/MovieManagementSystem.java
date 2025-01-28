package com.Movie;

public class MovieManagementSystem {
        //main class
        public static void main(String[] args) {

            //create object of moviemanagement to perform task
            MovieManagement mms = new MovieManagement();

            //Call the method to add the values to the start, end and at specific position
            mms.addAtEnd("The Life of pie", "Subhashree Sharma", 2010, 8.8);
            mms.addAtBeginning("Anabelle", "tiwari ji", 1999,8);
            mms.addAtPosition(1, "Kanchana", "mishra jii", 2014, 8.6);

            //call the method to display the linkedlist in forward direction
            System.out.println("Movies in forward order:");
            mms.displayForward();

            //call the method to display the linkedlist in reverse direction
            System.out.println("\nMovies in reverse order:");
            mms.displayReverse();

            //call the method to search by rating and director name
            System.out.println("\nSearching for movies by director Christopher Nolan:");
            mms.searchByDirectorOrRating("Christopher Nolan", 0);

            //call the method to update the value of movie node
            System.out.println("\nUpdating rating of 'Inception' to 9.0:");
            mms.updateRating("Inception", 9.0);

            //call the method to remove the node from the linkedlist
            System.out.println("\nRemoving 'The Matrix':");
            mms.removeByTitle("The Matrix");

            //call the method to display the value of linkedlist in forware direction after removal
            System.out.println("\nMovies in forward order after removal:");
            mms.displayForward();
        }
}