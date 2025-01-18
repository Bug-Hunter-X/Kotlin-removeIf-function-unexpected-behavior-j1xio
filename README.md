# Kotlin removeIf Function Unexpected Behavior

This repository demonstrates a potential pitfall when using the `removeIf` function in Kotlin with mutable lists.  The `removeIf` function modifies the list in place, which can be unexpected if you're not aware of this behavior.

The `bug.kt` file shows a simple example where removing even numbers from a list using `removeIf` directly changes the original list.

The `bugSolution.kt` file provides a solution that leverages the `filter` function to create a new list, thereby avoiding in-place modification.
