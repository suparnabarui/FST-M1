# Dictionary of fruits and their prices
fruit_prices = {
    'apple': 2.5,
    'banana': 1.2,
    'orange': 1.8,
    'grape': 3.0,
    'mango': 2.8,
    'pineapple': 4.0
}

# Ask the user to enter the name of a fruit
fruit_name = input("Enter the name of the fruit to check its availability: ").lower()

# Check if the fruit is in the dictionary
if fruit_name in fruit_prices:
    print(f"\nYes, {fruit_name.capitalize()} is available. Price: ${fruit_prices[fruit_name]:.2f}")
else:
    print(f"\nSorry, {fruit_name.capitalize()} is not available.")
