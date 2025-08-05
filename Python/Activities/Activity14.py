def fibonacci(n):
    # Base cases
    if n == 1 or n == 2:
        return 1
    else:
        return fibonacci(n - 1) + fibonacci(n - 2)

# Ask user for how many Fibonacci numbers to generate
count = int(input("How many Fibonacci numbers would you like to generate? "))

print(f"\nFirst {count} Fibonacci numbers:")

for i in range(1, count + 1):
    print(fibonacci(i), end=' ')
