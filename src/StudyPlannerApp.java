import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;


public class StudyPlannerApp extends JFrame {
    private User user = new User();
    private PriorityManager priorityManager = new PriorityManager();
    private RewardManager rewardManager = new RewardManager();
    private FileManager fileManager = new FileManager("planner_data.txt");
    private ArrayList<Task> displayedTasks = new ArrayList<Task>();
    private DefaultTableModel taskModel;
    private JTable taskTable;
    private JLabel dashboardLabel = new JLabel();
    private JLabel xpLabel = new JLabel();
    private JLabel timerLabel = new JLabel("25:00");
    private JLabel timerModeLabel = new JLabel("Study session");
    private JComboBox<Integer> energyChoice;
    private StudyTimer studyTimer;

    public StudyPlannerApp() {
        setTitle("Focus Haven");
        setSize(850, 570);
    }


}