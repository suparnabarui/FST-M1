#  user enter numbers separated by spaces
user_input = input("Enter numbers separated by spaces: ")

num_list = [int(num) for num in user_input.split()]

# Calculate the sum 
total_sum = sum(num_list)

print(f"\nThe sum of the list elements is: {total_sum}")
