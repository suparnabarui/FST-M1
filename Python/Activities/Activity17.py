import csv

# Data to write
data = [
    ["Usernames", "Passwords"],
    ["admin", "password"],
    ["Charles", "Charl13"],
    ["Deku", "AllMight"]
]

# Write to CSV file
with open("user_data.csv", mode="w", newline="") as file:
    writer = csv.writer(file)
    writer.writerows(data)

print("CSV file 'user_data.csv' has been created.")
