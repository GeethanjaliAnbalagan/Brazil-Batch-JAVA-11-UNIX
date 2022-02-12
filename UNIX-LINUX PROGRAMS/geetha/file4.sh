#! /bin/bash
echo -e "Enter the name of the file : \c"
read file_name

if [ -e $file_name ]
then
   echo "$file_name exist"
else
   echo "$file_name not exist"
fi