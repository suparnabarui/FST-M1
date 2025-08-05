from openpyxl import Workbook

# Create a new workbook and select the active worksheet
wb = Workbook()
ws = wb.active

# Add headers
headers = ["FirstName", "LastName", "Email", "PhoneNumber"]
ws.append(headers)

# Add data rows
data = [
    ["Satvik", "Shah", "satshah@example.com", 4537829158],
    ["Avinash", "Kati", "avinashk@example.com", 5892184058],
    ["Lahri", "Rath", "lahri.rath@example.com", 4528727830]
]

for row in data:
    ws.append(row)

# Save the workbook to a file
wb.save("contacts.xlsx")

print("Excel file 'contacts.xlsx' has been created.")
