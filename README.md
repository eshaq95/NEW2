# Online Bookstore Website

## Project Overview
This project is a full-stack web application for an online bookstore, developed collaboratively as a team project. It uses Java, SQL, HTML, and CSS to create a comprehensive online shopping experience for books.

## Key Features
- User authentication and account management
- Book catalogue with search and filter functionality
- Shopping cart and checkout process
- Admin panel for inventory management
- Responsive design for mobile and desktop

## Technologies Used
- Backend: Java, SQL, Spring Boot
- Frontend: HTML, CSS
- Database: MySQL
- Server: Apache Tomcat
- Version Control: Git
- Project Management: Jira (Agile methodology)

## Team Collaboration
This project was developed as a team effort, utilizing:
- Git for version control, allowing for efficient collaboration and code management
- Jira for implementing Agile methodologies, including sprint planning, task assignment, and progress tracking

## Setup and Installation

To set up and run the project locally, follow these steps:

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/eshaq95/Online-Book-Store-2.git
   cd Online-Book-Store-2
   ```

2. **Install Dependencies**: 
   Ensure Java and Gradle are installed. Install Gradle if needed:
   ```bash
   brew install gradle
   ```
   or follow instructions from the [Gradle website](https://gradle.org/install/).

3. **Build the Project**: 
   ```bash
   ./gradlew build
   ```

4. **Set Up the Database**:
   - Install MySQL and configure the connection.
   - Create a database called `online_book_store`.
   - Update `src/main/resources/application.properties` with database details.

5. **Run the Application**: 
   ```bash
   ./gradlew bootRun
   ```

6. **Access the Application**: 
   Open `http://localhost:8080` in your browser.

## Project Structure

```
Online-Book-Store-2/
│
├── src/
│   ├── main/
│   │   ├── java/                # Java source code
│   │   │   └── com/
│   │   │       └── bookstore/    # Main package for application logic
│   │   ├── resources/
│   │   │   ├── templates/        # Thymeleaf templates for frontend
│   │   │   └── application.properties  # Application configuration
│   └── test/                     # Test files
│
├── build.gradle                  # Gradle build configuration
├── gradlew                       # Gradle wrapper for Linux/Mac
├── gradlew.bat                   # Gradle wrapper for Windows
├── settings.gradle               # Gradle settings
├── README.md                     # Project documentation
└── .gitignore                    # Git ignore file
```

## Future Enhancements
- Implement user reviews and ratings
- Add a recommendation system based on user preferences
- Integrate with external book APIs for an expanded catalogue

## Contributors
- Eshaq Rahmani
- Fellow Students on Group Project
