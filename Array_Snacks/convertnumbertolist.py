def number_to_list(number):
#function takes a number and returns it as a list!
	length = str(number)
	my_list = []
	for count in length:
		temp = int(count)
		my_list.append(temp)
	return my_list


number = 23456
list = number_to_list(number)
print(list)