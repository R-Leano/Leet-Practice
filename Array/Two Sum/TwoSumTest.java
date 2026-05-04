import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import.java.util.List;
import static com.google.common.truth.Truth.assertThat;

/**
 * TwoSum.java
 * 
 * Given an array of integers nums and an integer target, 
 * return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, 
 * and you may not use the same element twice.
 * You can return the answer in any order.
 * 
 * Case 1
 * nums = [2, 7, 11, 15]
 * target = 9
 */

public class TwoSumTest {
    
    @Test 
    public void testSimpleSum() {
        ArrayList simple = new ArrayList<>();
        int target = 9;

        simple = [2, 7];
        asertThat(simple.TwoSum()).isExactly(9);
        
    }
}
