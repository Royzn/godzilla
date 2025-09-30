#### **Optional (Choose the correct answer):**

1. Which of the following creates an immutable list in Kotlin?

   - a) `arrayOf(1, 2, 3)`
   - b) **`listOf(1, 2, 3)`**
   - c) `mutableListOf(1, 2, 3)`
   - d) `setOf(1, 2, 3)`

2. What is the purpose of a coroutine in Kotlin?

   - a) To manage multiple threads
   - b) **To handle asynchronous programming efficiently**
   - c) To suspend functions indefinitely
   - d) To manage Android lifecycle events

3. Which activity lifecycle method is called when the activity is visible but not yet interactive?

   - a) `onCreate()`
   - b) `onResume()`
   - c) **`onStart()`**
   - d) `onPause()`

4. In Android UI, which ViewGroup arranges its children in a single direction (either horizontal or vertical)?

   - a) `RelativeLayout`
   - b) `ConstraintLayout`
   - c) **`LinearLayout`**
   - d) `FrameLayout`

5. What keyword is used to define a suspending function in Kotlin?
   - a) `async`
   - b) `launch`
   - c) **`suspend`**
   - d) `defer`

---

#### **Short Answer:**

6. What is the difference between `listOf()` and `mutableListOf()` in Kotlin?
`listOf()` is for creating immutable list meanwhile `mutableListOf()` is for creating mutable list

7. How does `onDestroy()` differ from `onStop()` in the Android activity lifecycle?
`onDestroy()` is when the activity is going to be destroy. the activity will be remove completely from the memory.
`onStop()` is when the activity is not visible to user. the activity is still in memory and user can go back to the activity. 

8. What is the advantage of using coroutines over threads in Kotlin?
its lighweight, its more simpler with code, it can be coded as synchronous.

9. How can you prevent memory leaks in Android when handling configuration changes like screen rotation?
we can use viewModel, use onCleared if its not being used, and do not use non-lifecycle-components to handle this.

10. Explain the difference between `View` and `ViewGroup` in Android.
Ans: View is the most basic android UI that can handle user interaction. meanwhile ViewGroup is more like container that handle multiple View inside it.

11. How does a `RecyclerView` differ from a `ListView` in Android UI components?
RecyclerView has more attributes and usage and also its more efficient in performance than ListView. for example, we can do grid, horizontal, vertical while ListView only can do vertical. it's more useful when we handle large dataset.

12. What is the role of `onResume()` in the Android lifecycle?
`onResume()` is the phase where the activity is ready for the user to interact with. it purpose is to continue the app when the user return to the activity.

13. What is the purpose of `launch` in Kotlin coroutines?
`launch` purpose is to start a new coroutine that doesnt return any result. its common use for saving data to database, updating ui, or making any request.

14. What is `LiveData` in Android, and why is it useful?
LiveData makes the user interaction is more live and observe for any changes occured. it act like observer and can get notified while its on resume or start.its useful when we want data sync from user to ui and it prevents memory leak.

15. What is the `ViewModel` class used for in Android?
ViewModel is use for store and manage ui related data in lifecycle way.
---

#### **Yes/No Questions:**

16. Can `setOf()` store duplicate elements in Kotlin? No

17. Is it possible to use coroutines with Android’s lifecycle-aware components like `LiveData`? Yes

18. Does the Android `onCreate()` method get called every time an activity becomes visible? No

19. Can a `ConstraintLayout` position elements relative to each other in Android? Yes

20. Are `RecyclerView` and `SwipeRefreshLayout` both advanced Android UI components? Yes

---

#### **Correct the Code (with Reasons for Correction):**

21. **Incorrect code:**
    ```kotlin
    val myList = listOf(1, 2, 3)
    myList.add(4)
    ```

    **Corrected Code:**
    ```kotlin
    val myList = mutableListOf(1, 2, 3)
    myList.add(4)
    ```

---

22. **Incorrect code:**
    ```kotlin
    fun myCoroutine() {
        delay(1000L)
        println("Coroutine executed")
    }
    ```

    **Corrected Code:**
    ```kotlin
    fun myCoroutine() {
        delay(1000)
        println("Coroutine executed")
    }
    ```
---

23. **Incorrect code:**
    ```kotlin
    override fun onCreate() {
        super.onCreate()
        setContentView(R.layout.activity_main)
    }
    ```

    **Corrected Code:**
    ```kotlin
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    ```

---

24. **Incorrect code:**
    ```kotlin
    val map = mapOf(1 to "One", 2 to "Two")
    map[3] = "Three"
    ```

    **Corrected Code:**
    ```kotlin
    val map = mutableMapOf(1 to "One", 2 to "Two")
    map[3] = "Three"
    ```

---

25. **Incorrect code:**
    ```kotlin
    val view = findViewById<Button>(R.id.button)
    view.setOnClickListener {
        Log.d("Click", "Button clicked")
    }
    ```

    **Corrected Code:**
    ```kotlin
    val view: Button = findViewById(R.id.button)
    view.setOnClickListener {
        Log.d("Click", "Button clicked")
    }
    ```

---

### **Story-based Question (with Failed Code)**

#### **Story:**

You are developing an Android app for managing tasks. Each task has a title and a description. The app should allow users to add tasks and display the list of tasks in a `RecyclerView`. However, the app crashes when you try to display the list of tasks.

This is fixed code. already remove the failed code:

```kotlin
class TaskAdapter(private val taskList: List<Task>) : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleView: TextView = itemView.findViewById(R.id.taskTitle)
        val descriptionView: TextView = itemView.findViewById(R.id.taskDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.task_item, parent, false)
        return TaskViewHolder(view)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val task = taskList[position]
        holder.titleView.text = task.title
        holder.descriptionView.text = task.description
    }

    override fun getItemCount() = taskList.size
}


data class Task(val title: String, val description: String)
```

---
