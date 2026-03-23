# Interview-Task-Day01

QUANTUMNIQUE PLACEMENT ENGINE
DAY 1 – FULL TRAINING PLAN
===========================================

BLOCK 1 – APTITUDE (Percentages)

Question 1
A number increased by 20% becomes 120.
Find the original number.

Question 2
If the price of a laptop increases from ₹50,000 to ₹60,000,
what is the percentage increase?

Question 3
A student scored 72 out of 90 in an exam.
Find the percentage score.

Question 4
The population of a town increases from 50,000 to 60,000.
Find the percentage increase.

Question 5
A shirt originally costs ₹800.
After a 25% discount, what is the final price?


===========================================
BLOCK 2 – VERBAL ABILITY

Reading Passage

Technology is transforming industries rapidly. Artificial Intelligence,
Machine Learning, and Automation are reshaping the way companies operate.
Businesses now depend heavily on data-driven decision making.

Questions

1. What is the main idea of the passage?
2. Which technologies are mentioned in the passage?
3. Why are companies relying on data-driven decisions?


Grammar Correction

1. She don't understand the problem.
2. He have completed the task.
3. They was going to the meeting.


===========================================
BLOCK 3 – COMMUNICATION PRACTICE

Speak for 2 minutes on:

Introduce Yourself

Include:
- Name
- College
- Branch
- Skills
- Projects
- Career goal

Example structure:

My name is ______.
I am currently pursuing ______ at ______ college.
I am interested in software development and problem solving.
I have worked on projects like ______.
My goal is to become a software engineer in a product-based company.


===========================================
BLOCK 4 – PROBLEM SOLVING

Find the missing number in the array

[1,2,3,4,6,7,8]

Expected Output
5

Hint

Use the formula:

Sum = n*(n+1)/2


===========================================
BLOCK 5 – DATA STRUCTURES & ALGORITHMS

Topic: Arrays

Problem 1 – Two Sum

Given an array of integers and a target value,
return the indices of two numbers whose sum equals the target.

Example

nums = [2,7,11,15]
target = 9

Output
[0,1]


Python Solution

def twoSum(nums,target):

    hashmap = {}

    for i,num in enumerate(nums):

        diff = target - num

        if diff in hashmap:
            return [hashmap[diff],i]

        hashmap[num] = i

Time Complexity

O(n)


Practice Problem

Find the maximum element in the array

[3,8,1,10,4]


===========================================
BLOCK 6 – CORE CS CONCEPTS

DBMS CONCEPT – PRIMARY KEY

A Primary Key is a column in a database table that uniquely identifies
each row.

Properties
- Must be unique
- Cannot be NULL
- Only one primary key per table

Example

Student Table

ID   Name
1    Rahul
2    Priya
3    Arun

Here ID is the primary key.


===========================================
OPERATING SYSTEMS CONCEPT – PROCESS VS THREAD

Process
A process is a program that is currently executing.

Examples
Chrome
VS Code
Spotify

Thread
A thread is the smallest unit of execution inside a process.

A process can have multiple threads.

Example
Chrome browser:
- One thread loads webpage
- One thread handles UI
- One thread downloads data

Differences

Process
Heavyweight
Separate memory
Slow context switch

Thread
Lightweight
Shared memory
Fast context switch


===========================================
NETWORKING CONCEPT – TCP VS UDP

TCP (Transmission Control Protocol)

Characteristics
- Reliable
- Error checking
- Data arrives in order

Examples
HTTP
HTTPS
FTP
Email


UDP (User Datagram Protocol)

Characteristics
- Faster
- No guarantee of delivery
- No error checking

Examples
Video streaming
Online gaming
VoIP calls


Key Differences

TCP
Reliable
Connection oriented
Used for web pages

UDP
Fast
Connectionless
Used for streaming


===========================================
CORE COMPUTER SCIENCE CONCEPT – TIME COMPLEXITY

Time complexity measures how fast an algorithm runs as input size grows.

Common complexities

