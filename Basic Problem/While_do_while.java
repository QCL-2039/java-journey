// | Feature             | `while` Loop                                       | `do-while` Loop                                              |
// | ------------------- | -------------------------------------------------- | ------------------------------------------------------------ |
// | **Condition Check** | Checked **before** the loop body                   | Checked **after** the loop body                              |
// | **Execution**       | May **not execute** at all if false                | **Executes at least once**                                   |
// | **Syntax**          | `while(condition) { // code }`                     | `do { // code } while(condition);`                           |
// | **Use Case**        | When loop should run **only if condition is true** | When loop must run **at least once** regardless of condition |
// | **Readability**     | More common for standard loops                     | Useful for **menu-driven or input validation** scenarios     |

public class While_do_while {
    public static void main(String[] args) {
        int i = 0;
        while (i < 6) {
            System.out.println(i);
            i++;
        }
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 6);

    }
}
