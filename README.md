# 🎓 Student Record Management System

### Using Java Generics and Collections Framework

## 📌 Overview

This project implements a **Student Record Management System** using **Java Generics** and the **Java Collections Framework**. The system demonstrates how generic programming and collection data structures can be used to build a **flexible, reusable, and type-safe** application.

The system stores and manages student information such as **Student ID, Name, GPA, and Gender**. It also performs operations like **sorting student records, searching for students, and grouping students by gender**.

This project is designed as a practical implementation of **Generics and Collections concepts in Java**.

---

# ✨ Features

The system supports the following functionalities:

* 📦 **Generic Data Storage**

  * Uses a generic class `DataStore<T>` to store objects of any type.

* 📊 **Student Record Management**

  * Stores student information including:

    * Student ID
    * Name
    * GPA
    * Gender

* 🔽 **Sorting**

  * Sorts student records based on **GPA** using a `Comparator`.

* 🔍 **Search Functionality**

  * Search for a student using **Student ID**.

* 🧑‍🤝‍🧑 **Grouping**

  * Groups students by **Gender** using a `Map<String, List<Student>>`.

---

# 🛠 Technologies Used

| Technology                 | Purpose                                          |
| -------------------------- | ------------------------------------------------ |
| Java                       | Programming Language                             |
| Java Generics              | Type-safe reusable classes                       |
| Java Collections Framework | Data structures for storing and managing records |
| ArrayList                  | Dynamic list of students                         |
| Map / HashMap              | Grouping students                                |
| Comparator                 | Sorting students by GPA                          |

---

# 📂 Project Structure

```
StudentRecordSystem
│
├── Student.java
│   Represents the Student model (ID, Name, GPA, Gender)
│
├── DataStore.java
│   Generic class to store and retrieve objects
│
├── Main.java
│   Contains program logic, sorting, searching, and grouping
│
└── README.md
```

---

# ⚙️ How It Works

### 1️⃣ Store Student Records

The program creates several student objects and stores them using a **generic DataStore class**.

```java
DataStore<Student> store = new DataStore<>();
store.add(new Student(1, "Rahim", 3.75, "Male"));
```

---

### 2️⃣ Sort Students by GPA

Students are sorted using a **Comparator**.

```java
students.sort(Comparator.comparingDouble(Student::getGpa));
```

---

### 3️⃣ Search for a Student

The system searches for a student using their **Student ID**.

```java
Student found = searchStudent(students, 3);
```

---

### 4️⃣ Group Students by Gender

Students are grouped using a **Map** where:

* **Key** → Gender
* **Value** → List of students

```java
Map<String, List<Student>> grouped = groupByGender(students);
```

---

# ▶️ Example Output

```
Sorted by GPA:
ID: 2 Name: Karim GPA: 3.5 Gender: Male
ID: 4 Name: Fatima GPA: 3.6 Gender: Female
ID: 1 Name: Rahim GPA: 3.75 Gender: Male
ID: 3 Name: Ayesha GPA: 3.9 Gender: Female

Search Result:
ID: 3 Name: Ayesha GPA: 3.9 Gender: Female

Grouped by Gender:

Male:
ID: 2 Name: Karim GPA: 3.5 Gender: Male
ID: 1 Name: Rahim GPA: 3.75 Gender: Male

Female:
ID: 4 Name: Fatima GPA: 3.6 Gender: Female
ID: 3 Name: Ayesha GPA: 3.9 Gender: Female
```

---

# 🚀 How to Run

### 1️⃣ Clone the repository

```bash
git clone https://github.com/yourusername/student-record-system.git
```

### 2️⃣ Navigate to the project folder

```bash
cd student-record-system
```

### 3️⃣ Compile the program

```bash
javac Main.java
```

### 4️⃣ Run the program

```bash
java Main
```

---

# 🎯 Learning Outcomes

Through this project, the following concepts are demonstrated:

* Practical usage of **Java Generics**
* Efficient data handling using **Java Collections**
* Implementation of **sorting using Comparator**
* **Searching algorithms**
* **Grouping data using Map structures**

---

# 📚 Future Improvements

Possible improvements for this project include:

* Adding a **GUI interface**
* Implementing **file or database storage**
* Supporting **update and delete operations**
* Adding **advanced search filters**

---

# 👨‍💻 Author

**Md jahirul Islam Shifat**
Software Engineering Student
Department of Computer Science & Engineering
