package com.SocialMediaFriendConnections;

//main class
public class SocialMediaFriendConnections {
    public static void main(String[] args) {
        SocialMediaFriends smf = new SocialMediaFriends();

        smf.addUser(1, "Subhashree Sharma", 25);
        smf.addUser(2, "Diksha Sharma", 30);
        smf.addUser(3, "Riya Dwivedi", 20);

        smf.addFriendConnection(1, 2);
        smf.addFriendConnection(1, 3);

        System.out.println("Displaying all friends:");
        smf.displayFriends(1);
        smf.displayFriends(2);

        System.out.println("\nMutual friends between 1 and 2:");
        smf.findMutualFriends(1, 2);

        System.out.println("\nRemoving friend connection between 1 and 2:");
        smf.removeFriendConnection(1, 2);

        System.out.println("Displaying all friends after removal:");
        smf.displayFriends(1);
        smf.displayFriends(2);

        System.out.println("\nCounting friends for each user:");
        smf.countFriends();

        System.out.println("\nSearching for user by ID or Name:");
        smf.searchUser("Diksha Sharma");
        smf.searchUser("3");
    }
}
