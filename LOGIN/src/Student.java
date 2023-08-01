
public class Student {
    private String name;
    private boolean present;

    public Student(String name) {
        this.name = name;
        this.present = false; // Initialize as absent by default
    }

    public String getName() {
        return name;
    }

    public boolean isPresent() {
        return present;
    }

    public void markPresent() {
        this.present = true;
    }

    public void markAbsent() {
        this.present = false;
    }
}
