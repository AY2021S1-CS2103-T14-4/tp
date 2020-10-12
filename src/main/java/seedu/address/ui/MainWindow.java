package seedu.address.ui;

import java.util.logging.Logger;

import javafx.fxml.FXML;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import seedu.address.commons.core.GuiSettings;
import seedu.address.commons.core.LogsCenter;
import seedu.address.logic.Logic;
import seedu.address.logic.commands.CommandResult;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.logic.parser.exceptions.ParseException;

/**
 * The Main Window. Provides the basic application layout containing
 * a menu bar and space where other JavaFX elements can be placed.
 */
public class MainWindow extends UiPart<Stage> {

    private static final String FXML = "MainWindow.fxml";

    private final Logger logger = LogsCenter.getLogger(getClass());

    private Stage primaryStage;
    private Logic logic;

    // Independent Ui parts residing in this Ui container
    private CategoryPanel categoryPanel;
    private WeekDisplay weekDisplay;
    private CommandBox commandBox;

    @FXML
    private StackPane weekDisplayPlaceholder;

    @FXML
    private HBox categoryPanelPlaceholder;

    @FXML
    private StackPane commandBoxPlaceholder;

    /**
     * Creates a {@code MainWindow} with the given {@code Stage} and {@code Logic}.
     */
    public MainWindow(Stage primaryStage, Logic logic) {
        super(FXML, primaryStage);

        // Set dependencies
        this.primaryStage = primaryStage;
        this.logic = logic;

        // Configure the UI
        setWindowDefaultSize(logic.getGuiSettings());
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    /**
     * Fills up all the placeholders of this window.
     */
    void fillInnerParts() {
        // TODO: change the method to get each category panel
        logger.info("The size of adminlist" + logic.getUiTaskList().getAdminList().size());
        categoryPanel = new CategoryPanel(logic.getUiTaskList().getAdminList());
        categoryPanelPlaceholder.getChildren().add(categoryPanel.getRoot());
        categoryPanel = new CategoryPanel(logic.getUiTaskList().getTopicList());
        categoryPanelPlaceholder.getChildren().add(categoryPanel.getRoot());
        categoryPanel = new CategoryPanel(logic.getUiTaskList().getIpList());
        categoryPanelPlaceholder.getChildren().add(categoryPanel.getRoot());
        categoryPanel = new CategoryPanel(logic.getUiTaskList().getTpList());
        categoryPanelPlaceholder.getChildren().add(categoryPanel.getRoot());
        weekDisplay = new WeekDisplay("Week 1 [Mon,Aug 10th to Thu, Aug 13th]");
        weekDisplayPlaceholder.getChildren().add(weekDisplay.getRoot());

        CommandBox commandBox = new CommandBox(this::executeCommand); // bottom of Ace CS2103/T
        commandBoxPlaceholder.getChildren().add(commandBox.getRoot());
    }

    /**
     * Sets the default size based on {@code guiSettings}.
     */
    private void setWindowDefaultSize(GuiSettings guiSettings) {
        primaryStage.setHeight(guiSettings.getWindowHeight());
        primaryStage.setWidth(guiSettings.getWindowWidth());
        if (guiSettings.getWindowCoordinates() != null) {
            primaryStage.setX(guiSettings.getWindowCoordinates().getX());
            primaryStage.setY(guiSettings.getWindowCoordinates().getY());
        }
    }

    void show() {
        primaryStage.show();
    }

    /**
     * Closes the application.
     */
    @FXML
    private void handleExit() {
        GuiSettings guiSettings = new GuiSettings(primaryStage.getWidth(), primaryStage.getHeight(),
                (int) primaryStage.getX(), (int) primaryStage.getY());
        logic.setGuiSettings(guiSettings);
        primaryStage.hide();
    }


    /**
     * Executes the command and returns the result.
     *
     * @see Logic#execute(String)
     */
    private CommandResult executeCommand(String commandText) throws CommandException, ParseException {
        try {
            CommandResult commandResult = logic.execute(commandText);
            logger.info("Result: " + commandResult.getFeedbackToUser());
            // categoryPanel.setFeedbackToUser(commandResult.getFeedbackToUser());
            if (commandResult.isExit()) {
                handleExit();
            }

            return commandResult;
        } catch (CommandException | ParseException e) {
            logger.info("Invalid command: " + commandText);
            // categoryPanel.setFeedbackToUser(e.getMessage());
            throw e;
        }
    }
}
