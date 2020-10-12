package seedu.address.model.task;

import java.time.LocalDate;

public class IP extends Task {
    public IP(String index, int weekNumber,
              String description, LocalDate officialDeadline, LocalDate customizedDeadline, String remark) {
        super(index, weekNumber, description, officialDeadline, customizedDeadline, remark);
    }

    @Override
    public TaskCategory getCategory() {
        return TaskCategory.IP;
    }
}
