import org.example.com.SearchATargetInLargeDataset.SearchATargetInLargeDataset;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class SearchATargetInLargeDatasetTest {

    //linearSearch Testing
    @Test
    public void linearSearchTest(){

        int result = SearchATargetInLargeDataset.linearSearch(new int[]{1,2,3,4}, 3);
        boolean status = (result == 2);

        Assertions.assertEquals(true, status, "Test case failed - linear search");
      }

      //BinarySearch Testing
      @Test
      public void binarySearchTest(){

        int result = SearchATargetInLargeDataset.binarySearch(new int[]{1,2,3,4}, 4);
        int expected = 3;
        Assertions.assertEquals(expected,result,"Test case failed - Binary search");
      }
    }

