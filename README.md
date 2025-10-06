# Java Course Registration System

## 📄 Description
This project implements a **university course registration system** that manages students, professors, and courses using **object-oriented programming principles** in Java. It demonstrates class hierarchies, interfaces, exception handling, and file input/output (I/O) operations.

---

## 🧱 Features
- Create and manage courses, students, and professors.
- Enroll or drop students from courses.
- Handle exceptions such as course capacity limits and unmet prerequisites.
- Save and load registration data using file I/O.

---

## 🧩 Class Structure

### 1. Class Hierarchy
- **`Person` (abstract class)** — Base class with attributes like ID, name, and email.
- **`Student` (extends Person)** — Includes major, GPA, and completed courses.
- **`Professor` (extends Person)** — Includes department and courses taught.
- **`Course` (abstract)** — Base course class extended by:
  - `LectureCourse`
  - `LabCourse`

### 2. Interfaces
- **`Registrable`** — Defines methods for enrolling and dropping courses.
- **`Gradable`** — Handles grading operations.

### 3. Registration System
- **`RegistrationSystem`** — Manages all students, professors, and course registrations.
- Includes methods for:
  - Adding/removing students and courses
  - Enrolling/dropping students
  - Validating prerequisites

### 4. Exception Handling
- **`CourseFullException`** — Thrown when a course reaches maximum capacity.
- **`PrerequisiteNotMetException`** — Thrown when a student lacks prerequisite courses.

### 5. File I/O
- Saves and loads registration data to/from files.
- Handles file-related exceptions for data persistence.

---

## ⚙️ Technologies Used
- **Language:** Java  
- **IDE:** Eclipse  
- **Concepts Practiced:**  
  - Abstraction and Inheritance  
  - Interfaces and Polymorphism  
  - Exception Handling (Custom Checked Exceptions)  
  - File Input/Output (Serialization & Text Files)

---

## ▶️ How to Run
1. **Clone the Repository**
   ```bash
   git clone https://github.com/LeonHarb/Java-Course-Registration-System.git
   cd Java-Course-Registration-System
