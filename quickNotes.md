# Two Sum
First start by creating a HashMap with the key as the element of nums, and the value as the index of the element.
As we iterate through the array, we check for the complement. This is the target value minus the element at the current
index. If our hashmap contains the complement, we return the value of the complement, which is the index as well as the current 
index. If our hashmap does not contain the complement, we add the current element and it's index into our hashmap.

## Add Two Numbers
Simplely return the sum of the two integers

### Squares of Sorted Array
We'll use a two pointer approach