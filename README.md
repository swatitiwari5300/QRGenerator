# QR Code Generator with Java

A simple yet powerful **Java-based QR Code Generator** built using Spring Boot, allowing users to create QR codes with custom content, unique file names, and instant file opening. This project is designed to provide a user-friendly solution for generating QR codes dynamically while keeping the code clean and flexible.

## Features

- *Dynamic QR Code Generation*: Generate QR codes from any text or URL.
- *Unique File Names*: Automatically includes a UUID in the file name to prevent conflicts.
- *Automatic File Open*: After the QR code is generated, it automatically opens using your system's default image viewer.
- *Customizable*: Easily extendable to add features like custom sizes, error correction, and color options.
  
## Technologies Used

- *Java** (JDK 8 or higher)
- *QRGen Library* (for QR code generation)
- *Desktop API* (to automatically open the generated QR code)

## Getting Started

### Prerequisites

Make sure you have the following tools installed:
- Java Development Kit (JDK) 8 or higher
- Maven for dependency management

### Installation

1. **Clone this repository**.
2. **Build the project**.
3. **Run the application**.

### Usage

Once the application is running, follow these steps:

1. **Enter a base file name** (without extension).
2. **Enter the content** you want to encode in the QR code (text or URL).
3. The QR code will be saved in the `./QRCodes/` directory with a unique file name that includes a UUID.
4. The QR code will automatically open in your system’s default image viewer.

### Example

Enter the file name (without extension): CodingChallenge
Enter the content for the QR code: Coding challenge: Build your own QR code generator

![image](https://github.com/user-attachments/assets/c435f8ea-8bce-4c73-9d1a-b7ee9aecf281)

