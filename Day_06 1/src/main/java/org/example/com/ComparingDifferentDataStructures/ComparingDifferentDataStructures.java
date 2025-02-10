package org.example.com.ComparingDifferentDataStructures;
import java.util.*;

public class ComparingDifferentDataStructures {
        public static void main(String[] args) {

            //change "N" value acc to you
            int N = 1000000;

            //element to search for
            int searchElement = N / 2;

            //generate dataset
            int[] array = new int[N];
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();

            for (int i = 0; i < N; i++) {
                array[i] = i;
                hashSet.add(i);
                treeSet.add(i);
            }

            System.out.println("Searching Performance for Dataset Size = " + N);

            //measure time for Array search - Linear
            long startTime = System.currentTimeMillis();
            boolean arrayFound = ArraySearch.searchInArray(array, searchElement);
            long endTime = System.currentTimeMillis();
            System.out.println("Array Search- Linear - Found :- " + arrayFound + ", Time :- " + (endTime - startTime) + " ms");

            //Measure time for HashSet search - O(1)
            startTime = System.currentTimeMillis();
            boolean hashSetFound = HashSetSearch.searchInHashSet(hashSet, searchElement);
            endTime = System.currentTimeMillis();
            System.out.println("HashSet Search- O(1) - Found :- " + hashSetFound + ", Time :- " + (endTime - startTime) + " ms");

            //measure time for TreeSet search - O(log N)
            startTime = System.currentTimeMillis();
            boolean treeSetFound = TreeSetSearch.searchInTreeSet(treeSet, searchElement);
            endTime = System.currentTimeMillis();
            System.out.println("TreeSet Search- O(log N) - Found :- " + treeSetFound + ", Time :- " + (endTime - startTime) + " ms");
        }
    }

