#### **Optional Questions:**

1. What is the purpose of Shared Preferences in Android?

   - a) To store large amounts of data in a relational format.
   - b) To store small key-value pairs for user preferences or settings. <- **Answer**
   - c) To store large media files like images and videos.
   - d) To interact with external databases.
   - e) None of the above.

2. Which method is used to save data in Shared Preferences?

   - a) `apply()` <- **Answer**
   - b) `savePreferences()`
   - c) `writePreferences()`
   - d) `store()`
   - e) `commit()`

3. How can you remove a specific key from Shared Preferences?

   - a) `clearKey()`
   - b) `remove()` <- **Answer**
   - c) `deleteKey()`
   - d) `deletePreference()`
   - e) `removeKey()`

4. Where is data stored when using Shared Preferences?

   - a) External storage
   - b) Internal storage in XML format <- **Answer**
   - c) SQLite database
   - d) In-memory cache
   - e) Cloud storage

5. What data types can be stored in Shared Preferences?
   - a) `String`, `int`, `boolean`
   - b) `String`, `int`, `ArrayList`
   - c) `String`, `int`, `boolean`, `ArrayList`
   - d) `String`, `int`, `float`, `boolean`, `Set<String>` <- **Answer**
   - e) `String`, `float`, `JSONArray`

---

#### **True/False Questions:**

1. Shared Preferences can be used to store complex objects like lists or JSON data.  **false**
2. Data saved in Shared Preferences is lost when the app is closed. **false**
3. `apply()` saves data asynchronously, while `commit()` saves it synchronously. **true**
4. Shared Preferences can store large amounts of data such as images or videos. **false**
5. You can access Shared Preferences from multiple activities in an Android app. **true**

---

#### **Short Answer Questions:**

1. What is the difference between `apply()` and `commit()` in Shared Preferences?
   `apply()` saves data asynchronously, while `commit()` saves it synchronously
2. How would you store a user's login status (true/false) using Shared Preferences in Android?
   ```kotlin
   val sharedPref = getSharedPreferences("user_prefs", MODE_PRIVATE)
   with(sharedPref.edit()){
      putBoolean("IS_LOGGED", true)
      apply()
   }
   ```
3. How can you read data from Shared Preferences in Android?
   ```kotlin
   val sharedPref = getSharedPreferences("user_prefs", MODE_PRIVATE)
   val loginStatus = sharedPref.getBoolean("IS_LOGGED", false)
   ```
4. What are the advantages of using Shared Preferences over other storage options for small amounts of data?
   It's lightweight and not need external dependencies to store simple data. data is also persist when app is restart. good for storing simpel data like user status and preferences
5. Can you modify Shared Preferences from multiple threads? Explain your answer.
   yes we can but with risk. When we read the data, its thread safe. when we want to edit, we use apply so it can apply on new thread. if we use commit, it will join the current thread so it will block the current thread.
   
---

#### **Code Fix Questions:**

1. **Incorrect code:**

   ```kotlin
   val sharedPref = getSharedPreferences("UserPrefs", Context.MODE_PRIVATE)
   val editor = sharedPref.edit()
   editor.putValue("username", "JohnDoe")
   editor.apply()
   ```

   **Corrected Code:**
   ```kotlin
   val sharedPref = getSharedPreferences("UserPrefs", Context.MODE_PRIVATE)
   val editor = sharedPref.edit()
   editor.putString("username", "JohnDoe")
   editor.apply()
   ```
   **Fix the code to store the correct data.**

2. **Incorrect code:**

   ```kotlin
   val sharedPref = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
   val username = sharedPref.getValue("username", "defaultName")
   ```

   **Corrected code:**
   ```kotlin
   val sharedPref = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
   val username = sharedPref.getString("username", "defaultName")
   ```

   **Fix the code and explain the correct method to read from Shared Preferences.**

3. **Incorrect code:**
   ```kotlin
   val editor = sharedPref.edit()
   editor.clear("key")
   editor.commit()
   ```

   **Corrected Code**
   ```kotlin
   val editor = sharedPref.edit()
   editor.clear()
   editor.commit()
   ```
   **Fix the code to properly remove a key from Shared Preferences.**

---
