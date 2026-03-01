NutriTrack: Supermarket Inventory & Nutrition System 🛒
A specialized Java application designed to manage supermarket inventory while tracking nutritional components. This project demonstrates advanced Object-Oriented Programming (OOP), specifically handling data composition and category-specific logic.

📂 Project Structure
GroceryProduct.java: The Main Entry Point. This class coordinates the application logic and serves as the primary interface for managing grocery items.

DairyProduct.java: A specialized class for dairy inventory, likely incorporating specific handling for dairy-related data.

Beverages.java: Handles beverage inventory, focusing on liquid-based product attributes.

Fat.java: A component class/interface used to track and calculate fat content across different food categories.

Sugarlevel.java: A specialized module for monitoring sugar content, crucial for modern nutritional labeling in retail systems.

🛠️ Technical Implementation
Composition & Modular Design: Instead of bulky classes, nutritional data is separated into Fat and Sugarlevel modules, following the Single Responsibility Principle.

Inheritance: Demonstrates specialized product behavior through DairyProduct and Beverages.

Encapsulation: Protects sensitive inventory and nutritional data using private fields and public getter/setter methods.

Java Standard Library: Optimized use of java.util.* and java.io.* for data management and input handling.

💻 How to Run
Ensure you have Java JDK installed.

Place all 5 .java files into a src folder.

Open your terminal and navigate to the folder.

Compile all files:


javac GroceryProduct.java DairyProduct.java Beverages.java Fat.java Sugarlevel.java
Run the application:


java GroceryProduct
