# Power Billing System(GUI)

## Project Overview

The **Electricity Billing System** is a Java-based desktop application developed using **Java Swing** and **Object-Oriented Programming (OOP)** principles. The system automates electricity bill calculation, user authentication, online payment simulation, and PDF receipt generation.

This project is designed to simplify the billing process by reducing manual calculations and providing a user-friendly graphical interface for consumers and administrators.


## Features

### User Authentication

* User Registration
* Secure Login System
* Password Storage with Hashing
* Duplicate Username Validation

### Electricity Bill Calculation

* Domestic Tariff Calculation
* Commercial Tariff Calculation
* Energy Charge Calculation
* Meter Rent Calculation
* Demand Charge Calculation
* VAT Calculation
* Automatic Total Bill Generation

### Online Payment System

* bKash Payment Simulation
* Nagad Payment Simulation
* Card Payment Simulation
* Transaction ID Generation
* Payment Status Tracking
* Back Option for Payment Method Selection

### PDF Receipt Generation

* Automatic Receipt Generation
* Consumer Information
* Reading Information
* Billing Details
* Payment Information
* Transaction Details


## Technologies Used

* Java
* Java Swing (GUI)
* Object-Oriented Programming (OOP)
* File Handling
* iText PDF Library


## Project Structure

billing
│
├── Main.java
├── User.java
├── FileManager.java
├── AuthService.java
├── LoginGUI.java
├── RegisterGUI.java
├── EBill.java
├── BillGUI.java
├── PaymentGUI.java
├── PDFGenerator.java
└── users.txt



## System Workflow

Start Application
        │
        ▼
     Login
        │
        ▼
    Register
 (if needed)
        │
        ▼
 Generate Bill
        │
        ▼
 Calculate Charges
        │
        ▼
    Pay Bill
        │
        ▼
 Payment Success
        │
        ▼
 Generate PDF Receipt



## Bill Components

The electricity bill includes:

* Energy Charge
* Meter Rent
* Demand Charge
* VAT (5%)
* Total Bill Amount


## Payment Methods

The system currently supports:

* bKash
* Nagad
* Card Payment

After successful payment, a unique transaction ID is generated and stored in the receipt.


## PDF Receipt Information

The generated receipt contains:

* Consumer Number
* Consumer Name
* Previous Reading
* Current Reading
* Connection Type
* Energy Charge
* Meter Rent
* Demand Charge
* VAT
* Total Bill
* Payment Method
* Transaction ID
* Payment Status

---

## Object-Oriented Concepts Used

* Encapsulation
* Abstraction
* Class and Object
* Method Implementation
* Data Hiding


## Future Improvements

* Database Integration (MySQL)
* Real Payment Gateway Integration
* Admin Dashboard
* Bill History Tracking
* Email Receipt Service
* Report Generation System


## Conclusion

The Electricity Billing System provides a complete solution for electricity bill calculation, payment processing, and receipt generation. The project demonstrates practical implementation of Java GUI development, file handling, OOP concepts, and PDF generation techniques in a real-world billing application.