O(1) – Access array element
O(log n) – Binary search
O(n) – Linear search
O(n log n) – Merge sort
O(n²) – Bubble sort


Example

for i in range(n):
    print(i)

Time Complexity
O(n)


===========================================
INTERVIEW QUESTION OF THE DAY

What is a Primary Key?

Answer

A Primary Key is a column in a database table that uniquely identifies
each record in the table.

Rules
- Must be unique
- Cannot be NULL


===========================================
END OF DAY 1 – QUANTUMNIQUE PLACEMENT ENGINE



QUANTUMNIQUE PLACEMENT ENGINE
DAY 2 – FULL TRAINING PLAN
===========================================

BLOCK 1 – APTITUDE (Profit & Loss)

Question 1
A shopkeeper buys a book for ₹400 and sells it for ₹480.
Find the profit percentage.

Question 2
A man buys a watch for ₹1500 and sells it for ₹1200.
Find the loss percentage.

Question 3
A trader marks a product 20% above the cost price and gives a 10% discount.
Find the final profit percentage.

Question 4
If the cost price of 5 pens is ₹100, what is the selling price of each pen to make 25% profit?

Question 5
A product is sold for ₹900 with a 10% loss.
Find the cost price.

===========================================
BLOCK 2 – VERBAL ABILITY

Reading Passage

Software development is evolving rapidly with the rise of cloud computing and
artificial intelligence. Companies are now building scalable systems that can
handle millions of users simultaneously.

Questions

1. What technologies are influencing software development?
2. Why are scalable systems important?
3. What does "scalable" mean in software systems?

Grammar Correction

1. He don't like programming.
2. She have submitted the assignment.
3. They was discussing the project.

===========================================
BLOCK 3 – COMMUNICATION PRACTICE

Speak for 2–3 minutes on:

Explain Your Final Year Project

Include:
- Project title
- Problem statement
- Technologies used
- Your role in the project
- Challenges faced

===========================================
BLOCK 4 – PROBLEM SOLVING

Reverse a Number

Input
1234

Output
4321

Hint

Use:
remainder = n % 10
n = n // 10

===========================================
BLOCK 5 – DATA STRUCTURES & ALGORITHMS

Topic: Arrays

