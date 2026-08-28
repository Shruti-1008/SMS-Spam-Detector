# SMS Spam Detector

A simple Java-based spam detection project that classifies SMS messages as **SPAM** or **NOT SPAM**.

## Technologies Used:
these are the tech used for this proj
```
- Java
- Java Standard Library
```

## How It Works

The program checks an input message for common spam-related keywords such as:

- free
- win
- prize
- offer
- money
- urgent

Each matching word increases the **Spam Score**.

If the score is 2 or more, the message is classified as **SPAM**. Otherwise, it is classified as **NOT SPAM**.

## Example:

### Input:

Congratulations! You won a free prize!

### Output:

Prediction: SPAM
Spam Score: 3

## How to Run:

Compile:

```bash
javac SpamDetector.java
