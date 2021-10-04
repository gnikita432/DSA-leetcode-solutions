Here's how I saw that we could use binary search:

Numbers are in increasing order
or

Given an example of [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] (from first example after problem statement)

Recognize that we're looking for an integer value as our answer (not a permutation of possible intervals or anything else, JUST return an int)
Recognize that we can bound the solution space: lowest bound for the solution is the max weight of an individual container (10). In this case, we can use a day to ship each container, and that is the guaranteed to give us the largest amount of days needed to ship all the containers. The highest bound for the solution is the sum of all the individual weights (55): if you used this weight, you can ship ALL the containers in a day
Now that we see that the answer HAS to be in this solution space, we need to find the answer that will give us the minimum max capacity that can ship out all containers within D days. So we can go through all the possible solutions linearly (from 10 to 55) and find the solution that will give us what we're looking for. We need to have a function that will calculate linearly (this function, calculate_days_to_ship, isn't too bad to implement, do it on your own) how many days it will take to ship out all the containers with our solutions ranging from 10 to 55.
The above is a bit of a naive approach. 10 to 55 isn't that big of a range but what if we had 10 to 100000000000? Since we know the problem is bounded, we can do a binary search to significantly speed up our algorithm. If the calculate_days_to_ship function spits out a number of days <= D, then it COULD be the solution, so we keep it in our solution space, so we move the right bound to m (smaller minimum max capacity will give us a bigger days_to_ship number), and if we get a number of days > D, then we know it CAN'T be the solution because we're only interested in days within D (<= D).
Eventually, you will come to your answer. Also check out LC 410: Split Array Largest Sum, this is the problem I first struggled with before I understood what was going on. Also check out First Bad Version, it is perfect for understanding how to implement the modified binary search algorithm that you need for problems like these.
