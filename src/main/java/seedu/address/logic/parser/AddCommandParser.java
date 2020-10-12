package seedu.address.logic.parser;

import java.time.LocalDate;
import java.util.stream.Stream;

import seedu.address.commons.core.Messages;
import seedu.address.logic.commands.AddCommand;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.task.Task;

/**
 * Parses input arguments and creates a new AddCommand object
 */
public class AddCommandParser implements Parser<AddCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the AddCommand
     * and returns an AddCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public AddCommand parse(String args) throws ParseException {
        ArgumentMultimap argMultimap =
                ArgumentTokenizer.tokenize(args, CliSyntax.PREFIX_INDEX, CliSyntax.PREFIX_WEEKNO,
                        CliSyntax.PREFIX_DESCRIPTION, CliSyntax.PREFIX_OFFICIALDDL, CliSyntax.PREFIX_CUSTOMIZEDDDL,
                        CliSyntax.PREFIX_REMARK);

        if (!arePrefixesPresent(argMultimap, CliSyntax.PREFIX_INDEX, CliSyntax.PREFIX_WEEKNO,
                CliSyntax.PREFIX_DESCRIPTION) || !argMultimap.getPreamble().isEmpty()) {
            throw new ParseException(String.format(Messages.MESSAGE_INVALID_COMMAND_FORMAT, AddCommand.MESSAGE_USAGE));
        }

        String index =
                ParserUtil.parseIndex(argMultimap.getValue(CliSyntax.PREFIX_INDEX).get());
        int weekNumber =
                ParserUtil.parseWeekNumber(argMultimap.getValue(CliSyntax.PREFIX_WEEKNO).get());
        String description =
                ParserUtil.parseDescription(argMultimap.getValue(CliSyntax.PREFIX_DESCRIPTION).get());
        LocalDate officialDeadline =
                ParserUtil.parseOfficialDeadline(argMultimap.getValue(CliSyntax.PREFIX_OFFICIALDDL).get());
        LocalDate customizedDeadline =
                ParserUtil.parseCustomizedDeadline(argMultimap.getValue(CliSyntax.PREFIX_CUSTOMIZEDDDL).get());
        String remark =
                ParserUtil.parseRemark(argMultimap.getValue(CliSyntax.PREFIX_REMARK).get());

        Task task = new Task(index, weekNumber, description, officialDeadline, customizedDeadline, remark);
        return new AddCommand(task);
    }

    /**
     * Returns true if none of the prefixes contains empty {@code Optional} values in the given
     * {@code ArgumentMultimap}.
     */
    private static boolean arePrefixesPresent(ArgumentMultimap argumentMultimap, Prefix... prefixes) {
        return Stream.of(prefixes).allMatch(prefix -> argumentMultimap.getValue(prefix).isPresent());
    }

}
