package seedu.address.model;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import seedu.address.model.task.Admin;
import seedu.address.model.task.IP;
import seedu.address.model.task.TP;
import seedu.address.model.task.Task;
import seedu.address.model.task.TaskCategory;
import seedu.address.model.task.Topic;


public class UiTaskList {
    private ObservableList<Task> adminList = FXCollections.observableArrayList();
    private ObservableList<Task> topicList = FXCollections.observableArrayList();
    private ObservableList<Task> ipList = FXCollections.observableArrayList();
    private ObservableList<Task> tpList = FXCollections.observableArrayList();

    /**
     * Creates a {@code UiTaskList} with given source.
     * @param source A array list consisting of tasks which need to be displayed.
     */
    public UiTaskList(ArrayList<Task> source) {
        addAll(source);
    }

    /**
     * Clears four sub lists first and dds all tasks of {@code taskList} into sub lists based on category of each task.
     * @param taskList A array list consisting of tasks which need to be added to {@code UiTaskList}.
     */
    public void addAll(ArrayList<Task> taskList) {
        adminList.clear();
        topicList.clear();
        ipList.clear();
        tpList.clear();
        for (Task task: taskList) {
            if (TaskCategory.isAdmin(task.getCategory())) {
                adminList.add((Admin) task);
            } else if (TaskCategory.isTopic(task.getCategory())) {
                topicList.add((Topic) task);
            } else if (TaskCategory.isIP(task.getCategory())) {
                ipList.add((IP) task);
            } else if (TaskCategory.isTP(task.getCategory())) {
                tpList.add((TP) task);
            }
        }
    }

    /**
     * Gets a list consisting of all admin tasks.
     */
    public ObservableList<Task> getAdminList() {
        return adminList;
    }

    /**
     * Gets a list consisting of all ip tasks.
     */
    public ObservableList<Task> getIpList() {
        return ipList;
    }

    /**
     * Gets a list consisting of all tp tasks.
     */
    public ObservableList<Task> getTpList() {
        return tpList;
    }

    /**
     * Gets a list consisting of all topic tasks.
     */
    public ObservableList<Task> getTopicList() {
        return topicList;
    }

    /**
     * Gets the number of tasks which need to be displayed.
     */
    public int size() {
        return adminList.size() + ipList.size() + tpList.size() + topicList.size();
    }
}
