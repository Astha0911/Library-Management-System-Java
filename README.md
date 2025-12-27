# 📚 Library Management System (Java)

## 📌 Overview
The **Library Management System** is a console-based Java mini project designed to demonstrate the **four pillars of Object-Oriented Programming (OOP)**.  
It allows users to view available books, issue books, and return books through a simple menu-driven interface.

This project is suitable for **college mini-project submission**, **OOP practicals**, and **GitHub portfolio showcase**.

---

## 🎯 Project Objectives
- To understand and implement Object-Oriented Programming concepts
- To design a modular and reusable Java application
- To simulate a real-world library management scenario
- To gain hands-on experience with Core Java

---

## 🧠 OOP Concepts Implemented

### 1️⃣ Encapsulation
- Implemented in the `Book` class
- Data members are private and accessed through public methods

### 2️⃣ Abstraction
- Implemented using the abstract class `User`
- Hides user details and exposes only required behavior

### 3️⃣ Inheritance
- `Student` and `Librarian` classes inherit from `User`
- Promotes code reusability

### 4️⃣ Polymorphism
- Achieved by overriding the `accessLibrary()` method
- Method call is resolved at runtime

---

## ✨ Features
- Add books to the library
- Display all books
- Issue a book
- Return a book
- Menu-driven console interface
- Clean and modular code structure

---

## 🗂 Project Structure
LibraryManagementSystem
│
├── Book.java
├── User.java
├── Student.java
├── Librarian.java
├── Library.java
└── Main.java

---

## 🛠 Technologies Used
- Java (Core Java)
- Object-Oriented Programming (OOP)
- Git & GitHub

---

## ▶ How to Run the Project

### Prerequisites
- Java JDK (version 8 or higher)
- Any Java IDE or Command Prompt

### Steps to Execute
```bash
javac *.java
java Main
🧪 Sample Output
pgsql
Copy code
Student can issue up to 3 books.
Librarian can add or remove books.

===== Library Menu =====
1. Show Books
2. Issue Book
3. Return Book
4. Exit
📖 Use Case Description
Student: Can view and issue books

Librarian: Manages library operations

Library: Handles all book-related activities

🚀 Future Enhancements
User authentication system

Fine calculation for late returns

Database integration using JDBC

Graphical User Interface (JavaFX / Swing)

Role-based access control

👩‍💻 Author
Astha Rai
B.Tech Computer Science (2023–2027)

📜 License
This project is developed for educational purposes and is free to use, modify, and distribute.

---

## ✅ HOW TO ADD THIS TO GITHUB
1. Create a file named **`README.md`**
2. Paste everything above
3. Save the file
4. Run:
```bash
git add README.md
git commit -m "Added complete README"
git push
