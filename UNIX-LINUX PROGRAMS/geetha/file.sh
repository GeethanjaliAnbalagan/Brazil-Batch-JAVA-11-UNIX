#!/bin/bash
read -p "Enter file name : " filename
while read line
do 
echo $line
done < $filename