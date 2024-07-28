def check_palindrome(my_list):
#this function checks if a string is a palindrome or not!
	counter = 0
	length = len(my_list) // 2
	for count in range(length):
		if my_list[count] == my_list[len(my_list) -1 -count]:
			counter += 1
	if counter == length:
		return	print("list is a palindrome")
	return	"list is not a palindrome"

list = ['a', 'b', 'c', 'c', 'b', 'a']
is_list_palindrome = check_palindrome(list)
print(is_list_palindrome)