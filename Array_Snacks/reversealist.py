def reverse_list(my_list):
#reverses the elements on an array
	temp = 0
	length = len(my_list)
	for i in range(1, length, 1):
		temp = my_list[i]
		my_list[i] = my_list[length-1-i]
		my_list[length-1-i] = my_list[i]
	return my_list


# Usage
my_list = [1, 2, 3, 4]
reverse_list(my_list)
print(my_list)  # Output: [1, 4, 9, 16]
