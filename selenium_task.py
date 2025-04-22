from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
import pandas as pd
import time

service = Service('C:/Users/nadee/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe')  # Use full path if not in current directory
driver = webdriver.Chrome(service=service)

url = 'http://books.toscrape.com/catalogue/page-1.html'
driver.get(url)

books = driver.find_elements(By.CLASS_NAME, 'product_pod')

book_data = []

for book in books:
    title = book.find_element(By.TAG_NAME, 'h3').find_element(By.TAG_NAME, 'a').get_attribute('title')
    price = book.find_element(By.CLASS_NAME, 'price_color').text
    availability = book.find_element(By.CLASS_NAME, 'instock').text.strip()
    rating = book.find_element(By.CLASS_NAME, 'star-rating').get_attribute('class').split()[-1]
    
    book_data.append({
        'Title': title,
        'Price': price,
        'Availability': availability,
        'Rating': rating
    })

driver.quit()

df = pd.DataFrame(book_data)
df.to_csv('books_selenium2.csv', index=False)

print("Book data saved to 'books_selenium2.csv'")