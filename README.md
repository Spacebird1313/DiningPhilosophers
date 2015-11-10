# DiningPhilosophers

The Dining Philosophers problem is an example problem often used in computer science to illustrate synchronization
issues and techniques for resolving them. This simulator gives a visual representation of the dining philosophers problem. The application is designed for educational purposes to demonstrate the importance of semaphores to prevent deathlocks in concurrent program execution.

# Problem statement

Five silent philosophers sit at a round table with bowls of spaghetti. Forks are placed between each pair of adjacent philosophers. Each philosopher must alternately think and eat. However, a philosopher can only eat spaghetti when he has both left and right forks. Each fork can be held by only one philosopher and so a philosopher can use the fork only if it is not being used by another philosopher. After he finishes eating, he needs to put down both forks so they become available to others. A philosopher can take the fork on his right or the one on his left as they become available, but cannot start eating before getting both of them.

Eating is not limited by the remaining amounts of spaghetti or stomach space; an infinite supply is assumed.

# Execution

Compilation of the source code:
javac Experiment.java

Execute compiled code:
java Experiment

# Developed by
Huybrechts Thomas

University of Antwerp - 2014
