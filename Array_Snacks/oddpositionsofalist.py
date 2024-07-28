def odd_position(my_list):
#prints the elements in the odd positions/indices of a list!
	length = len(my_list)
	for count in range(length):
		if count % 2 == 1:
			my_list[count] = my_list[count]
		else:
			my_list[count] = 0
	return my_list

list = [1, 25, 3, 98, 58]
odd_positions = odd_position(list)
print(odd_positions)