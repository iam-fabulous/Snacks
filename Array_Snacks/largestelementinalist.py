def largest_number(number):
#checks and prints the largest number in a list
	largest_num = len(number)
	temp = 0
	for count in range(largest_num):
		if number[count] > temp:
			temp = number[count]
	return temp

my_list = [1, 2, 3, 4, 5]
largest = largest_number(my_list)
print('the largest number is the list is: ', largest)