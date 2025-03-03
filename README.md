# Invoice Calculation System

This project is a simple program written in Java that calculates the electricity invoices for a set of flats based on their consumption and a total bill amount. The program distributes the total bill among the flats according to a defined model.

### Features:
- **Calculate Invoices**: The program calculates the invoice amount for each flat based on their individual electricity consumption.
- **Bill Distribution**: The total bill is divided into two parts: 
  - 30% is divided equally among all flats.
  - 70% is divided based on each flat's electricity consumption relative to the total consumption.

### How It Works:
1. **Input:**
   - The program takes the number of flats (`N`).
   - Then, it takes the electricity consumption for each flat.
   - Finally, it takes the total bill amount that needs to be distributed.
   
2. **Processing:**
   - The program calculates 30% of the total bill to be shared equally among all flats.
   - It calculates the remaining 70% based on each flat’s electricity consumption.
   
3. **Output:**
   - For each flat, the program calculates and prints the amount they need to pay based on their electricity usage.

### Example:
For example, if there are 3 flats with consumption values `100`, `200`, and `300`, and the total bill is `600`, the program will output how much each flat needs to pay, based on the formula explained above.

### Technologies Used:
- **Java**: Programming language used for development
- **Scanner**: For user input

### How to Run:
1. Compile the program:
   ```bash
   javac HW4_Q1_150121069.java
