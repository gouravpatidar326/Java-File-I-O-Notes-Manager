# NotesApp - Java File I/O Notes Manager

## Overview
NotesApp is a simple command-line Java application to manage text notes. It demonstrates how to use Java File I/O with `FileReader`, `BufferedReader`, and `FileWriter` to persist data into a file named `notes.txt`.

## Features
- View all saved notes.
- Add new notes to the file.
- Uses append mode to keep existing notes intact.
- Handles exceptions such as file not found or IO errors.
- Uses try-with-resources to auto-close streams.

## How to Run

1. Make sure you have Java installed (JDK 8 or later).
2. Compile the program:
javac NotesApp.java
3. Run the compiled program:
java NotesApp
