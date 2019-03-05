head -100 cleaned_data.csv>Datasets/Dataset_One.csv
head -250 cleaned_data.csv>Datasets/Dataset_Two.csv
head -500 cleaned_data.csv>Datasets/Dataset_Three.csv

java DateExtract Datasets/Dataset_One.csv Datasets/DS1.txt
java DateExtract Datasets/Dataset_Two.csv Datasets/DS2.txt
java DateExtract Datasets/Dataset_Three.csv Datasets/DS3.txt


while read line_ONE

do

java PowerBSTApp $line_ONE>>Datasets/BST_Op_Count_Values_BEST_CASE.txt

done<Datasets/DS1.txt

while read line_TWO

do

java PowerBSTApp $line_TWO>>Datasets/BST_Op_Count_Values_AVERAGE_CASE.txt

done<Datasets/DS2.txt

while read line_THREE

do

java PowerBSTApp $line_THREE>>Datasets/BST_Op_Count_Values_WORST_CASE.txt

done<Datasets/DS3.txt

while read line_4

do

java PowerArrayApp $line_4>>Datasets/Op_Count_Values_WORST_CASE.txt

done<Datasets/DS3.txt

while read line_5

do

java PowerArrayApp $line_5>>Datasets/Op_Count_Values_AVERAGE_CASE.txt

done<Datasets/DS2.txt

while read line_6

do

java PowerArrayApp $line_6>>Datasets/Op_Count_Values_BEST_CASE.txt

done<Datasets/DS1.txt
