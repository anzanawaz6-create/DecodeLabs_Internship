# DecodeLabs_Internship
# Number Guessing Game — Java

A console-based number guessing game built as **Project 1** for the **DecodeLabs Java Programming Internship (Batch 2026)**.

## 📌 Description
This program generates a random number between 1–100 and lets the user guess it. After each guess, the program gives feedback ("Too High" or "Too Low") until the user finds the correct number or runs out of attempts.

## ✨ Features
- Random number generation using `java.util.Random`
- User input handling via `Scanner`
- Real-time feedback loop (Too High / Too Low)
- Limited attempts (3 tries)
- Exception handling for invalid input (`InputMismatchException`)

## 🛠️ Concepts Used
- Control flow (loops & conditionals)
- Java utility classes (`Random`, `Scanner`)
- Exception handling
- Basic game logic design

## 🚀 How to Run
1. Clone this repository
2. Compile: `javac DecodeLabs_Java_P1.java`
3. Run: `java DecodeLabs_Java_P1`

---

# Project 2: Student Grade Calculator — Java

The second project in the **DecodeLabs Java Programming Internship (Batch 2026)**. This project shifts focus from randomness (Project 1) to **precise, deterministic data processing** — taking multiple inputs, performing accurate calculations, and classifying results based on fixed business rules.

## 📌 Description
This console-based Java program takes marks for a user-defined number of subjects, calculates the total and average percentage, and assigns a letter grade accordingly. The program validates every input as it's entered — rejecting and re-prompting for any mark outside the valid 0–100 range — ensuring the final calculation is always based on clean, reliable data.

Special care was taken to avoid a common Java pitfall: **integer division truncation**. By explicitly casting the total to `double` before dividing, the program preserves decimal precision instead of silently rounding the average down to a whole number. Output is formatted using `printf` with a fixed 2-decimal precision for a clean, professional result.

## ✨ Features
- Accepts marks for any number of subjects (user-defined)
- Real-time input validation with re-prompting (rejects marks outside 0–100)
- Accurate average calculation using explicit type casting
- Grade assignment based on a strict conditional ladder (A/B/C/D)
- Clean, formatted output using `printf`

## 🛠️ Concepts Used
- Loops (`for`, `do-while`)
- Conditional logic and defensive input validation
- Type casting (`int` to `double`) to preserve precision
- Formatted output (`printf` with `%.2f`)
- Accumulator pattern for scalable data processing

## 🚀 How to Run
1. Clone this repository
2. Compile: `javac DecodeLabs_Java_P2.java`
3. Run: `java DecodeLabs_Java_P2`
   
## 👩‍💻 Author
**Anza Nawaz**
BS Software Engineering Student, University of Central Punjab (UCP)

