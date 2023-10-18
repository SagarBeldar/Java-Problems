import java.util.ArrayList;
import java.util.List;

class Worker {
    int id;
    int completionTime;

    public Worker(int id) {
        this.id = id;
        this.completionTime = 0;
    }
}

class Task {
    String name;
    String type;
    int completionTime;

    public Task(String name, String type, int completionTime) {
        this.name = name;
        this.type = type;
        this.completionTime = completionTime;
    }
}

public class TaskAllocation {
    public static void main(String[] args) {
        int numWorkers = 3; // Set the number of workers
        List<Worker> workers = new ArrayList<>();
        for (int i = 1; i <= numWorkers; i++) {
            workers.add(new Worker(i));
        }

        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("T1", "Machine", 0));
        tasks.add(new Task("T2", "Manual", 5));
        tasks.add(new Task("T3", "Manual", 3));
        tasks.add(new Task("T4", "Machine", 0));

        int currentTime = 0;

        for (Task task : tasks) {
            if (task.type.equals("Machine")) {
                // Allocate machine task to the next available worker
                Worker worker = workers.get(0);
                worker.completionTime = currentTime + task.completionTime;
                System.out.println(task.name + " assigned to W" + worker.id + " at time " + currentTime);
                currentTime = worker.completionTime;
            } else {
                // Allocate manual task to the next available worker
                Worker worker = workers.get(0);
                for (Worker w : workers) {
                    if (w.completionTime < worker.completionTime) {
                        worker = w;
                    }
                }
                worker.completionTime = currentTime + task.completionTime;
                System.out.println(task.name + " assigned to W" + worker.id + " at time " + currentTime);
                currentTime = worker.completionTime;
            }
        }
    }
}
