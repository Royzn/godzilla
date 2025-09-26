### **Instructions:**

- For **optional questions**, select the correct answer.
- For **short answer questions**, provide a concise response.
- For **yes/no questions**, simply answer “yes” or “no.”
- For **correct-the-code questions**, review the provided code snippet, identify the mistake, and write the corrected version.

---

### **Pretest + Posttest Questions**

#### **Optional (Choose the correct answer):**

1. Which of the following is the correct way to declare a variable in Kotlin?

   - **a) `var x = 10`**
   - b) `let x = 10`
   - c) `dim x as 10`
   - d) `declare x = 10`

2. What keyword is used to declare a constant in Kotlin?

   - a) `let`
   - b) `const`
   - c) `final`
   - **d) `val`**

3. How do you define a function in Kotlin?

   - a) `function myFunction() {}`
   - b) `def myFunction() {}`
   - **c) `fun myFunction() {}`**
   - d) `lambda myFunction() {}`

4. What is the result of `5 % 2` in Kotlin?

   - a) `2.5`
   - **b) `1`**
   - c) `0`
   - d) `5`

5. Which data type in Kotlin represents a true or false value?
   - a) `Int`
   - b) `String`
   - **c) `Boolean`**
   - d) `Float`

---

#### **Short Answer:**

6. What is the difference between `var` and `val` in Kotlin?
with var, we can reassigned the value meanwhile val is immutable.

7. How do you create a list in Kotlin?
we can use `List<T>` and then use listOf()

8. Write a simple `if-else` statement in Kotlin.
`if(true) println("Hi") else println("Halo")`

9. How do you handle nullability in Kotlin?
we can use `?` when declare variable
ex: `var optional: Boolean ?= false`

10. What is a lambda function in Kotlin?
is anonymous function.
```
val sum: (Int, Int) -> Int = { a, b -> a + b }
println(sum(3, 4))
```

11. How do you define a class in Kotlin?

```
class Person {

    var name: String = ""
    var age: Int = 0

    fun greet() {
        println("Hello, my name is $name and I'm $age years old.")
    }
}
```


12. How do you use a `for` loop to iterate through a list in Kotlin?
```
for (i in 1..5) {
    println(i)
}
```

13. What does the `when` statement do in Kotlin?
```
val day = 3

val dayName = when (day) {
    1 -> "Monday"
    2 -> "Tuesday"
    3 -> "Wednesday"
    4 -> "Thursday"
    5 -> "Friday"
    6 -> "Saturday"
    7 -> "Sunday"
    else -> "Invalid day"
}

println(dayName)
```

14. How do you check if a number is even in Kotlin?
```
var x = 3
val isEven: (Int) -> Boolean = {x -> x%2 == 0}

if(isEven(x)) println("Even")
else println("Odd")
```

15. How do you declare an array in Kotlin?

we can use `Array<T>` or arrayOf()

---

#### **Yes/No Questions:**

16. Can `val` be reassigned to a new value after its initial assignment? No

17. Does Kotlin support operator overloading? Yes

18. Is Kotlin fully interoperable with Java? Yes

19. Can a function in Kotlin return a value using `return` keyword? Yes

20. Can Kotlin's `when` statement be used as an expression to return values? No

---

#### **Correct the Code (with Answers):**

21. **Incorrect code:**

    ```kotlin
    val x = "Hello"
    x = "World"
    ```

    **Correction Code**
    ```
    var x = "Hello"
    x = "World"
    ```

22. **Incorrect code:**

    ```kotlin
    fun sum(a: Int, b: Int): Int {
        return a + b

    sum(5, 10)
    ```

    - **Correction**:

    ```kotlin
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    sum(5, 10)
    ```

23. **Incorrect code:**

    ```kotlin
    val myList = listOf(1, 2, 3)
    myList.add(4)
    ```

    **Correction Code**
    ```
    val myList = mutableListOf(1, 2, 3)
    myList.add(4)
    ```

24. **Incorrect code:**

    ```kotlin
    val name: String = null
    ```

    **Correction Code**
    ```
    var name: String ?= null
    ```

25. **Incorrect code:**

    ```kotlin
    if x > 5 {
        println("x is greater than 5")
    }
    ```

    **Correction Code**
    ```
    if (x > 5) {
        println("x is greater than 5")
    }
    ```

26. **Incorrect code:**

    ```kotlin
    when (x) {
        1 -> println("One")
        2 -> println("Two")
        else println("Other")
    }
    ```

    **Correction Code**
    ```
    when (x) {
        1 -> println("One")
        2 -> println("Two")
        else -> println("Other")
    }
    ```

27. **Incorrect code:**

    ```kotlin
    fun greet() {
        println("Hello, $name)
    }
    ```

    **Correction Code**
    ```
    fun greet(name: String) {
        println("Hello, $name")
    }
    ```

28. **Incorrect code:**

    ```kotlin
    val myVar = "10"
    val result = myVar + 5
    ```

    **Correction Code**
    ```
    val myVar = "10"
    val result = myVar.toInt() + 5
    ```

29. **Incorrect code:**

    ```kotlin
    val numbers = arrayOf(1, 2, 3)
    println(numbers[3])
    ```

    **Correction Code**
    ```
    val numbers = arrayOf(1, 2, 3)
    println(numbers[2])
    ```

30. **Incorrect code:**
    ```kotlin
    class Person(val name: String, val age: Int) {
        fun greet() {
            print("Hello, my name is " + name + " and I'm " + age)
        }
    }
    ```

    **Correction Code**
    ```
    class Person(val name: String, val age: Int) {
        fun greet() {
            println("Hello, my name is $name and I'm $age years old.")
        }
    }
    ```

---

### **Story-based Question (with Failed Code)**

#### **Story:**

Imagine you are building a ticket booking system for a movie theater. Each customer can reserve a seat by providing their name and the seat number. The seat numbers are stored in an array, and the program should check if the seat is available. If available, the seat will be reserved, and if not, a message will be displayed to the user that the seat is taken.

Here’s the failed code:

```kotlin
val seatMap = mutableMapOf(
    1 to null,
    2 to null,
    3 to null,
    4 to null,
    5 to null
)

fun reserveSeat(name: String, seatNumber: Int) {
    if (!seatMap.containsKey(seatNumber)) {
        println("Seat $seatNumber does not exist.")
        return
    }

    if (seatMap[seatNumber] == null) {
        seatMap[seatNumber] = name
        println("$name reserved seat $seatNumber.")
    } else {
        println("Seat $seatNumber is already reserved by ${seatMap[seatNumber]}.")
    }
}

fun main() {
    reserveSeat("John", 2)
    reserveSeat("Sarah", 2)
}
```
