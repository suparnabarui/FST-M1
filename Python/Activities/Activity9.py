# Get first list from user
first_input = input("Enter numbers for the first list (separated by spaces): ")
first_list = [int(num) for num in first_input.split()]

# Get second list from user
second_input = input("Enter numbers for the second list (separated by spaces): ")
second_list = [int(num) for num in second_input.split()]

# Filter odd numbers from first list
odd_from_first = [num for num in first_list if num % 2 != 0]

# Filter even numbers from second list
even_from_second = [num for num in second_list if num % 2 == 0]

# Combine both lists
new_list = odd_from_first + even_from_second

# Display the result
print(f"\nNew list (odd from first + even from second): {new_list}")
