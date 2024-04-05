from selenium import webdriver
from selenium.webdriver.common.by import By
import time
import mysql.connector

def compare_prices(product_name):
    # Initialize Chrome WebDriver
    options = webdriver.ChromeOptions()
    # options.add_argument('--headless')  # Run in headless mode
    driver = webdriver.Chrome(options=options)

    # Open Amazon
    driver.get("https://www.amazon.in/")
    time.sleep(2)  # Wait for the page to load

    # Search for the product on Amazon
    search_box_amazon = driver.find_element(By.ID, "twotabsearchtextbox")
    search_box_amazon.send_keys(product_name)
    search_box_amazon.submit()
    time.sleep(2)  # Wait for search results to load

    # Get the price from Amazon
    try:
        price_amazon_element = driver.find_element(By.XPATH, "//span[@class='a-price-whole']")
        price_amazon = price_amazon_element.text
    except:
        price_amazon = "Price not found on Amazon"

    # Open Flipkart
    driver.get("https://www.flipkart.com/")
    time.sleep(2)  # Wait for the page to load

    # Close login popup if present
    try:
        close_login_popup = driver.find_element(By.XPATH, "//button[@class='_2KpZ6l _2doB4z']")
        close_login_popup.click()
    except:
        pass

    # Search for the product on Flipkart
    search_box_flipkart = driver.find_element(By.XPATH, "//input[@title='Search for products, brands and more']")
    search_box_flipkart.send_keys(product_name)
    search_box_flipkart.submit()
    time.sleep(2)  # Wait for search results to load

    # Get the top 5 prices from Flipkart
    flipkart_prices = []
    try:
        flipkart_prices_elements = driver.find_elements(By.XPATH, "//div[@class='_30jeq3']")
        for element in flipkart_prices_elements[:5]:
            price = element.text
            flipkart_prices.append(price)
    except:
        flipkart_prices = ["Price not found on Flipkart"] * 5

    # Close the browser window
    driver.quit()

    return {"Amazon": price_amazon, "Flipkart": flipkart_prices}

# Establish connection with MySQL
mydb = mysql.connector.connect(
  host="localhost",
  user="root",
  password="Sandhya@05",
  database="WeShop"
)
mycursor = mydb.cursor()

# Function to insert data into MySQL
def insert_data(product_name, amazon_price, flipkart_prices):
    sql = "INSERT INTO product_prices (product_name, amazon_price, flipkart_prices) VALUES (%s, %s, %s)"
    val = (product_name, amazon_price, ', '.join(flipkart_prices))
    mycursor.execute(sql, val)
    mydb.commit()
    print("Data inserted successfully!")

# Example usage
product_name = "iPhone 12"
prices = compare_prices(product_name)
print("Prices for", product_name, ":\nAmazon:", prices["Amazon"], "\nFlipkart:", prices["Flipkart"])

# Insert data into MySQL
insert_data(product_name, prices["Amazon"], prices["Flipkart"])
