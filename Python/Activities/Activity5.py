# Get input from the user
number = int(input("Enter a number to generate its multiplication table: "))


print(f"\nMultiplication Table for {number}:\n")
for i in range(1, 11):
    result = number * i
    print(f"{number} x {i} = {result}")
