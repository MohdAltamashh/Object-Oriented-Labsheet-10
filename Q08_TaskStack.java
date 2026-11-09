import java.util.*;
public class Q08_TaskStack {
    static class Task { int taskId; String description;
        Task(int id,String d){taskId=id;description=d;}
        public String toString(){return taskId+": "+description;}
    }
    static void pushTask(Stack<Task> stack,Task task){stack.push(task);}
    static void popCompletedTask(Stack<Task> stack){if(!stack.empty())System.out.println("Completed: "+stack.pop());}
    static void display(Stack<Task> stack){System.out.println("Remaining tasks: "+stack);}
    public static void main(String[] args) {
        Stack<Task> tasks=new Stack<>(); pushTask(tasks,new Task(1,"Prepare report"));
        pushTask(tasks,new Task(2,"Submit assignment")); display(tasks);
        popCompletedTask(tasks); display(tasks);
    }
}
