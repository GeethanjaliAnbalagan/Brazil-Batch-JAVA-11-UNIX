#! /bin/bash
echo -e "Enter the name of the file : \c"
read file_name

if [ -w $file_name ]
then
   echo "$file_name is writable"
else
   echo "$file_name is not writable"
fi   