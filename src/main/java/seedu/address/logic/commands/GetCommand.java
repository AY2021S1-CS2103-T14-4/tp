package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;


public class GetCommand extends Command {
    public static final String COMMAND_WORD = "get";

    public static final String MESSAGE_SUCCESS = "Gotten required administrative information.";

    private final String infoType;

    /**
     * Creates a {@code GetCommand} with given infoType.
     */
    public GetCommand(String infoType) {
        requireNonNull(infoType);
        this.infoType = infoType;
    }

    public CommandResult execute(Model model) throws CommandException {
        return new CommandResult(MESSAGE_SUCCESS, true, false); // dummy code for now
    }

}
