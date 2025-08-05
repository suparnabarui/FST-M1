# user  enter numbers separated by spaces
user_input = input("Enter numbers separated by spaces: ")

num_list = [int(num) for num in user_input.split()]


if len(num_list) >= 1:
    # Compare first and last 
    result = num_list[0] == num_list[-1]
    print(f"\nFirst and last number are the same: {result}")
else:
    print("The list is empty.")
