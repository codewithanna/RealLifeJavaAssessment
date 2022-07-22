# RealLifeJavaAssessment

1. Standardising Job Titles process
Provided with a list of ideal (standardised) job titles, create a class that implements a process that returns the best match when provided with an
input string.
Concretely, given a standardised job titles list of “Architect", "Software engineer", "Quantity surveyor", and "Accountant", write a process that
returns the standardised result for the input.
input standardised
"Java engineer" > "Software engineer"
"C# engineer" > "Software engineer"
"Accountant" > "Accountant"
"Chief Accountant" > "Accountant"

Hint: internally in the process, consider a quality score q, where 0.0 <= q <= 1.0, to find the closest match.


2. Number statistics
Provided with an array of integers of variable length (int[] input), implement a process that calculates the (1) median, (2) mean, (3) mode, and (4)
range for the array and outputs these four values to the command line.
