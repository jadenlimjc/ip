import java.util.Scanner;

public class UI {

    private Scanner scanner = new Scanner(System.in);

    public String readCommand() {
        return scanner.nextLine();
    }

    public void showLine() {
        System.out.println("_______________________________________");
    }

    public void showWelcome() {
        showLine();
        System.out.println("Hello! I'm QUAG!");
        System.out.println("This is your current list of tasks! quag");
        showLine();
    }

    public void showExit() {
        showLine();
        System.out.println("See you soon! quag quag");
        showLine();
    }

    public void notNumberEntered() {
        System.out.println("That's not a quaggin number!!");
    }

    public void noNumberEntered() {
        System.out.println("There's no quaggin number!!");
    }

    public void invalidFormat() {
        System.out.println("That's not a valid quaggin format!!");
    }

    public void alreadyMarked() {
        System.out.println("quag! you're done with this task :");
    }

    public void alreadyUnmarked() {
        System.out.println("quag! you ain't even done w this yet:");
    }

    public void showCommandList() {
        System.out.println("list of all quaggin commands:");
        showLine();
        System.out.println("list: lists out all your tasks");
        System.out.println("mark <index>: marks task corresponding to index");
        System.out.println("unmark <index>: unmarks task corresponding to index");
        System.out.println("todo <description>: adds task type todo to list");
        System.out.println("deadline <description> /by <date>: adds task type deadline to list");
        System.out.println("event <description> /from <date> /to <date>: adds task type event to list");
        System.out.println("delete <index>: delete task corresponding to index");
        System.out.println("quag: exit program");
        showLine();
    }
}
