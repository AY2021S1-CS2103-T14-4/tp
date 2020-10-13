package tp.acecs2103.logic.commands;

import static java.util.Objects.requireNonNull;

import java.time.LocalDate;

import tp.acecs2103.commons.core.index.Index;
import tp.acecs2103.model.Model;


public class DeadlineCommand extends Command {
    public static final String COMMAND_WORD = "deadline";

    public static final String MESSAGE_SUCCESS = "Modified deadline for the required task";

    private final Index targetIndex;
    private final LocalDate newDeadline;

    /**
     * Creates a {@code DeadlineCommand} with given index and newDeadline
     */
    public DeadlineCommand(Index targetIndex, LocalDate newDeadline) {
        requireNonNull(targetIndex);
        requireNonNull(newDeadline);
        this.targetIndex = targetIndex;
        this.newDeadline = newDeadline;
    }


    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.deadlineTask(targetIndex.getStrIndex(), newDeadline);
        return new CommandResult(MESSAGE_SUCCESS);
    }
}