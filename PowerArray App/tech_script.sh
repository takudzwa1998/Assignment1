head -100 cleaned_data.csv>Datasets/Dataset_One.csv
head -250 cleaned_data.csv>Datasets/Dataset_Two.csv
head -500 cleaned_data.csv>Datasets/Dataset_Three.csv

while read line
do

dateTime = $line|cut -d\, -f1
java PowerArrayApp dateTime

done<Datasets/Dataset_One.csv
