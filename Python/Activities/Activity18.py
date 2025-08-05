import csv

# Read the CSV file into a list of dictionaries
with open("user_data.csv", mode="r", newline="") as file:
    reader = csv.DictReader(file)
    data = list(reader)

# Print values only in the Usernames column
print("Usernames column values:")
usernames = [row["Usernames"] for row in data]
print(usernames)

# Print the username and password of the second row (index 1)
print("\nUsername and password of the second row:")
second_row = data[1]
print(f"Username: {second_row['Usernames']}, Password: {second_row['Passwords']}")

# Sort the data by Usernames column in ascending order and print
sorted_by_usernames = sorted(data, key=lambda x: x["Usernames"])
print("\nData sorted by Usernames (ascending):")
for row in sorted_by_usernames:
    print(row)

# Sort the data by Passwords column in descending order and print
sorted_by_passwords = sorted(data, key=lambda x: x["Passwords"], reverse=True)
print("\nData sorted by Passwords (descending):")
for row in sorted_by_passwords:
    print(row)
