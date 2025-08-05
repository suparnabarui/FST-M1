from selenium import webdriver
from selenium.webdriver.common.by import By
import time

# Set up the WebDriver (make sure the correct driver is installed and in PATH)
driver = webdriver.Chrome()  # You can also use Firefox, Edge, etc.

try:
    # Step 1: Open the training support site
    driver.get("https://training-support.net")

    # Step 2: Print the title of the homepage
    print("Home Page Title:", driver.title)

    # Step 3: Click the 'About Us' button
    about_us_button = driver.find_element(By.CSS_SELECTOR, "a.card")
    about_us_button.click()

    # Optional: Wait for the new page to load
    time.sleep(2)

    # Step 4: Print the title of the new page
    print("About Us Page Title:", driver.title)

finally:
    # Close the browser
    driver.quit()
