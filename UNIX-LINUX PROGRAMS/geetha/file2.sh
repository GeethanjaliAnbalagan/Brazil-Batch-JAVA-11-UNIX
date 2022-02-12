#! /bin/bash
echo -e "Enter the name of the file : \c"
read file_name

if [ -b $file_name ]
then
   echo "$file_name is a block special file"
else
   echo "$file_name is not a block special file"
fi