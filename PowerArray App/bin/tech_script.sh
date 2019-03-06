head -100 cleaned_data.csv>Datasets/Dataset_One.csv
head -200 cleaned_data.csv>Datasets/Dataset_Two.csv
head -300 cleaned_data.csv>Datasets/Dataset_Three.csv
head -400 cleaned_data.csv>Datasets/Dataset_Four.csv
head -500 cleaned_data.csv>Datasets/Dataset_Five.csv

java DateExtract Datasets/Dataset_One.csv Datasets/DS1.txt
java DateExtract Datasets/Dataset_Two.csv Datasets/DS2.txt
java DateExtract Datasets/Dataset_Three.csv Datasets/DS3.txt
java DateExtract Datasets/Dataset_Four.csv Datasets/DS4.txt
java DateExtract Datasets/Dataset_Five.csv Datasets/DS5.txt


while read line_ONE

do

java PowerBSTApp GetOpCountsFiles $line_ONE>>Datasets/BST_Op_Count_Values_1.txt

done<Datasets/DS1.txt

while read line_TWO

do

java PowerBSTApp GetOpCountsFiles $line_TWO>>Datasets/BST_Op_Count_Values_2.txt

done<Datasets/DS2.txt

while read line_THREE

do

java PowerBSTApp GetOpCountsFiles $line_THREE>>Datasets/BST_Op_Count_Values_3.txt

done<Datasets/DS3.txt

while read line_Four

do

java PowerBSTApp GetOpCountsFiles $line_Four>>Datasets/BST_Op_Count_Values_4.txt

done<Datasets/DS4.txt

while read line_Five

do

java PowerBSTApp GetOpCountsFiles $line_Five>>Datasets/BST_Op_Count_Values_5.txt

done<Datasets/DS5.txt

#Array

while read line_4

do

java PowerArrayApp GetOpCountsFiles $line_4>>Datasets/Op_Count_Values_1.txt

done<Datasets/DS5.txt

while read line_3

do

java PowerArrayApp GetOpCountsFiles $line_3>>Datasets/Op_Count_Values_2.txt

done<Datasets/DS4.txt




while read line_4

do

java PowerArrayApp GetOpCountsFiles $line_4>>Datasets/Op_Count_Values_3.txt

done<Datasets/DS3.txt

while read line_5

do

java PowerArrayApp GetOpCountsFiles $line_5>>Datasets/Op_Count_Values_4.txt

done<Datasets/DS2.txt

while read line_6

do

java PowerArrayApp "GetOpCountsFiles" $line_6>>Datasets/Op_Count_Values_BEST_5.txt

done<Datasets/DS1.txt
