import pandas as pd

# Read the Excel file
df = pd.read_excel("contacts.xlsx")

# Print number of rows and columns
print(f"Number of rows and columns: {df.shape}")

# Print the data in the Emails column only
print("\nEmails column data:")
print(df["Email"])

# Sort data based on FirstName in ascending order and print
sorted_df = df.sort_values("FirstName", ascending=True)
print("\nData sorted by FirstName (ascending):")
print(sorted_df)
