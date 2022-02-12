# Shell script to display list of file names
# having read, Write and Execute permission
echo "The name of all files having all permissions :"
  
# loop through all files in current directory
for file in *
do

# check if it is a file
if [ -f $file ]
then

# check if it has all permissions
if [ -r $file -a -w $file -a -x $file ]
then

# print the complete file name with -l option
ls -l $file

# closing second if statement
fi

# closing first if statement
fi