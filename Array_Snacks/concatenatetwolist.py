def concatenate_list(list_1, list_2):
#function to concatenates two lists as one!
	my_list = []
	my_list.append(list_1 + " " + list_2)
	return my_list

list1 = [1, 2, 3]
list2 = [4, 5, 6]
join = concatenate_list(list1, list2)