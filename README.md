# BigO
Data Structure
<br>
 <p align="center"> <a href = "https://www.geeksforgeeks.org/analysis-algorithms-big-o-analysis/"> <img src = "https://media.geeksforgeeks.org/wp-content/cdn-uploads/mypic.png"> </p> </a>

<p align="center" style="font-size:16px; color:lightgreen;"> 
BIG O - Asymptotic Notation </p>

<p align="center"> It's basically used to measure the performance i.e the time complexity or space complexity required on your code </p>
 

There are different types of Big Os 

1. O(1) -> Constant with no loops. Only one element is operated from an array, no matter how big.  
2. O(log N) - > #learning
3. O(n) -> Linear (for loops, while loops through n times ) 
4. O(n log (n)) -> #learning
5. O(n^2) -> Quadratic. When two nested loops are
6. O(2^n) -> #learning
7. O(n!) -> #learning

What causes space complexity?


1. Variables
2. Data structures
3. Functiuon call
4. Algorithm

Rules to considers. 

1. Always worst Case
2. Remove Constants
   + E.x. -> If getting O(3n+5+b) is equivalent to O(n)
4. Different inputs should have different variables: A and B 
   + for steps in order O(a + b)
   * for nested steps O(a * b)
5. Drop Non-dominant terms
   + like if BIG O(3n+n^2) is equivalent to BIG O(n^2), as n^2 is a dominant term.
</p>
