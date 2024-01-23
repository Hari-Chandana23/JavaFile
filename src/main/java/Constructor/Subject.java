package Constructor;

public class Subject extends Professor{
    String name;
    public Subject(String name, String professorType) {
        super(professorType);
        this.name = name;
    }

    public Subject(String name) {
        super("Computer Science");
        this.name = name;
    }

    public static void main(String[] args) {
        Subject subject = new Subject("Java");
        System.out.println(subject.professorType);
        System.out.println(subject.name);

        subject = new Subject("Data", "Subject");
        System.out.println(subject.name);
        System.out.println(subject.professorType);
    }
}