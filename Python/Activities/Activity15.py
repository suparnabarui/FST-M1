try:
    # This will cause a NameError because 'my_var' is not defined
    print(my_var)
except NameError:
    print("Oops! You tried to use a variable that hasn't been defined.")

print("Program is still running after handling the error.")
