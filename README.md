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
