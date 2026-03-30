<img width="1080" height="2400" alt="image" src="https://github.com/user-attachments/assets/3ad340a0-de6c-4cb2-afba-cd14cefecbf0" /># emwccn-imad5112-2026-assignment-1-osamahRM7
emwccn-imad5112-2026-assignment-1-osamahRM7 created by GitHub Classroom

# Social Sparks 
**A Context-Aware Social Engagement Utility for Android**

##  Overview
Social Sparks is an Android application designed to bridge the gap in social communication. By providing users with time-sensitive "sparks" (actionable social prompts), the app encourages consistent interaction with friends, family, and colleagues throughout the day


###  Architecture & Implementation

### **1. Presentation Layer (UI)**
The user interface is built using a **nested layout strategy** to ensure responsiveness and clarity:
* **ConstraintLayout:** Used as the root container to optimize performance and view positioning.
* **LinearLayout (Vertical):** Organizes the interactive elements in a clean, readable stack.
* **Input Field:** Uses a hint-driven `EditText` to guide user entry.
* **Dual Action Buttons:** * `btnSuggest`: Executes the logic engine.
    * `btnReset`: Flushes the current state for a fresh user experience.

<img width="800" height="500" alt="image" src="https://github.com/user-attachments/assets/1cc62375-ed0d-431d-b66b-cf5f8f3be0ac" />


### **2. Behavioral Logic (Kotlin)**
The backend logic focuses on **Input Sanitization** and **Decision Mapping**:
* **Data Normalization:** The app processes strings using `.trim().lowercase()` to ensure that user-end typos (like extra spaces or capitalization) do not break the logic.
* **Control Flow:** A deterministic `if-else` structure maps six distinct timeframes (Morning, Mid-Morning, Afternoon, Mid-Afternoon, Dinner, Night) to specific social outcomes.
* **Error Handling:** Includes a fallback "Else" case to catch invalid inputs and provide corrective feedback to the user.

* <img width="500" height="800" alt="image" src="https://github.com/user-attachments/assets/66de3904-f65b-433e-919d-c79b3cbc6e58" />

### **3. Developer Diagnostics**
For monitoring and debugging, the app integrates the `android.util.Log` class:
* **Debug Logs:** Track successful user inputs.
* **Warning Logs:** Capture and record invalid entries to help refine the suggestion engine in future updates.

* <img width="500" height="800" alt="image" src="https://github.com/user-attachments/assets/f828a826-f4cb-470b-ade7-aecedb39efa3" />






