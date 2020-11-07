package tp.acecs2103.logic.commands;

import org.junit.jupiter.api.Test;
import tp.acecs2103.logic.commands.exceptions.CommandException;
import tp.acecs2103.model.Model;
import tp.acecs2103.model.ModelManager;
import tp.acecs2103.model.TaskList;
import tp.acecs2103.model.UserPrefs;
import tp.acecs2103.model.task.*;
import tp.acecs2103.testutil.TypicalTasks;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static tp.acecs2103.logic.commands.CommandTestUtil.assertCommandSuccess;

class ClearCommandTest {
    @Test
    public void execute_null_success() {
        Model model = new ModelManager(TypicalTasks.getTypicalTaskList(), new UserPrefs());
        ModelManager expectedModel = new ModelManager(new TaskList(), new UserPrefs());

        ClearCommand clearCommand= new ClearCommand();
        clearCommand.execute(model);
        String expectedMessage = String.format(ClearCommand.MESSAGE_SUCCESS);
        assertCommandSuccess(clearCommand, model, expectedMessage, expectedModel);

    }
}