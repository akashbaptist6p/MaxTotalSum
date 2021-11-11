

SOLUTION:
Logic to get the maximum path sum from top to bottom:
STEP 1: Convert the entire input in form of a matrix.
STEP 2: Add each element to its diagonally left and Diagonally right. Replace that element with maximum sum.
STEP 3: Repeat step 2, till you reach the bottom of the matrix.
STEP 4: Traverse the last row and the greatest element is the maximum sum of the path.
Logic to get the path of the maximum sum:
In Step 2, When moving to the next row, subtract the maximum value of that row with the maximum value of the previous row and store it in an array.