package seedu.address.logic.parser;

import static seedu.address.logic.parser.CliSyntax.PREFIX_WEEKNO;

import seedu.address.logic.commands.ListCommand;
import seedu.address.logic.parser.exceptions.ParseException;

public class ListCommandParser implements Parser<ListCommand> {
    @Override
    public ListCommand parse(String args) throws ParseException {
        ArgumentMultimap argMultimap = ArgumentTokenizer.tokenize(args, PREFIX_WEEKNO);

        int weekNumber = ParserUtil.parseWeekNumber(argMultimap.getValue(PREFIX_WEEKNO).get());

        return new ListCommand(weekNumber);
    }
}
