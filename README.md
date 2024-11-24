
# 🔗 Java URL Shortener

A lightweight Java program to convert an integer ID into a short URL and decode it back to the original ID. This program demonstrates the use of **Base-62 encoding** to generate unique and compact short URLs.

## 🌟 Features
- 🔢 **Encode**: Convert an integer ID into a compact short URL.
- 🔄 **Decode**: Retrieve the original ID from the short URL.
- 💻 **Efficient**: Uses Base-62 encoding with characters `a-z`, `A-Z`, and `0-9`.
- 🧩 **Simple & Modular**: Clear, well-commented code for easy understanding.

## 📂 How to Use

### Prerequisites
- **Java Development Kit (JDK)** installed.
- A Java IDE like IntelliJ IDEA, Eclipse, or VS Code, or use the terminal.

### Steps to Run the Program
1. Clone the repository:
   ```bash
   git clone https://github.com/your-github-username/java-url-shortener.git
   cd java-url-shortener
   ```
2. Open the project in your favorite Java IDE.
3. Compile and run the program:
   ```bash
   javac URLShortener.java
   java URLShortener
   ```
4. Observe the output:
    - The short URL generated from the given ID.
    - The decoded ID from the short URL.

## 📖 Code Overview
This program has two main functions:
1. `idToShortURL(int n)`:
    - Converts an integer ID into a Base-62 encoded string.
    - Uses characters `a-z`, `A-Z`, and `0-9` for encoding.
2. `shortURLtoID(String shortURL)`:
    - Decodes the short URL back into the original integer ID.
    - Handles lowercase, uppercase, and numeric characters.

## 🚀 Example Output
Given an integer ID of `12345`:
```
Generated short URL is: dnh
ID from the short URL is: 12345
```

## 🤝 Contributing
We welcome contributions to improve this project!  
Before contributing, please refer to the [LICENSE](https://github.com/Purohit1999/URL-Shortener/blob/main/LICENSE) file for guidelines.

### 👤 Contact
- **LinkedIn**: [Your LinkedIn Profile](https://www.linkedin.com/in/param-p-370616310/)
- **GitHub**: [Your GitHub Profile](https://github.com/Purohit1999)

## ⭐ Show Your Support
If you like this project or found it helpful, please consider giving it a **⭐ star** on GitHub. It motivates us to improve and build more projects like this!

---

Made with ❤️ by [Param Purohit](https://github.com/Purohit1999).
```

