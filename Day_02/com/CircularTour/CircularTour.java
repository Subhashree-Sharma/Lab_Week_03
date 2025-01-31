package com.CircularTour;
//circular tour class
public class CircularTour {
        public static int findStartingPoint(int[] petrol, int[] distance) {
            int n = petrol.length;
            // Total petrol - total distance
            int totalSurplus = 0;
            // Current surplus in journey
            int surplus = 0;
            // Candidate starting index
            int startIndex = 0;

            for (int i = 0; i < n; i++) {
                totalSurplus += petrol[i] - distance[i];
                surplus += petrol[i] - distance[i];

                // If surplus is negative, we can't start from startIndex to i
                if (surplus < 0) {
                    // Try next station as start
                    startIndex = i + 1;
                    // Reset surplus
                    surplus = 0;
                }
            }

            // Valid start or no solution
            return (totalSurplus >= 0) ? startIndex : -1;
        }
    }

