# 📚 Java Library Management System

A **Library Management System** built using **Java**, designed to simplify the management of books, students, and borrowing records.
This project demonstrates strong use of **Object-Oriented Programming (OOP)** principles, **file handling**, and **collection frameworks** in Java.

---

## 🚀 Overview

This console-based system enables users to efficiently manage library operations such as adding books, registering students, issuing and returning books, and viewing all records.
It’s ideal for understanding how core Java can be used to build real-world, menu-driven applications.

---

## 🧩 Features

### 📘 Book Management

* Add new books with details like title, author, ISBN, and quantity
* View all available books
* Update or remove existing books
* Track book availability during issue and return

### 🎓 Student Management

* Add, view, update, or delete student details
* Assign unique IDs to students for tracking

### 📦 Transaction Management

* Issue books to students and update stock
* Return books and mark them as available
* Prevent issuing unavailable books

### 🔍 Search & View

* Search for books by title, author, or ISBN
* Display detailed student and transaction records

---

## 🛠️ Technologies Used

| Category        | Tools / Technologies                               |
| --------------- | -------------------------------------------------- |
| Language        | Java                                               |
| Concepts        | OOP (Classes, Objects, Inheritance, Encapsulation) |
| Collections     | ArrayList, HashMap                                 |
| I/O Handling    | FileReader, FileWriter, BufferedReader             |
| IDE (Optional)  | IntelliJ IDEA / Eclipse / VS Code                  |
| Version Control | Git & GitHub                                       |

---

## 🧠 Learning Objectives

This project helps you learn:

* Core Java programming and modular design
* Exception handling and input validation
* Data persistence using files
* CRUD (Create, Read, Update, Delete) operations
* Working with ArrayList and file streams

---

## 🗂️ Project Structure

```
Java-Library-Management/
│
├── LibraryManagementSystem.java     # Main class containing menu and logic
├── Book.java                        # Class representing book details
├── Student.java                     # Class representing student details
├── IssueRecord.java                 # Class for issue/return tracking
├── data/                            # Folder for storing persistent text files
│   ├── books.txt
│   ├── students.txt
│   └── issues.txt
└── README.md                        # Project documentation
```

---

## 🧾 Example Output

```
====== LIBRARY MANAGEMENT SYSTEM ======
1. Add Book
2. View Books
3. Add Student
4. View Students
5. Issue Book
6. Return Book
7. Exit
Enter your choice: 1
Enter Book Title: Java Programming
Enter Author Name: James Gosling
Enter ISBN: 9780135166307
Enter Quantity: 5
Book added successfully!

====== LIBRARY MANAGEMENT SYSTEM ======
Enter your choice: 2
Available Books:
1. Java Programming by James Gosling (Qty: 5)
```

---

## ⚙️ How to Run the Project

### Step 1 — Clone the Repository

```bash
git clone https://github.com/MounikaT22/Java-Library-Management.git
cd Java-Library-Management
```

### Step 2 — Compile the Program

```bash
javac LibraryManagementSystem.java
```

### Step 3 — Run the Application

```bash
java LibraryManagementSystem
```

### Step 4 — Interact via Menu

Use the numeric menu options to add, view, issue, or return books.

---

## 🧩 Future Enhancements

* 💾 Add database integration (MySQL / SQLite) instead of file storage
* 🖥️ Build a GUI using **JavaFX** or **Swing**
* 📅 Implement due dates and late fee calculation
* 🔐 Add login system for librarians
* 🌐 Create a web version using Java Servlets or Spring Boot

---

## 💡 Key Takeaways

* Strengthens your understanding of **Java OOP and collections**
* Practical use of **file handling and serialization**
* Introduces **real-world problem-solving** through structured logic
* Builds a foundation for **advanced systems** like DB-backed or GUI apps

---

## 👩‍💻 Author

**Mounika T**
💼 Aspiring Java Developer | Backend & Database Enthusiast
🔗 [GitHub Profile](https://github.com/MounikaT22)

---

## 🤝 Contributing

Contributions are welcome!
If you’d like to improve or extend this project:

1. Fork the repository
2. Create a new branch (`feature-branch-name`)
3. Commit your changes
4. Push and open a Pull Request

---

## 🏁 License

This project is open-source and available under the [MIT License](LICENSE).

---

> “A good library is not just about books, but about efficient management — and this project is a step in that direction.” 📖
