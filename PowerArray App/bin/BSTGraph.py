#!/usr/bin/python
import matplotlib.pyplot as plt

#BEST Graph
Counts_BEST=[]
bst=[]
a=0
file=open("Datasets/BST_Op_Count_Values_1.txt", "r")
for line in file.readlines():
	float_count=int(line)
	Counts_BEST.append(float_count)
	bst.append(a)
	a+=1

#Average Graph
Counts_AVG=[]
avg=[]
b=0
file=open("Datasets/BST_Op_Count_Values_2.txt", "r")
for line in file.readlines():
	float_count=int(line)
	Counts_AVG.append(float_count)
	avg.append(b)
	b+=1

#Worst Graph
Counts_WORST=[]
worst=[]
c=0
file=open("Datasets/BST_Op_Count_Values_5.txt", "r")
for line in file.readlines():
	float_count=int(line)
	Counts_WORST.append(float_count)
	worst.append(c)
	c+=1

#Worst Graph
Counts_4=[]
w4=[]
c=0
file=open("Datasets/BST_Op_Count_Values_4.txt", "r")
for line in file.readlines():
	float_count=int(line)
	Counts_4.append(float_count)
	w4.append(c)
	c+=1

#Worst Graph
Counts_5=[]
w5=[]
c=0
file=open("Datasets/BST_Op_Count_Values_3.txt", "r")
for line in file.readlines():
	float_count=int(line)
	Counts_5.append(float_count)
	w5.append(c)
	c+=1

plt.title('Graph of Number of Count Operations Against Number of Sampled Data Items for BSTSearch')

plt.subplot(5,1,1)
plt.ylabel('No. of Count Operations')
plt.xlabel('No. of Sampled Data Items')
plt.plot(bst,Counts_BEST, 'r--'  )
plt.axis([ 0, 550,0, 30])
plt.subplot(5,1,2)
plt.plot(avg,Counts_AVG, 'b--')
plt.axis([ 0, 550,0, 30])
plt.subplot(5,1,3)
plt.xlabel('No. of Sampled Data Items')
plt.plot(w5,Counts_5, 'm--'  )
plt.axis([ 0, 550,0, 30])
plt.subplot(5,1,4)
plt.xlabel('No. of Sampled Data Items')
plt.plot(w4,Counts_4, 'c--'  )
plt.axis([ 0, 550,0, 30])
plt.subplot(5,1,5)
plt.plot(worst,Counts_WORST, 'g--')
plt.xlabel('No. of Operation Counts')

plt.axis([ 0, 550,0, 30])
plt.show()
