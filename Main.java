import manager.StudentManager;
import ui.MainFrame;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        new MainFrame(manager).setVisible(true);
    }
}
