

public class StandardizerByChar {
    private String[] jobTitles;
	private String[] jobTitleArray;
	private String input;

    public StandardizerByChar()
    {
        jobTitles = new String[]{ "Architect", "Software engineer", "Quantity surveyor", "Accountant" };

    }


    
    public String standardize(String in){
    	
        input = in.toLowerCase();
        String[] inputArray = input.split(" ");
    	double max = 0;
        String maxJobTile = jobTitles[0];
        int shorter = 0;

        for (String j : jobTitles){
        	int count = 0;

            String standardized = j.toLowerCase();
            jobTitleArray = standardized.split(" ");

            for (int i = 0; i < inputArray.length; i++) {
            	
                for(int k = 0; k < jobTitleArray.length ; k++){
                	
                    shorter = inputArray[i].length() < jobTitleArray[k].length() ? inputArray[i].length() : jobTitleArray[k].length();

                	for (int l = 0; l < shorter; l++) {
                            if(inputArray[i].charAt(l) == jobTitleArray[k].charAt(l)){
                                count++;
                            }
                }
            	}
            }
            
            double q = count/((double)shorter);

            if(q > max){
                max = q;
                maxJobTile = j;
            }
            
            }
		return maxJobTile;
        }
}
