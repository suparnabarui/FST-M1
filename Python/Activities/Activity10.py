# User input numbers separated by spaces
user_input = input("Enter numbers for the tuple (separated by spaces): ")

num_tuple = tuple(int(num) for num in user_input.split())

# Print numbers divisible by 5
print("\nNumbers divisible by 5:")
for num in num_tuple:
    if num % 5 == 0:
        print(num)
