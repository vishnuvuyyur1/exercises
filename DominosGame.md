# exercises

A game of dominos consists of 28 domino tiles. Between 0 and 6 dots appear at each end of everv tile. Tiles can be reversed during the game. so the tile showing "2-3" can be played as "3-2". You are given a list of N unique domino tiles. Your task is to find any domino tile not on the list and return it in the format "X-Y" where X and Y are digits representing the number of dots on each end of the tile. Note that because domino tiles can be reversed tiles 2-3" and 3-2" are treated as the same tile Write a function class Solution < public String solution(String[1 A): that, given an array A of N strings representing unique domino tiles, returns a string representina anv tile which is not in the arrav A. Tiles in A are aiven in the format described above You can assume that there will alwavs exist a tile not listed in A Erampias'

Given A = (*O-0", "O-1", "2-3", "2-0°, one of the possible outputs is "O-3". Note that "1-0" is not a valid answer, as "O-1" represents the same tile. Given A = (°O-0", "1-1", "2-2", "3-3", "4-4", "5-5", "6-6", one of the possible outputs is "2-4". Assume that: • N is an integer within the range [1..27); LACONSISIS OT • each element of A is a string in the format "X-Y In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment


Function Description Complete the function isPangram n the editor below.
isPangram has the following parameter(s):
string pangram[n]: an array of strings 
Returns:
string: a string where each position represents the results of a test. Use '1'
for true and 'O' for false.

Constraints
1 ≤ n ≤ 100
Each string pangram[i] (where 0 <i<n) is composed of lowercase letters and spaces
1<= length of panagram[i] <= 10power5