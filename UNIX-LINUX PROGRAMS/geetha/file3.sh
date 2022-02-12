#! /bin/bash
echo -e "Enter the name of the file : \c"
read file_name

if [ -d $file_name ]
then
   echo "$file_name is a directory"
else
   echo "$file_name is not a directory"
fi