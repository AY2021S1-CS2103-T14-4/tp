package seedu.address.ui;

import java.util.logging.Logger;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import seedu.address.commons.core.LogsCenter;
import seedu.address.model.task.Task;


public class TaskBox extends UiPart<Region> {
    private static final String FXML = "TaskBox.fxml";
    public final Task task;
    private final Logger logger = LogsCenter.getLogger(TaskBox.class);

    @FXML
    private HBox cardPane;
    @FXML
    private Label index;
    @FXML
    private Label weekNumber;
    @FXML
    private Label description;
    @FXML
    private Label officialDeadline;
    @FXML
    private Label customizedDeadline;
    @FXML
    private Label remark;

    /**
     * Creates a TaskBox object.
     * @param task is a task object.
     */
    public TaskBox(Task task) {
        super(FXML);
        logger.info("here!");
        this.task = task;
        index.setText(task.getIndex());
        weekNumber.setText(Integer.toString(task.getWeekNumber()));
        description.setText(task.getDescription());
        officialDeadline.setText(task.getOfficialDeadline().toString());
        customizedDeadline.setText(task.getCustomizedDeadline().toString());
        remark.setText(task.getRemark());
    }
}