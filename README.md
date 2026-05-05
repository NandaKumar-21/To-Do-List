# ✅ To-Do List Application

A simple yet functional **command-line To-Do List application** built in Java. Manage your tasks efficiently right from the terminal - add, view, delete, and mark tasks as complete or pending.

---

## 📋 Features

* **Add Tasks** - Create new tasks with auto-incremented IDs
* **View Tasks** - Display all tasks along with their completion status
* **Delete Tasks** - Remove tasks by their ID using safe iterator-based deletion
* **Toggle Completion** - Mark tasks as Completed or revert them back to Pending

---

## 🛠️ Tech Stack

| Technology | Details                      |
| ---------- | ---------------------------- |
| Language   | Java                         |
| JDK        | 8 or above                   |
| IDE        | IntelliJ / Eclipse / VS Code |
| Build Tool | None (plain Java)            |

---

## 🚀 Getting Started

### Prerequisites

* Java JDK 8 or higher installed
* A terminal / command prompt

### Clone the Repository

```bash
git clone https://github.com/your-username/todo-list-java.git
cd todo-list-java
```

### Compile

```bash
javac org/example/Main.java
```

### Run

```bash
java org.example.Main
```

---

## 🖥️ Usage

Once the application starts, you'll be presented with a menu:

```
----- TO-DO LIST APPLICATION -----
 1. Add Task
 2. View Tasks
 3. Delete Task
 4. Mark Task as Complete
```

Enter the number corresponding to the action you'd like to perform and follow the on-screen prompts.

### Example Session

```
----- TO-DO LIST APPLICATION -----
 1. Add Task
> 1
Enter task name:
> Buy groceries
Task added successfully

----- TO-DO LIST APPLICATION -----
 2. View Tasks
> 2
----- Tasks -----
1. Buy groceries [Pending]

----- TO-DO LIST APPLICATION -----
 4. Mark Task as Complete
> 4
Enter task ID to mark complete/pending:
> 1
Marked 1 as Completed
```

---

## 📁 Project Structure

```
todo-list-java/
│
└── org/
    └── example/
        ├── Task.java       # Task model class
        └── Main.java       # Main application logic
```

---

## 🔮 Future Improvements

* [ ] Save tasks to a file (persistent storage)
* [ ] Add task priority levels (High / Medium / Low)
* [ ] Set due dates and deadlines for tasks
* [ ] Filter tasks by status (Completed / Pending)
* [ ] Migrate to a GUI using Java Swing or JavaFX

---

## 👤 Author

**Nanda Kumar**

* GitHub: https://github.com/NandaKumar-21

---

> *Built with ☕ Java and a love for clean code.*
