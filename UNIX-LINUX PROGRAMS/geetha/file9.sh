#! /bin/bash
echo -e "Enter the name of the file : \c"
read file_name

if [ -x $file_name ]
then
   echo "$file_name is executable"
else
   echo "$file_name is not executable"
fi   