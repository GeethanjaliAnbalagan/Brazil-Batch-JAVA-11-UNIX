 #! /bin/bash
echo -e "Enter the name of the file : \c"
read file_name

if [ -s $file_name ]
then
   echo "$file_name has size>0"
else
   echo "$file_name has size= 0"
fi