import java.util.Arrays;
import java.util.List;

public class JobStandardizer {
	
    
	private String[] jobTitles = new String[]{ "Architect", "Software engineer", "Quantity surveyor", "Accountant" };
	private List<String> jobTitleArrayList;
    private String[] jobTitleArray;
	private String input;


    public String standardize(String in){
    	
        input = in.toLowerCase();
        String[] inputArray = input.split(" ");
    	String ret = "No result";

        for (String j : jobTitles){
            String standardized = j.toLowerCase();
            jobTitleArray = standardized.split(" ");
            jobTitleArrayList = Arrays.asList(jobTitleArray); 

            for (int i = 0; i < inputArray.length; i++) {
            	if(jobTitleArrayList.contains(inputArray[i])) {
            		ret = j;
            	}
            }
            }
		return ret;
        }
    }
