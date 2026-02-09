# people-registry

A simple desktop application built in **Java** using **JavaFX** and **SQLite** to manage people records.

## Features
- Create, update, delete, and view people
- Persistent local storage using SQLite
- Automatic age calculation from date of birth
- Filtering and search on multiple fields

## Data Model
Each person contains:
- Name, Surname, Nickname
- Mobile number (with country code)
- Blood type
- LRC ID (unique)
- Address
- Email
- Date of birth (age computed automatically)

## Tech Stack
- Java 17
- JavaFX
- SQLite (JDBC)
- Maven

## Project Status
In progress 

## How to Run
```bash
mvn javafx:run
