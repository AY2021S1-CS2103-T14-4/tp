package seedu.address.logic.parser;

import static seedu.address.logic.parser.CliSyntax.PREFIX_CUSTOMIZEDDDL;
import static seedu.address.logic.parser.CliSyntax.PREFIX_INDEX;

import java.time.LocalDate;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.DeadlineCommand;
import seedu.address.logic.parser.exceptions.ParseException;


public class DeadlineCommandParser implements Parser<DeadlineCommand> {
    @Override
    public DeadlineCommand parse(String args) throws ParseException {
        ArgumentMultimap argMultimap =
                ArgumentTokenizer.tokenize(args, PREFIX_INDEX, PREFIX_CUSTOMIZEDDDL);
        Index index = ParserUtil.parseIndexObj(argMultimap.getValue(PREFIX_INDEX).get());
        LocalDate customizedDeadline =
                ParserUtil.parseCustomizedDeadline(argMultimap.getValue(PREFIX_CUSTOMIZEDDDL).get());
        return new DeadlineCommand(index, customizedDeadline);
    }
}
