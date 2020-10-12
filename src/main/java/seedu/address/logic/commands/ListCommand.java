package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.address.model.Model;

/**
 * Lists all persons in the address book to the user.
 */
public class ListCommand extends Command {

    public static final String COMMAND_WORD = "list";

    public static final String MESSAGE_SUCCESS = "Listed all tasks for the selected week";

    private final int weekNumber;

    /**
     * Creates a {@code ListCommand} with given Week number.
     */
    public ListCommand(int weekNumber) {
        requireNonNull(weekNumber);
        this.weekNumber = weekNumber;
    }


    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.listTasks(weekNumber);
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
