import java.util.Arrays;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ThreadLocalRandom;

public class Statistics {

    public double getMedian(int[] input){
        double median = 0;

        if(input.length%2!=0){
            median = input[input.length/2];
        }
        else {
            median =  (input[input.length/2 - 1] + input[input.length/2])/2.0;
        }

        return median;
    }
    
    public double getMean(int[] input) {
        return Arrays.stream(input).average().getAsDouble();
    }

    public void getStats(int[] input){

        Arrays.sort(input);

        HashMap<Integer,Integer> counts = new HashMap<Integer,Integer>();

        int min = input[0];
        int max = input[input.length-1];
        int range = max - min;

        double mean = getMean(input);
        double median = getMedian(input);


        for(int x : input){
            if(counts.containsKey(x)){
               int v = counts.get(x);
               counts.put(x,v + 1);
            }
            else {
                counts.put(x,1);
            }
        }


        int maxCount = 0;
        int mode = 0;

        for(int k : counts.keySet()){
            if(counts.get(k) > maxCount){
                maxCount = counts.get(k);
                mode = k;
            }
        }

        System.out.println(String.format("median: %.2f, mean: %.2f, mode: %d, range: %d",median,mean,mode,range));
    }

}
