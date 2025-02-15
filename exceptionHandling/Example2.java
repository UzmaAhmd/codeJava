package exceptionsinjava;

public class Example2 {


    /**
     * ⚠️ 1. Exceptions Are Runtime Errors
     * 🔍 Types of Errors:
     *    1️⃣ Syntax Errors
     *    2️⃣ Logical Errors
     *    3️⃣ Runtime Errors (Exceptions)
     *
     * 👥 In a program, two main entities are involved:
     *    👨‍💻 Programmer
     *    👤 User
     *
     * ✅ The first two types of errors are encountered by the programmer.
     * ❌ Runtime errors, also known as exceptions, are faced by the user.
     *
     * 📝 Syntax Errors:
     *    - The compiler detects these errors and prevents execution until they are fixed.
     *
     * 🧠 Logical Errors:
     *    - The program compiles and runs but does not produce the expected results.
     *    - These are difficult to identify and can take a significant amount of time to debug. ⏳
     *    - 🛠️ Debugging tools and program tracing help in resolving logical errors.
     *
     * ⏳ Runtime Errors:
     *    - These occur while the program is running and are experienced by the user.
     *    - Users cannot fix these errors since they do not have access to modify the program. 🔒
     *    - ⚠️ Runtime errors typically result from:
     *      1️⃣ Invalid Input ⛔
     *      2️⃣ Unavailability of Resources 🛑
     *
     * ❗ Runtime errors occur due to external factors rather than internal program faults.
     *    - These errors cause the program to crash, making it impossible to continue execution. 💥
     *    - They often result from bad input or unavailable resources.
     *
     * 💡 Handling Runtime Errors:
     *    - Instead of allowing the program to crash, programmers should provide users with meaningful error messages. 🗨️
     *    - Users should be guided on how to correctly use the program.
     *    - Proper handling ensures a better user experience by preventing abrupt program failures.
     *
     * 🔹 Example causes of Runtime Errors:
     *    - Bad Input ❌
     *    - File Not Found 📂
     *    - No Internet Connection 🌐
     *
     * 🛠️ Exception Handling:
     *    - Programmers should implement exception handling to provide users with proper guidance.
     *    - Informing users about errors and potential solutions is crucial for usability.
     *    - Exception handling ensures that the program remains stable even when errors occur.
     *
     *    ```java
     *      try{
     *
     *      }catch(ExceptionClass reff)
     *      {
     *
     *      }
     *      finally
     *      {
     *
     *      }
     *
     *      finally block always executes whether there is exception or no exception.
     *      Mostly its is used for cleanup process.
     *    ```
     *
     */
}
