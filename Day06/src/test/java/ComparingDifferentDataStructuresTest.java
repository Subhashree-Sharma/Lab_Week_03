import org.example.com.ComparingDifferentDataStructures.HashSetSearch;
import org.example.com.ComparingDifferentDataStructures.ArraySearch;
import org.example.com.ComparingDifferentDataStructures.TreeSetSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class ComparingDifferentDataStructuresTest {

    //ArraySearch Testing
    @Test
    public void ArraySearchTest(){
        boolean result = ArraySearch.searchInArray(new int[]{1,2,3,4}, 3);
        boolean expected = true;
        Assertions.assertEquals(expected, result, "Searching in array - Test case failed");
    }

    //HashSet searching testing
    @Test
    public void HashSetSearchTest(){

        boolean result = HashSetSearch.searchInHashSet(new HashSet<>(Arrays.asList(1, 2, 3, 4, 5)), 4);
        boolean expected = true;
        Assertions.assertEquals(expected, result, "Searching in Hashset - Test case failed");
    }

    //TreeSetSearch Testing
    @Test
    public void TreeSetSearchTest(){

        boolean result = TreeSetSearch.searchInTreeSet(new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5)), 4);
        boolean expected = true;
        Assertions.assertEquals(expected, result, "Searching in Hashset - Test case failed");
    }
}
