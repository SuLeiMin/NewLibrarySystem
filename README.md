# Library Management System

This is a Library Management System built with the following tech stack:

## テックスタック (Tech Stack)

### フロントエンド (Frontend)
- **Thymeleaf**: A modern server-side Java template engine for web and standalone environments.
- **HTML**: For structure and layout of web pages.
- **CSS**: For styling and presentation of the web pages.

### バックエンド (Backend)
- **Java EE**: Enterprise Java for building scalable, multi-tiered, and distributed applications.
- **Spring Boot**: A framework to create stand-alone, production-grade Spring-based applications.
- **Maven**: A build automation tool used for dependency management and project structure.

### データベース (Database)
- **MySQL**: A relational database management system to store and manage the library system’s data.

### ツール (Tools)
- **Eclipse**: An integrated development environment (IDE) used for Java development.
- **DBeaver**: A database management tool to manage and query MySQL databases.

## 機能 (Features)
- **ユーザー管理**: ユーザーの登録、ログイン、編集。
- **本の管理**: 本の追加、編集、削除、検索。
- **書籍の詳細表示**: 本の詳細情報の表示。
  
## セットアップ方法 (Setup)

1. Clone this repository:
    ```bash
    git clone https://github.com/yourusername/LibraryManagementSystem.git
    ```

2. Open the project in Eclipse.

3. Import the Maven dependencies:
    - Right-click the project > `Maven` > `Update Project`.

4. Configure your MySQL database connection in the `application.properties` or `application.yml` file.

5. Run the Spring Boot application:
    - In Eclipse: Right-click the project > `Run As` > `Spring Boot App`.

6. Open your browser and go to:
    ```
    http://localhost:8181
    ```




Feel free to contribute, open issues, or submit pull requests.
