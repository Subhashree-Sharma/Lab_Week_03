package com.StudentRecordManagement;

public class StudentRecordManagement {
    public static void main(String[] args) {
        StudentRecord records = new StudentRecord();

        //adding some student records
        records.addAtBeginning(34, "Subhashree", 20, 'A');
        records.addAtEnd(23, "Diksha", 21, 'B');
        records.addAtPosition(3, 22,"Riya",16,'C');

        //display all records
        System.out.println("All Student Records:");
        records.displayAll();

        //search for a student
        System.out.println("\nSearching for Roll Number 2:");
        records.searchByRollNumber(2);

        //Update a student's grade
        System.out.println("\nUpdating grade for Roll Number 1:");
        records.updateGrade(1, 'A');

        //delete a student
        System.out.println("\nDeleting Roll Number 3:");
        records.deleteByRollNumber(3);

        //display all records again
        System.out.println("\nAll Student Records after deletion:");
        records.displayAll();
    }
}