# exercises
## DominosGame.java
A game of dominos consists of 28 domino tiles. Between 0 and 6 dots appear at each end of everv tile. Tiles can be reversed during the game. 
so the tile showing "2-3" can be played as "3-2". You are given a list of N unique domino tiles. Your task is to find any domino tile not on 
the list and return it in the format "X-Y" where X and Y are digits representing the number of dots on each end of the tile. Note that because 
domino tiles can be reversed tiles 2-3" and 3-2" are treated as the same tile Write a function class Solution < public String solution(String[1 A): 
that, given an array A of N strings representing unique domino tiles, returns a string representina anv tile which is not in the arrav A. 
Tiles in A are aiven in the format described above You can assume that there will alwavs exist a tile not listed in A Erampias'

Given A = ("O-0", "O-1", "2-3", "2-0") one of the possible outputs is "O-3". 
Note that "1-0" is not a valid answer, as "O-1" represents the same tile. 
Given A = (°O-0", "1-1", "2-2", "3-3", "4-4", "5-5", "6-6"), one of the possible outputs is "2-4".
Assume that: • N is an integer within the range [1..27); LACONSISIS OT • each element of A is a string in the format "X-Y In your solution, focus on correctness. 
The performance of your solution will not be the focus of the assessment

## WidestPath.java
There are N trees (numbered from 0 to N-1) in a forest. The K-th tree is located at coordinates (X[k], Y[K]). We want to build the widest possible vertical path, such that there is no tree on it. The path must be built somewhere between a leftmost and a rightmost tree, which means that the width of the path cannot be infinite. What is the width of the widest possible path that can be built? Write a function: class Solution public int solution(int [ ] X, int[] Y); I that, given two arrays X and Y consisting of N integers each, denoting the positions of trees, returns the width of the widest possible path that can be built Examples:

Given X= [1, 8, 7, 3, 4, 1, 8], Y=[6, 4, 1, 8, 5, 1, 7], the function should return 3. Given X=[5, 5, 5, 7, 7, 7], Y=[3, 4, 5, 1, 3, 7], the function should return 2. Given X=\6, 10, 1, 4, 3], Y=(2, 5, 3, 1, 6], the function should return 4.

## Pangram.java

A string is a pangram if it contains all letters of the English alphabet, ascii['a'- 'z']. Given a list of strings, determine if each one is a pangram or not. Return "1" if true and "O" if false.
Example
pangram = ['pack my box with five dozen liquor jugs', 'this is not a pangram']
the string 'pack my box with five dozen liquor jugs' is a pangram, because it contains all the letters 'a' through 'z'
the string 'this is not a pangram' is not a pangram
• Assemble a string of the two results, in order. The result is '10'.

Function Description Complete the function isPangram n the editor below. isPangram has the following parameter(s): string pangram[n]: an array of strings Returns: string: a string where each position represents the results of a test. Use '1' for true and 'O' for false.

Constraints 1 ≤ n ≤ 100 Each string pangram[i] (where 0 <i<n) is composed of lowercase letters and spaces 1<= length of panagram[i] <= 10power5

## Elevator.java

You check in at a hotel - one of the tallest buildings in the world. When taking the elevator, you realize that particular hotel has a superstition: There are no floors whose number has a '4' or '13' as part of it.
That means that hotel has no 4th floor, nor a 13th, nor a 134th, nor a 113rd - but they do have the 103rd. Therefore, first floors are numbered as 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 15, 16, and so on...
The hotel wants to build a second tower but they don't want to go through the hassle of numbering floors by hand. They want to have an algorithm that, given a "real" floor number, returns the "lucky" version and removes any floors that contain '4' or '13' as part of their numbers.
Example
Given that the real floor number 12, its "lucky" version will be 15:

## priceCheck.js

There is a shop with old-style cash registers. Rather than scanning items and pulling the price from a database, the price of each item is typed in manually. This method sometimes leads to errors. Given a list of items and their correct prices, compare the prices to those entered when each item was sold. Determine the number of errors in selling prices.
Example
products = ['eggs', 'milk', 'cheese']
productPrices = [2.89, 3.29, 5.79]
productSold = ['eggs', 'eggs', 'cheese', 'milk']
soldPrice = [2.89, 2.99, 5.97, 3.29].

## packNumbers.js
Given an array of integers, write a method that will pack neighbouring numbers that are the same into the string X:N, where X is the integer value and N is the sequence length.For example, this
packNumbers([5, 5, 5, 7, 7, 3, 4, 7])
should return ['5:3', '7:2, 3, 4, 7]
