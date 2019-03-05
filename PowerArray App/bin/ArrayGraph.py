#!/usr/bin/python
import matplotlib.pyplot as plt

#BEST Graph
Counts_BEST=[]
bst=[]
a=0
file=open("Datasets/Op_Count_Values_BEST_CASE.txt", "r")
for line in file.readlines():
	float_count=int(line)
	Counts_BEST.append(float_count)
	bst.append(a)
	a+=1

#Average Graph
Counts_AVG=[]
avg=[]
b=0
file=open("Datasets/Op_Count_Values_AVERAGE_CASE.txt", "r")
for line in file.readlines():
	float_count=int(line)
	Counts_AVG.append(float_count)
	avg.append(b)
	b+=1

#Worst Graph
Counts_WORST=[]
worst=[]
c=0
file=open("Datasets/Op_Count_Values_WORST_CASE.txt", "r")
for line in file.readlines():
	float_count=int(line)
	Counts_WORST.append(float_count)
	worst.append(c)
	c+=1
plt.title('Graph of Number of Count Operations Against Number of Sampled Data Items for ArraySearch')

plt.subplot(3,1,1)
plt.gca().set_title('Worst Case')
plt.plot(worst,Counts_WORST, 'g--')
plt.ylabel('No. of Count Operations')

plt.subplot(3,1,2)
plt.gca().set_title('Average Case')
plt.plot(avg,Counts_AVG, 'b--')
plt.ylabel('No. of Count Operations')

plt.subplot(3,1,3)
plt.gca().set_title('Best Case')
plt.ylabel('No. of Count Operations')
plt.xlabel('No. of Sampled Data Items')
plt.plot(bst,Counts_BEST, 'r--'  )

plt.axis([ 0, 600,1, 1600])

plt.show()

