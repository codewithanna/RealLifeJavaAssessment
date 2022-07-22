import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
    	// JOB STANDARDIZER
        JobStandardizer js = new JobStandardizer();
        						
        System.out.println(js.standardize("Java Engineer"));
        System.out.println(js.standardize("C# engineer"));
        System.out.println(js.standardize("Accountant"));
        System.out.println(js.standardize("Chief Accountant"));
        System.out.println(js.standardize("Garden Architect"));
        System.out.println(js.standardize("Engineer java"));
        System.out.println(js.standardize("enginer"));
        System.out.println(" ");
        
        
    	// JOB STANDARDIZER BY CHAR
        StandardizerByChar sbc = new StandardizerByChar();
        					
        System.out.println(sbc.standardize("Java Engineer"));
        System.out.println(sbc.standardize("C# engineer"));
        System.out.println(sbc.standardize("Accountant"));
        System.out.println(sbc.standardize("Chief Accountant"));
        System.out.println(sbc.standardize("Garden Architect"));
        System.out.println(sbc.standardize("enginer"));

       
        // STATISTICS
        Statistics st = new Statistics();

        st.getStats(new int[] {11,2,4,1,1,2,2,5,7,15,18,5,9});

        int[] bigArray = generateSomeHugeArray(1000000);

        st.getStats(bigArray);
    }

    static int[] generateSomeHugeArray(int n){

        int[] array = new int[n];

        for(int i = 0; i < n; i++){
            array[i] = ThreadLocalRandom.current().nextInt(1, 10000 + 1);
        }

        return array;
    }

}
