head -5 cleaned_data.csv>Datasets/Dataset_One.csv
head -250 cleaned_data.csv>Datasets/Dataset_Two.csv
head -500 cleaned_data.csv>Datasets/Dataset_Three.csv

while read line
do

set dateTime = $line|cut -d\, -f1

java PowerArrayApp $line|cut -d\, -f1

done<Datasets/Dataset_One.csv
