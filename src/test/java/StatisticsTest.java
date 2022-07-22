import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class StatisticsTest {

    private static Statistics st;
    private static double[] expectedMedians;
    private static double[] expectedMeans;
    private static int[][] inputs;

    @BeforeAll
    static void setup() throws Exception {
        st = new Statistics();
        expectedMedians = new double[]{2.5,2,1.5};
        expectedMeans = new double[]{2.5,2,1.5};
        inputs = new int[][]{{1,2,3,4}, {1,2,3}, {1,2}};
    }

    @Test
    void medianTest(){
        for(int i = 0; i < expectedMedians.length; i++) {
            double median = st.getMedian(inputs[i]);
            assertEquals(expectedMedians[i], median, 0.001);
        }
    }

    @Test
    void meanTest(){
        for(int i = 0; i < expectedMeans.length; i++) {
            double mean = st.getMean(inputs[i]);
            assertEquals(expectedMeans[i], mean, 0.001);
        }
    }

}
