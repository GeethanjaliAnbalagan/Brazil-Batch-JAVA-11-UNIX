#! /bin/bash
echo -e "Enter the name of the file : \c"
read file_name

if [ -r $file_name ]
then
   echo "$file_name is readable"
else
   echo "$file_name is not readable"
fi