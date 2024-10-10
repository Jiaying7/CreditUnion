# Credit Union Account Management System

This project is a **Java-based Credit Union Account Management System**. It allows users to register, open accounts, and manage account details. The project follows a modular structure with unit testing for core functionalities, using **JUnit** for testing.

## Project Structure

- **Account.java**: Manages the details of a user's account, including the balance, account type, and transaction history.
- **OpenAccount.java**: Handles the process of opening a new account for users, including validation and assigning account numbers.
- **Register.java**: Facilitates the registration of new users, capturing personal details required for account creation.
- **User.java**: Represents the user of the system, storing their personal information, and linking them to their respective accounts.
- **OpenAccountTest.java**: Unit test class that ensures the correct functioning of the `OpenAccount` logic.
- **RegisterTest.java**: Unit test class that validates the user registration process.
- **pom.xml**: Maven project configuration file, managing dependencies such as JUnit for testing.

## Features

### 1. User Registration
- Allows users to register with personal details such as name, email, and identification details.
- User information is validated and stored securely.

### 2. Open Account
- Registered users can open different types of accounts (e.g., savings, checking).
- Each account is assigned a unique account number.

### 3. Account Management
- Users can view account details including balance and transaction history.
- Supports deposits, withdrawals, and balance inquiries.

### 4. Unit Testing
- The project uses **JUnit** and **Hamcrest** for unit testing to ensure the functionality of account creation and user registration processes.

## How to Run

1. **Clone the Repository**:
    ```bash
    git clone https://github.com/YOUR_USERNAME/credit-union-system.git
    ```

2. **Build the Project**:
    Navigate to the project directory and build the project using Maven:
    ```bash
    mvn clean install
    ```

3. **Run the Application**:
    After building, run the application:
    ```bash
    mvn exec:java -Dexec.mainClass="nan.creditunion.CreditUnion"
    ```

4. **Run Unit Tests**:
    To run the unit tests:
    ```bash
    mvn test
    ```

## Dependencies

- **JUnit 4.13.2**: Unit testing framework.
- **Hamcrest 1.3**: Matcher framework for building test assertions.

These dependencies are defined in the `pom.xml` and will be automatically downloaded when the project is built.

## Technologies Used

- **Java 17**: Main programming language.
- **Maven**: Project management and build tool.
- **JUnit**: Testing framework for writing and running tests.
- **Hamcrest**: Provides matchers for writing expressive tests.

## License

This project is licensed under the MIT License.
