def recursive_sum(n):
    # Base case
    if n == 0:
        return 0
    else:
        return n + recursive_sum(n - 1)

# Call the function for n = 10
result = recursive_sum(10)

# Print the result
print(f"Sum of numbers from 0 to 10 is: {result}")
