#!/usr/bin/python
import matplotlib.pyplot as plt

#BEST Graph
Counts_BEST=[]
bst=[]
a=0
file=open("Datasets/BST_Op_Count_Values_BEST_CASE.txt", "r")
for line in file.readlines():
	float_count=int(line)
	Counts_BEST.append(float_count)
	bst.append(a)
	a+=1

#Average Graph
Counts_AVG=[]
avg=[]
b=0
file=open("Datasets/BST_Op_Count_Values_AVERAGE_CASE.txt", "r")
for line in file.readlines():
	float_count=int(line)
	Counts_AVG.append(float_count)
	avg.append(b)
	b+=1

#Worst Graph
Counts_WORST=[]
worst=[]
c=0
file=open("Datasets/BST_Op_Count_Values_WORST_CASE.txt", "r")
for line in file.readlines():
	float_count=int(line)
	Counts_WORST.append(float_count)
	worst.append(c)
	c+=1




plt.title('Graph of Number of Count Operations Against Number of Sampled Data Items for BSTSearch')
plt.xlabel('No. of Sampled Data Items')
plt.ylabel('No. of Count Operations')
plt.plot(worst,Counts_WORST, 'g--',avg,Counts_AVG, 'b--',bst,Counts_BEST, 'r--'  )
plt.axis([ 0, 550,500, 525])
plt.show()
