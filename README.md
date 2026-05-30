# Network-Based Smart Attendance System

## Overview

The Network-Based Smart Attendance System is a Java-based application that automates attendance recording using network verification. The system checks whether a user is connected to an authorized network before allowing attendance to be marked.

This approach helps institutions reduce manual attendance processes and ensures that attendance can only be recorded from approved locations such as a college campus or laboratory network.

---

## Features

* Automatic IP address detection
* Hostname identification
* Network-based attendance validation
* Attendance allowed only on authorized networks
* Records attendance with timestamp
* Stores attendance data locally in a text file
* Simple console-based interface
* Lightweight and easy to deploy

---

## How It Works

1. The application retrieves the user's IP address and hostname.
2. It verifies whether the IP address belongs to the predefined authorized network.
3. If the user is connected to the approved network:

   * Roll Number is requested.
   * Student Name is requested.
   * Attendance is recorded.
4. Attendance details are stored in `attendance.txt`.
5. If the user is outside the authorized network, attendance is denied.

---

## Technologies Used

* Java
* Core Java
* Java Networking (InetAddress)
* File Handling
* Exception Handling
* Console-Based User Interface

---

## Project Structure

```text
Network-Based-Smart-Attendance-System/
│
├── NetworkAttendance.java
├── attendance.txt
└── README.md
```

---

## Prerequisites

* Java JDK 8 or higher
* Any Java IDE (IntelliJ IDEA, Eclipse, VS Code, NetBeans)

---

## Configuration

Update the allowed network according to your institution's network range.

```java
static String ALLOWED_NETWORK = "192.168.";
```

Examples:

```java
192.168.
```

```java
10.0.
```

```java
172.16.
```

---

## Running the Project

### Compile

```bash
javac NetworkAttendance.java
```

### Run

```bash
java NetworkAttendance
```

---

## Sample Output

```text
Hostname : LAB-PC-01
IP Address : 192.168.1.15

Enter Roll Number: 22CS101
Enter Name: Dinesh

Attendance marked successfully
```

---

## Attendance Record Format

```text
Roll: 22CS101,
Name: Dinesh,
IP: 192.168.1.15,
Host: LAB-PC-01,
Date: Fri May 29 10:15:32 IST 2026
```

---

## Advantages

* Prevents attendance marking from unauthorized networks.
* Provides timestamp-based attendance tracking.
* Easy to maintain and extend.
* Useful for colleges, schools, training centers, and laboratories.

---

## Future Enhancements

* Database integration (MySQL)
* GUI using Java Swing or JavaFX
* QR code-based attendance
* Face recognition integration
* Email notifications
* Attendance reports and analytics
* Web-based dashboard

---

## Learning Outcomes

This project demonstrates:

* Computer Networking Basics
* IP Address Validation
* Java File Handling
* User Input Handling
* Exception Management
* Attendance Automation Concepts

---

## Author

Dinesh M

GitHub Repository:
https://github.com/DINESH0822/Network-Based-Smart-Attendance-System
