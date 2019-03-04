#!/usr/bin/python
import matplotlib.pyplot as plt

#BEST Graph
Counts_BEST=[]
bst=[]
a=0
file=open("Datasets/Op_Count_Values_BEST_CASE.txt", "r")
for line in file.readlines():
	float_count=float(line)
	Counts_BEST.append(float_count/100)
	bst.append(a)
	a+=1

#plt.plot(bst,Counts_BEST, 'r-')
#plt.axis([ 0, 100,55, 59])
#plt.show()

#Average Graph
Counts_AVG=[]
avg=[]
b=0
file=open("Datasets/Op_Count_Values_AVERAGE_CASE.txt", "r")
for line in file.readlines():
	float_count=float(line)
	Counts_AVG.append(float_count/100)
	avg.append(b)
	b+=1

#plt.plot(avg,Counts_AVG, 'b-')
#plt.axis([ 0, 250,55, 63])
#plt.show()

#Worst Graph
Counts_WORST=[]
worst=[]
c=0
file=open("Datasets/Op_Count_Values_WORST_CASE.txt", "r")
for line in file.readlines():
	float_count=float(line)
	Counts_WORST.append(float_count/100)
	worst.append(c)
	c+=1

plt.title('Graph of Number of Count Operations Against Number of Sampled Data Items for ArraySearch')
plt.xlabel('No. of Sampled Data Items')
plt.ylabel('No. of Count Operations(*10^2)')
plt.plot(worst,Counts_WORST, 'g--',avg,Counts_AVG, 'b--',bst,Counts_BEST, 'r--'  )
plt.axis([ 0, 500,55, 71])
plt.show()

