package seedu.address.logic.parser;

import static seedu.address.logic.parser.CliSyntax.PREFIX_TYPE;

import seedu.address.logic.commands.GetCommand;
import seedu.address.logic.parser.exceptions.ParseException;

public class GetCommandParser implements Parser<GetCommand> {
    @Override
    public GetCommand parse(String args) throws ParseException {
        ArgumentMultimap argMultimap = ArgumentTokenizer.tokenize(args, PREFIX_TYPE);

        String type = ParserUtil.parseType(argMultimap.getValue(PREFIX_TYPE).get());
        return new GetCommand(type);
    }
}
