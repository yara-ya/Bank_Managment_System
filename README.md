````markdown
# ATM Banking System (Java)

A professional **ATM Banking System** developed in Java as part of an Information Systems course. This system simulates real ATM operations in a structured, secure, and user-friendly manner, demonstrating essential banking functionalities while applying core information systems concepts.

---

## 🔹 Key Features

- **Secure User Authentication:** Login using card number and PIN.  
- **Account Management:** View and update client personal and account details.  
- **Transactions:** Deposit, withdraw, and check account balance.  
- **Fast Cash:** Quick withdrawals with predefined amounts.  
- **Mini Statement:** Display recent transaction history.  
- **Automatic Balance Updates:** All transactions instantly update the account balance.  
- **Client Data Management:** View and update client information securely.  
- **PIN Change:** Allows users to change their ATM PIN for enhanced security.

---

## 🔹 Tools & Technologies

- **Programming Language:** Java (Core Java)  
- **Database:** MySQL  
- **UML Diagrams:** Use Case, Sequence, ERD  
- **IDE:** NetBeans / IntelliJ IDEA  
- **Version Control:** Git & GitHub

---

## 🔹 Setup & Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/username/ATM-Banking-System.git
````

2. **Database Setup:**

   * The project contains a `Database/` folder with the database file.
   * Install **MySQL** if not already installed.
   * Import the database file into your MySQL server.

3. **Configure Database Connection:**

   * Open `Connection.java` and update the credentials:

     ```java
     String username = "YOUR_USERNAME";
     String password = "YOUR_PASSWORD";
     ```
   * Update credentials in any other files that use the database (e.g., `MiniStatement.java`).
   * Ensure the database connection matches your MySQL setup.

4. **Run the Project:**

   * Open the project in **NetBeans** or **IntelliJ IDEA**.
   * Run the `Main.java` file.

---




