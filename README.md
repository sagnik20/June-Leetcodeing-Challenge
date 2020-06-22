# June-Leetcoding-Challenge
[![Maintenance](https://img.shields.io/badge/Maintained%3F-yes-green.svg)](https://github.com/sagnik20/June-Leetcoding-Challenge/graphs/commit-activity) [![Ask Me Anything !](https://img.shields.io/badge/Ask%20me-anything-1abc9c.svg)](https://GitHub.com/sagnik20/ama) [![made-for-LeetCode](https://img.shields.io/badge/Made%20for-LeetCode-1f425f.svg)](https://leetcode.com/) [![GitHub issues](https://img.shields.io/github/issues/sagnik20/June-Leetcoding-Challenge)](https://github.com/sagnik20/June-Leetcoding-Challenge/issues)
[![GitHub forks](https://img.shields.io/github/forks/sagnik20/June-Leetcoding-Challenge?style=social)](https://github.com/sagnik20/June-Leetcoding-Challenge/network) [![GitHub stars](https://img.shields.io/github/stars/sagnik20/June-Leetcoding-Challenge?style=social)](https://github.com/sagnik20/June-Leetcoding-Challenge/stargazers) [![Open Source Love svg1](https://badges.frapsoft.com/os/v1/open-source.svg?v=103)](https://github.com/ellerbrock/open-source-badges/)

I have started from 1st June in this Challenge. And this repository contains my solutions to the challenge. Only the `exact solution`. If you want to improve the solutions, Please open a `Issue first`.

## :rocket: Get Started

### Questions : 
#### Day-01 : 
**Invert Binary Tree :** 
>Invert a binary tree

**Example :**

```

Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9

Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1

```

***

#### Day-02 : 
**Delete Node in a inked List :** 
>Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

>Given linked list -- head = [4,5,1,9], which looks like following:

![](https://assets.leetcode.com/uploads/2018/12/28/237_example.png)

**Example :**

```
Input: head = [4,5,1,9], node = 5
Output: [4,1,9]
Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.
```
```
Input: head = [4,5,1,9], node = 1
Output: [4,5,9]
Explanation: You are given the third node with value 1, the linked list should become 4 -> 5 -> 9 after calling your function.
```

**Constraints :**
+ The linked list will have at least two elements.
+ All of the nodes' values will be unique.
+ The given node will not be the tail and it will always be a valid node of the linked list.
+ Do not return anything from your function.

***

#### Day-03 : 
**Two City Scheduling :** 
>There are `2N` people a company is planning to interview. The cost of flying the `i`-th person to city `A` is `costs[i][0]`, and the cost of flying the `i`-th person to city `B` is `costs[i][1]`.

>Return the minimum cost to fly every person to a city such that exactly `N` people arrive in each city.

**Example :**

```

Input: [[10,20],[30,200],[400,50],[30,20]]
Output: 110
Explanation: 
The first person goes to city A for a cost of 10.
The second person goes to city A for a cost of 30.
The third person goes to city B for a cost of 50.
The fourth person goes to city B for a cost of 20.

The total minimum cost is 10 + 30 + 50 + 20 = 110 to have half the people interviewing in each city.

```

**Constraints :**
+ `1 <= costs.length <= 100`
+ It is guaranteed that `costs.length` is even.
+ `1 <= costs[i][0], costs[i][1] <= 1000`

***

#### Day-04 : 
**Reverse String :** 
>Write a function that reverses a string. The input string is given as an array of characters `char[]`.

>Do not allocate extra space for another array, you must do this by **modifying the input array in-place with O(1)** extra memory.

**Example :**

```
Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
```
```
Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
```

***

#### Day-05 : 
**Random Pick with Weight :** 
>Given an array `w` of positive integers, where `w[i]` describes the weight of index `i`, write a function `pickIndex` which randomly picks an index in proportion to its weight.

**Example :**

```

Input:
["Solution","pickIndex"]
[[[1]],[]]
Output: [null,0]

```
```

Input: 
["Solution","pickIndex","pickIndex","pickIndex","pickIndex","pickIndex"]
[[[1,3]],[],[],[],[],[]]
Output: [null,0,1,1,1,0]

```

**Explanation of Input Syntax :**

The input is two lists: the subroutines called and their arguments. `Solution`'s constructor has one argument, the array `w`. `pickIndex` has no arguments. Arguments are always wrapped with a list, even if there aren't any.

**Constraints :**
+ `1 <= w.length <= 10000`
+ `1 <= w[i] <= 10^5`
+ `pickIndex` will be called at most `10000` times.

***

#### Day-06 : 
**Queue Reconstruction by Height :** 
>Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers `(h, k)`, where `h` is the height of the person and `k` is the number of people in front of this person who have a height greater than or equal to `h`. Write an algorithm to reconstruct the queue.

**Example :**

```

Input:
[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]

Output:
[[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]

```

**Constraints :**
+ The number of people is less than 1,100.

***

#### Day-07 : 
**Coin Change 2 :** 
>You are given coins of different denominations and a total amount of money. Write a function to compute the number of combinations that make up that amount. You may assume that you have infinite number of each kind of coin.

**Example :**

```

Input: amount = 5, coins = [1, 2, 5]
Output: 4
Explanation: there are four ways to make up the amount:
5=5
5=2+2+1
5=2+1+1+1
5=1+1+1+1+1

```
```

Input: amount = 3, coins = [2]
Output: 0
Explanation: the amount of 3 cannot be made up just with coins of 2.

```
```

Input: amount = 10, coins = [10] 
Output: 1

```

**Constraints :**
+ `0 <= amount <= 5000`
+ `1 <= coin <= 5000`
+ The number of coins is less than `500`
+ The answer is guaranteed to fit into signed 32-bit integer

***

#### Day-08 : 
**Power of Two :** 
>Given an integer, write a function to determine if it is a power of two.

**Example :**

```

Input: 1
Output: true 
Explanation: 20 = 1

```
```

Input: 16
Output: true
Explanation: 24 = 16

```
```

Input: 218
Output: false

```

***

#### Day-09 : 
**Is Subsequence :** 
>Given a string s and a string t, check if s is subsequence of t.

>A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, `"ace"` is a subsequence of `"abcde"` while `"aec"` is not).

**Example :**

```

Input: s = "abc", t = "ahbgdc"
Output: true

```
```

Input: s = "axc", t = "ahbgdc"
Output: false

```

**Constraints :**
+ `0 <= s.length <= 100`
+ `0 <= t.length <= 10^4`
+ Both strings consists only of lowercase characters.

***

#### Day-10 : 
**Search Insert Position :** 
>Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

>You may assume no duplicates in the array.

**Example :**

```

Input:[1,3,5,6], 5
Output: 2

```
```

Input: [1,3,5,6], 2
Output: 1

```
```

Input: [1,3,5,6], 7
Output: 4

```
```

Input: [1,3,5,6], 0
Output: 0

```

***

#### Day-11 : 
**Search Insert Position :** 
>Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.

>Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

>**Note:** You are not suppose to use the library's sort function for this problem.

**Example :**

```

Input: [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

```

***

#### Day-12 : 
**Insert Delete GetRandom O(1) :** 
>Design a data structure that supports all following operations in average O(1) time.

> - insert(val): Inserts an item val to the set if not already present.
> - remove(val): Removes an item val from the set if present.
> - getRandom: Returns a random element from current set of elements. Each element must have the same probability of being returned.

**Example :**

```

// Init an empty set.
RandomizedSet randomSet = new RandomizedSet();

// Inserts 1 to the set. Returns true as 1 was inserted successfully.
randomSet.insert(1);

// Returns false as 2 does not exist in the set.
randomSet.remove(2);

// Inserts 2 to the set, returns true. Set now contains [1,2].
randomSet.insert(2);

// getRandom should return either 1 or 2 randomly.
randomSet.getRandom();

// Removes 1 from the set, returns true. Set now contains [2].
randomSet.remove(1);

// 2 was already in the set, so return false.
randomSet.insert(2);

// Since 2 is the only number in the set, getRandom always return 2.
randomSet.getRandom();

```

***

#### Day-13 : 
**Largest Divisible Subset :** 
>Given a set of distinct positive integers, find the largest subset such that every pair (Si, Sj) of elements in this subset satisfies:

>Si % Sj = 0 or Sj % Si = 0.

>If there are multiple solutions, return any subset is fine.

**Example :**

```

Input: [1,2,3]
Output: [1,2] (of course, [1,3] will also be ok)

```
```

Input: [1,2,4,8]
Output: [1,2,4,8]

```

***

#### Day-14 : 
**Cheapest Flights Within K Stops :** 
>There are `n` cities connected by `m` flights. Each flight starts from city `u` and arrives at `v` with a price `w`.

>Now given all the cities and flights, together with starting city `src` and the destination `dst`, your task is to find the cheapest price from `src` to `dst` with up to `k` stops. If there is no such route, output `-1`.

**Example :**

```

Input: 
n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
src = 0, dst = 2, k = 1
Output: 200
Explanation: 
The graph looks like this:
```
![](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/02/16/995.png)
```
The cheapest price from city 0 to city 2 with at most 1 stop costs 200, as marked red in the picture.

```
```

Input: 
n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
src = 0, dst = 2, k = 0
Output: 500
Explanation: 
The graph looks like this:
```
![](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/02/16/995.png)
```
The cheapest price from city 0 to city 2 with at most 0 stop costs 500, as marked blue in the picture.

```

**Constraints :**

+ The number of nodes `n` will be in range `[1, 100]`, with nodes labeled from `0 to n - 1`.
+ The size of `flights` will be in range `[0, n * (n - 1) / 2]`.
+ The format of each flight will be `(src, dst, price)`.
+ The price of each flight will be in the range `[1, 10000]`.
+ `k` is in the range of `[0, n - 1]`.
+ There will not be any duplicated flights or self cycles.

***

#### Day-15 : 
**Search in a Binary Search Tree :** 
>Given the root node of a binary search tree (BST) and a value. You need to find the node in the BST that the node's value equals the given value. Return the subtree rooted with that node. If such node doesn't exist, you should return NULL.

**Example :**
```
Given the tree:
        4
       / \
      2   7
     / \
    1   3

And the value to search: 2
You should return this subtree:

      2     
     / \   
    1   3
In the example above, if we want to search the value 5, since there is no node with value 5, we should return NULL.

Note that an empty tree is represented by NULL, therefore you would see the expected output (serialized tree format) as [], not null.

```

***

#### Day-16 : 
**Validate IP Address :**
>Write a function to check whether an input string is a valid IPv4 address or IPv6 address or neither.

>**IPv4** addresses are canonically represented in dot-decimal notation, which consists of four decimal numbers, each ranging from 0 to 255, separated by dots ("."), e.g.,`172.16.254.1`;

>Besides, leading zeros in the IPv4 is invalid. For example, the address `172.16.254.01` is invalid.

>**IPv6** addresses are represented as eight groups of four hexadecimal digits, each group representing 16 bits. The groups are separated by colons (":"). For example, the address `2001:0db8:85a3:0000:0000:8a2e:0370:7334` is a valid one. Also, we could omit some leading zeros among four hexadecimal digits and some low-case characters in the address to upper-case ones, so `2001:db8:85a3:0:0:8A2E:0370:7334` is also a valid IPv6 address(Omit leading zeros and using upper cases).

>However, we don't replace a consecutive group of zero value with a single empty group using two consecutive colons (::) to pursue simplicity. For example, `2001:0db8:85a3::8A2E:0370:7334` is an invalid IPv6 address.

>Besides, extra leading zeros in the IPv6 is also invalid. For example, the address `02001:0db8:85a3:0000:0000:8a2e:0370:7334` is invalid.

>Note: You may assume there is no extra space or special characters in the input string.

**Example :**
```

Input: "172.16.254.1"

Output: "IPv4"

Explanation: This is a valid IPv4 address, return "IPv4".

```
```

Input: "2001:0db8:85a3:0:0:8A2E:0370:7334"

Output: "IPv6"

Explanation: This is a valid IPv6 address, return "IPv6".

```
```

Input: "256.256.256.256"

Output: "Neither"

Explanation: This is neither a IPv4 address nor a IPv6 address.

```

***

#### Day-17 : 
**Surrounded Regions :** 
>Given a 2D board containing `'X'` and `'O'` (**the letter O**), capture all regions surrounded by `'X'`.

>A region is captured by flipping all `'O'`s into `'X'`s in that surrounded region.

**Example :**

```

X X X X
X O O X
X X O X
X O X X

After running your function, the board should be:

X X X X
X X X X
X X X X
X O X X

```

**Explanation :**

Surrounded regions shouldn’t be on the border, which means that any `'O'` on the border of the board are not flipped to `'X'`. Any `'O'` that is not on the border and it is not connected to an `'O'` on the border will be flipped to `'X'`. Two cells are connected if they are adjacent cells connected horizontally or vertically.

***
 
#### Day-18 : 
**H-Index II :** 
>Given an array of citations sorted in ascending order (each citation is a non-negative integer) of a researcher, write a function to compute the researcher's h-index.

According to the [definition of h-index on Wikipedia](https://en.wikipedia.org/wiki/H-index): "A scientist has index h if h of his/her N papers have at least h citations each, and the other N − h papers have no more than h citations each."

**Example :**

```

Input: citations = [0,1,3,5,6]
Output: 3 
Explanation: [0,1,3,5,6] means the researcher has 5 papers in total and each of them had 
             received 0, 1, 3, 5, 6 citations respectively. 
             Since the researcher has 3 papers with at least 3 citations each and the remaining 
             two with no more than 3 citations each, her h-index is 3.
             
```
**Note :**

If there are several possible values for h, the maximum one is taken as the h-index.

***

#### Day-19 : 
**Longest Duplicate Substring :** 
>Given a string `S`, consider all duplicated substrings: (contiguous) substrings of S that occur 2 or more times.  (The occurrences may overlap.)

>Return **any** duplicated substring that has the longest possible length.  (If `S` does not have a duplicated substring, the answer is `""`.)

**Example :**

```

Input: "banana"
Output: "ana"

```
```

Input: "abcd"
Output: ""

```

**Constraints :**

+ `2 <= S.length <= 10^5`
+ `S` consists of lowercase English letters.

***




### :heart: Found this project useful?

If you found this project useful, then please consider giving it a :star: on Github and sharing it with your friends via social media.

## Project Created & Maintained By

### Sagnik Chattopadhyaya

Microsoft Student Partner, Student, Working for betterment of all, Competitive Coder, YouTuber

<a href="https://twitter.com/sagnik_20"><img src="https://github.com/tombryan/social-icon-font/blob/master/svg/twitter.svg?raw=true" width="60"></a>
<a href="https://www.linkedin.com/in/sagnik-chattopadhyaya/"><img src="https://github.com/tombryan/social-icon-font/blob/master/svg/linkedin.svg?raw=true" width="60"></a>
<a href="https://youtube.com/c/learnoverflow"><img src="https://github.com/tombryan/social-icon-font/blob/master/svg/youtube.svg?raw=true" width="60"></a>
<a href="https://medium.com/@meshagy18"><img src="https://github.com/shalinguyen/socialicious/blob/master/svg/icon_medium-sign.svg?raw=true" width="60"></a>
<a href="https://facebook.com/sagnik.chatterjee.9216"><img src="https://github.com/tombryan/social-icon-font/blob/master/svg/facebook.svg?raw=true" width="60"></a>
<a href="https://instagram.com/sagnik20"><img src="https://github.com/tombryan/social-icon-font/blob/master/svg/instagram.svg?raw=true" width="60"></a>
<a href="http://sagnikc.azurewebsites.net/"><img src="https://github.com/tombryan/social-icon-font/blob/master/svg/wordpress.svg?raw=true" width="60"></a>


# Donate

> If you found this project helpful or you learned something from the source code and want to thank me, consider buying me a cup of :coffee:
>
<a href="https://www.paypal.me/sagnik20/"><img src="https://github.com/slaterjohn/payment-logos/blob/master/Rounded%20Corners/PNG/medium/paypal%402x.png?raw=true" style="zoom:50%;"></a>
  
  
