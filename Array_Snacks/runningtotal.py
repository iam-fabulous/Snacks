def list_total(my_list):
#prints the total of all the elements in a list!
	total = 0
	length = len(my_list)
	for count in range(length):
		total += my_list[count]
	return total

list = [1, 2, 3, 4]
total = list_total(list)
print("the total is: ", total)