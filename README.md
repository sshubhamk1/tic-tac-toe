# 🎮 Tic-Tac-Toe (Java Implementation)

A simple yet optimized Tic-Tac-Toe game implemented in Java.
This version introduces a unique constraint — it **stores only the last 8 moves**, ensuring that the game always reaches a **definitive result**.

---

## 🚀 Features

* ✅ Classic 3x3 Tic-Tac-Toe gameplay
* ✅ Two-player mode (X vs O)
* ✅ Optimized memory usage (stores only last 8 moves)
* ✅ Guaranteed game result (no indefinite draws due to move overflow)
* ✅ Clean and modular Java implementation

---

## 🧠 Concept: Why Only Last 8 Moves?

In a standard Tic-Tac-Toe game:

* Maximum moves = 9
* A draw happens when all 9 cells are filled

### 🔥 Optimization Idea:

This implementation stores **only the last 8 moves**.

### 💡 How it works:

* Once the 9th move is made:

  * The **oldest move is removed**
  * The board dynamically updates
* This avoids stale board states and ensures:

  * Continuous gameplay
  * A **guaranteed win condition eventually emerges**

---

## 🕹️ How to Play

1. Run the Java program
2. Players take turns:

   * Player 1 → `X`
   * Player 2 → `O`
3. Enter row and column positions
4. The game:

   * Updates the board
   * Maintains only the last 8 moves
5. First player to align 3 symbols wins

---

## 🛠️ Tech Stack

* **Language:** Java
* **Concepts Used:**

  * Object-Oriented Programming (OOP)
  * Queue / Sliding Window (for last 8 moves)
  * Game State Management

---


---

## ⚙️ How to Run

### 1. Compile

```bash
javac *.java
```

### 2. Run

```bash
java Game
```

---

---

## 🎯 Future Enhancements

* 🤖 Add AI (Minimax algorithm)
* 🌐 Multiplayer support
* 🎨 GUI (JavaFX / Swing)
* 📊 Game statistics tracking

---

## 📌 Key Takeaway

This project demonstrates how applying a **sliding window technique** to game state management can:

* Optimize memory
* Prevent infinite states
* Guarantee game completion

---

## 👨‍💻 Author

**Shubham Kumar**

