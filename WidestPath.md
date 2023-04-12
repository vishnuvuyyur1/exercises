# exercises

There are N trees (numbered from 0 to N-1) in a forest. 
The K-th tree is located at coordinates (X[k], Y[K]). 
We want to build the widest possible vertical path, such that there is no tree on it. 
The path must be built somewhere between a leftmost and a rightmost tree, 
which means that the width of the path cannot be infinite. What is the width of the widest possible 
path that can be built? Write a function: class Solution public int solution(int [ ] X, int[] Y); 
I that, given two arrays X and Y consisting of N integers each, denoting the positions of trees, 
returns the width of the widest possible path that can be built Examples:

Given X= [1, 8, 7, 3, 4, 1, 8], Y=[6, 4, 1, 8, 5, 1, 7], the function should return 3.
Given X=[5, 5, 5, 7, 7, 7], Y=[3, 4, 5, 1, 3, 7], the function should return 2.
Given X=\6, 10, 1, 4, 3], Y=(2, 5, 3, 1, 6], the function should return 4.