Problem – Maximum Subarray (Kadane's Algorithm)

Given array:

[-2,1,-3,4,-1,2,1,-5,4]

Find the maximum sum of a contiguous subarray.

Expected Output
6

Subarray
[4,-1,2,1]

Python Solution

def maxSubArray(nums):

    current = nums[0]
    maximum = nums[0]

    for i in range(1,len(nums)):
        current = max(nums[i], current + nums[i])
        maximum = max(maximum, current)

    return maximum

Time Complexity
O(n)

Practice Problem

Find the second largest number in the array

[5,8,2,10,7]

===========================================
BLOCK 6 – CORE CS CONCEPTS

DBMS CONCEPT – FOREIGN KEY

A Foreign Key is a column in one table that refers to the Primary Key
of another table. It creates a relationship between tables.

Example

Student Table

StudentID | Name
1         | Rahul
2         | Priya

Enrollment Table

StudentID | Course
1         | Java
2         | Python

Here StudentID in Enrollment is a Foreign Key.

===========================================
OPERATING SYSTEMS CONCEPT – CPU SCHEDULING

CPU Scheduling determines which process gets CPU time.

Common algorithms:
- FCFS (First Come First Serve)
- SJF (Shortest Job First)
- Round Robin
- Priority Scheduling

Example

Process | Burst Time
P1      | 5
P2      | 3
P3      | 2

===========================================
NETWORKING CONCEPT – OSI MODEL

The OSI Model has 7 layers.

1. Physical
2. Data Link
3. Network
4. Transport
5. Session
6. Presentation
7. Application

When you access a website, data travels through these layers.

===========================================
CORE COMPUTER SCIENCE CONCEPT – RECURSION

Recursion occurs when a function calls itself.

Example

def factorial(n):

    if n == 0:
        return 1

    return n * factorial(n-1)

Example

factorial(5)

Output
120

===========================================
INTERVIEW QUESTION OF THE DAY

What is the difference between Primary Key and Foreign Key?

Primary Key
- Uniquely identifies each row
- Cannot be NULL
- One per table

Foreign Key
- References primary key in another table
- Can have duplicates
- Multiple allowed

===========================================
END OF DAY 2 – QUANTUMNIQUE PLACEMENT ENGINE




QUANTUMNIQUE PLACEMENT ENGINE
DAY 3 – FULL TRAINING PLAN
===========================================

BLOCK 1 – APTITUDE (Ratio & Proportion)

Question 1
If the ratio of A:B is 3:5 and B:C is 2:3, find A:C.

Question 2
Divide ₹1000 in the ratio 2:3:5.

Question 3
If 4 pens cost ₹40, what is the cost of 10 pens?

Question 4
The ratio of boys to girls in a class is 3:2. If total students = 50, find number of girls.

Question 5
If A:B = 4:7 and B = 21, find A.

===========================================
BLOCK 2 – VERBAL ABILITY

Reading Passage

Data structures are essential for efficient problem solving. Choosing the
right data structure can significantly improve performance.

Questions

1. Why are data structures important?
2. What happens if we choose the wrong data structure?
3. What does performance mean in programming?

Grammar Correction

1. He go to college daily.
2. She don’t likes coding.
3. We was solving problems.

===========================================
BLOCK 3 – COMMUNICATION PRACTICE

Speak for 2–3 minutes on:

Your Strengths and Weaknesses

Include:
- 2 strengths
- 1 weakness
- How you are improving

===========================================
BLOCK 4 – PROBLEM SOLVING

Check if a number is palindrome.

Example

Input: 121
Output: True

Input: 123
Output: False

===========================================
BLOCK 5 – DATA STRUCTURES & ALGORITHMS

Topic: Strings

Problem – Valid Palindrome

Given a string, check if it is a palindrome ignoring spaces and cases.

Example

"A man a plan a canal Panama"

Output
True

Python Solution

def isPalindrome(s):
    s = s.lower().replace(" ", "")
    return s == s[::-1]

Time Complexity
O(n)

Practice Problem

Reverse a string

===========================================
BLOCK 6 – CORE CS CONCEPTS

DBMS CONCEPT – NORMALIZATION

Normalization is the process of organizing data to reduce redundancy.

Types:
- 1NF
- 2NF
- 3NF

===========================================
OPERATING SYSTEMS CONCEPT – DEADLOCK

Deadlock occurs when processes are waiting for each other indefinitely.

Conditions:
- Mutual Exclusion
- Hold and Wait
- No Preemption
- Circular Wait

===========================================
NETWORKING CONCEPT – IP ADDRESS

IP Address uniquely identifies a device on a network.

Types:
- IPv4
- IPv6

===========================================
CORE COMPUTER SCIENCE CONCEPT – SPACE COMPLEXITY

Space complexity measures memory usage of an algorithm.

Example:
Using extra array → O(n)
No extra space → O(1)

===========================================
INTERVIEW QUESTION OF THE DAY

What is normalization in DBMS?

Answer:
It is the process of structuring database tables to reduce redundancy and improve data integrity.

===========================================
END OF DAY 3 – QUANTUMNIQUE PLACEMENT ENGINE




QUANTUMNIQUE PLACEMENT ENGINE
DAY 4 – FULL TRAINING PLAN (TOUGHER LEVEL)
===========================================

BLOCK 1 – APTITUDE (Time & Work – Moderate)

Question 1
A can complete a work in 10 days and B in 15 days. How long will they take together?

Question 2
A, B and C can complete a work in 6, 8 and 12 days respectively.
How many days will they take working together?

Question 3
A alone can do a work in 12 days. After 4 days, B joins and completes remaining work in 4 days.
Find time taken by B alone.

Question 4
If 5 workers can complete a work in 8 days, how many workers are required to complete it in 4 days?

Question 5
A pipe fills a tank in 6 hours and another empties it in 8 hours.
How long to fill the tank?

===========================================
BLOCK 2 – VERBAL ABILITY (Advanced)

Reading Passage

Efficient algorithms and optimized systems are critical in large-scale applications.
Companies like Amazon and Google rely heavily on scalable architectures.

Questions

1. Why are optimized systems important?
2. What does scalability mean in real-world applications?
3. Name companies that depend on scalable systems.

Grammar Correction

1. He didn’t knew the answer.
2. She is more smarter than him.
3. They has completed the task.

===========================================
BLOCK 3 – COMMUNICATION PRACTICE

Speak for 3 minutes on:

Explain a technical concept (e.g., Arrays / DBMS / OS)

Include:
- Definition
- Real-world example
- Use case

===========================================
BLOCK 4 – PROBLEM SOLVING (Logic)

Find duplicates in array

Input:
[1,2,3,4,2,5,6,3]

Output:
[2,3]

Follow-up:
Solve in O(n) time.

===========================================
BLOCK 5 – DATA STRUCTURES & ALGORITHMS (Medium)

Topic: Sliding Window

Problem – Longest Substring Without Repeating Characters

Input:
"abcabcbb"

Output:
3

Explanation:
"abc" is the longest substring.

Python Solution

def longestSubstring(s):
    char_set = set()
    left = 0
    max_length = 0

    for right in range(len(s)):
        while s[right] in char_set:
            char_set.remove(s[left])
            left += 1
        char_set.add(s[right])
        max_length = max(max_length, right - left + 1)

    return max_length

Time Complexity: O(n)

Practice Problem

Find first non-repeating character in string

===========================================
BLOCK 6 – CORE CS CONCEPTS

DBMS CONCEPT – INDEXING

Indexing improves query performance by reducing search time.

Types:
- Primary Index
- Secondary Index

===========================================
OPERATING SYSTEMS CONCEPT – MEMORY MANAGEMENT

Memory management handles allocation and deallocation of memory.

Concepts:
- Paging
- Segmentation
- Virtual Memory

===========================================
NETWORKING CONCEPT – DNS

DNS converts domain names into IP addresses.

Example:
google.com → IP address

===========================================
CORE COMPUTER SCIENCE CONCEPT – HASHING

Hashing maps data to fixed-size values.

Used in:
- HashMaps
- Caching
- Databases

===========================================
INTERVIEW QUESTION OF THE DAY

What is indexing in DBMS and why is it used?

Answer:
Indexing improves search performance by allowing faster data retrieval.

===========================================
END OF DAY 4 – QUANTUMNIQUE PLACEMENT ENGINE


QUANTUMNIQUE PLACEMENT ENGINE
DAY 5 – FULL TRAINING PLAN (ADVANCED LEVEL)
===========================================

BLOCK 1 – APTITUDE (Speed, Time & Distance)

Question 1
A train travels 60 km in 1 hour. What is its speed in m/s?

Question 2
A car travels at 40 km/h for 2 hours and 60 km/h for next 2 hours.
Find average speed.

Question 3
Two trains moving in opposite directions at 50 km/h and 70 km/h.
Find relative speed.

Question 4
A person walks at 5 km/h and runs at 10 km/h.
Find time taken to cover 15 km if half distance is walked and half is run.

Question 5
If a train crosses a pole in 10 seconds and its length is 100 meters,
find its speed.

===========================================
BLOCK 2 – VERBAL ABILITY (Advanced)

Reading Passage

Algorithms play a crucial role in optimizing system performance.
Efficient algorithms reduce execution time and resource consumption.

Questions

1. Why are algorithms important?
2. What happens if inefficient algorithms are used?
3. What is optimization in computing?

Grammar Correction

1. He have been working here since 2 years.
2. She did not wrote the code.
3. They is preparing for interviews.

===========================================
BLOCK 3 – COMMUNICATION PRACTICE

Speak for 3 minutes on:

Explain a recent technical topic you learned

Include:
- Concept explanation
- Example
- Real-world use

===========================================
BLOCK 4 – PROBLEM SOLVING (Intermediate)

Find first repeating element in array

Input:
[1,2,3,4,2,5,3]

Output:
2

Follow-up:
Solve efficiently using hashing.

===========================================
BLOCK 5 – DATA STRUCTURES & ALGORITHMS (Important Pattern)

Topic: Binary Search

Problem – Search in Sorted Array

Given a sorted array, find index of target element.

Example:

nums = [1,2,3,4,5,6,7]
target = 5

Output:
4

Python Solution

def binarySearch(nums, target):
    left, right = 0, len(nums)-1

    while left <= right:
        mid = (left + right)//2

        if nums[mid] == target:
            return mid
        elif nums[mid] < target:
            left = mid + 1
        else:
            right = mid - 1

    return -1

Time Complexity: O(log n)

Practice Problem

Find square root of a number using binary search

===========================================
BLOCK 6 – CORE CS CONCEPTS

DBMS CONCEPT – JOINS

Types of joins:
- INNER JOIN
- LEFT JOIN
- RIGHT JOIN
- FULL JOIN

===========================================
OPERATING SYSTEMS CONCEPT – THREADS

Threads are lightweight processes sharing same memory.

Types:
- User-level threads
- Kernel-level threads

===========================================
NETWORKING CONCEPT – HTTP vs HTTPS

HTTP:
- Not secure
- Data not encrypted

HTTPS:
- Secure
- Uses SSL/TLS encryption

===========================================
CORE COMPUTER SCIENCE CONCEPT – STACK

Stack follows LIFO (Last In First Out)

Operations:
- Push
- Pop
- Peek

===========================================
INTERVIEW QUESTION OF THE DAY

What is binary search and when can it be used?

Answer:
Binary search is used to find elements in sorted arrays with O(log n) complexity.

===========================================
END OF DAY 5 – QUANTUMNIQUE PLACEMENT ENGINE


QUANTUMNIQUE PLACEMENT ENGINE
DAY 6 – FULL TRAINING PLAN (ADVANCED LEVEL)
===========================================

BLOCK 1 – APTITUDE (Permutation & Combination)

Question 1
In how many ways can 3 students be selected from 7 students?

Question 2
How many 2-digit numbers can be formed using digits 1, 2, 3, 4 without repetition?

Question 3
In how many ways can a captain and vice-captain be chosen from 6 players?

Question 4
How many different arrangements can be made using the letters of the word MATH?

Question 5
A committee of 4 members is to be formed from 8 people. In how many ways can it be formed?

===========================================
BLOCK 2 – VERBAL ABILITY (Advanced)

Reading Passage

Databases are at the heart of modern applications. Efficient storage,
retrieval, and management of data are essential for building scalable
software products. Companies rely on well-designed databases to ensure
data consistency and performance.

Questions

1. Why are databases important in modern applications?
2. What does data consistency mean?
3. Why do companies need well-designed databases?

Grammar Correction

1. She do not understand SQL joins.
2. He were explaining the database schema.
3. They has written the program successfully.

===========================================
BLOCK 3 – COMMUNICATION PRACTICE

Speak for 3 minutes on:

Explain one challenge you faced while learning coding

Include:
- What was the challenge?
- Why was it difficult?
- How did you overcome it?
- What did you learn from it?

===========================================
BLOCK 4 – PROBLEM SOLVING (Intermediate)

Find the first non-repeating element in the array

Input:
[4,5,1,2,0,4,1,2]

Output:
5

Follow-up:
Solve efficiently using hashing.

===========================================
BLOCK 5 – DATA STRUCTURES & ALGORITHMS (Important Pattern)

Topic: Two Pointers + Sorting

Problem – Two Sum II (Sorted Array)

Given a sorted array, return the indices of two numbers such that they add up to target.

Example:

nums = [2,3,4,7,11,15]
target = 9

Output:
[1,3]

Python Solution

def twoSumSorted(nums, target):
    left, right = 0, len(nums)-1

    while left < right:
        current = nums[left] + nums[right]

        if current == target:
            return [left, right]
        elif current < target:
            left += 1
        else:
            right -= 1

    return [-1, -1]

Time Complexity: O(n)

Practice Problem

Remove duplicates from sorted array

===========================================
BLOCK 6 – CORE CS CONCEPTS

DBMS CONCEPT – ACID PROPERTIES

ACID stands for:
- Atomicity
- Consistency
- Isolation
- Durability

These properties ensure reliable database transactions.

===========================================
OPERATING SYSTEMS CONCEPT – CONTEXT SWITCHING

Context switching is the process of saving the state of one process/thread
and loading the state of another so the CPU can switch execution.

===========================================
NETWORKING CONCEPT – ROUTER VS SWITCH

Router:
- Connects different networks
- Uses IP address

Switch:
- Connects devices within the same network
- Uses MAC address

===========================================
CORE COMPUTER SCIENCE CONCEPT – QUEUE

Queue follows FIFO (First In First Out)

Operations:
- Enqueue
- Dequeue
- Front/Peek

Real-world example:
- Printer queue
- Ticket counter line

===========================================
INTERVIEW QUESTION OF THE DAY

What are ACID properties in DBMS?

Answer:
ACID properties ensure reliable transactions:
Atomicity means all or nothing.
Consistency keeps data valid.
Isolation separates concurrent transactions.
Durability ensures committed data is permanent.

===========================================
END OF DAY 6 – QUANTUMNIQUE PLACEMENT ENGINE


QUANTUMNIQUE PLACEMENT ENGINE
DAY 7 – FULL TRAINING PLAN (INTERVIEW FOCUSED)
===========================================

BLOCK 1 – APTITUDE (Probability)

Question 1
What is the probability of getting a head when tossing a coin?

Question 2
What is the probability of getting a number greater than 4 when rolling a dice?

Question 3
A bag contains 3 red balls and 2 blue balls.
Find probability of picking a red ball.

Question 4
If two coins are tossed, what is probability of getting two heads?

Question 5
Probability of selecting a vowel from the word ENGINEER.

===========================================
BLOCK 2 – VERBAL ABILITY (Advanced)

Reading Passage

Operating systems manage hardware resources and provide services for computer programs.
Efficient OS design ensures better performance, memory management, and process scheduling.

Questions

1. What is the main role of an operating system?
2. Why is memory management important?
3. What is process scheduling?

Grammar Correction

1. He don’t know operating systems.
2. She were learning data structures.
3. They has solved the problem.

===========================================
BLOCK 3 – COMMUNICATION PRACTICE

Speak for 3 minutes on:

Explain how the Internet works

Include:
- What happens when you type a URL
- DNS
- Server
- Response

===========================================
BLOCK 4 – PROBLEM SOLVING (Intermediate)

Move all zeros to end of array

Input:
[0,1,0,3,12]

Output:
[1,3,12,0,0]

Solve in O(n) time without extra array.

===========================================
BLOCK 5 – DATA STRUCTURES & ALGORITHMS

Topic: Linked List Basics

Problem – Reverse a Linked List

Example:
1 -> 2 -> 3 -> 4 -> 5
Output:
5 -> 4 -> 3 -> 2 -> 1

Time Complexity: O(n)

Practice Problem

Find middle of linked list

===========================================
BLOCK 6 – CORE CS CONCEPTS

DBMS CONCEPT – TRANSACTIONS

A transaction is a sequence of database operations treated as a single unit.

===========================================
OPERATING SYSTEMS CONCEPT – DEADLOCK PREVENTION

Deadlock prevention ensures at least one of the deadlock conditions never occurs.

===========================================
NETWORKING CONCEPT – TCP 3-WAY HANDSHAKE

Steps:
1. SYN
2. SYN-ACK
3. ACK

===========================================
CORE COMPUTER SCIENCE CONCEPT – TREE

Tree is a hierarchical data structure.

===========================================
INTERVIEW QUESTION OF THE DAY

What is the difference between stack and queue?

Stack uses LIFO.
Queue uses FIFO.

===========================================
END OF DAY 7 – QUANTUMNIQUE PLACEMENT ENGINE



