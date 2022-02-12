#! /bin/bash
echo -e "Enter the name of the file : \c"
read file_name

if [ -f $file_name ]
then
   echo "$file_name is file"
else
   echo "$file_name is not file"
fi