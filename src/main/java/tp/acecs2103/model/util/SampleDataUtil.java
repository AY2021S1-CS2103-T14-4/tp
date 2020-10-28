package tp.acecs2103.model.util;

import tp.acecs2103.model.TaskList;
import tp.acecs2103.model.task.Admin;
import tp.acecs2103.model.task.Description;
import tp.acecs2103.model.task.IP;
import tp.acecs2103.model.task.Index;
import tp.acecs2103.model.task.OfficialDeadline;
import tp.acecs2103.model.task.Remark;
import tp.acecs2103.model.task.TP;
import tp.acecs2103.model.task.Task;
import tp.acecs2103.model.task.Topic;
import tp.acecs2103.model.task.WeekNumber;
import java.time.LocalDate;

import java.time.LocalDate;

/**
 * Contains utility methods for populating {@code TaskList} with sample data.
 */
public class SampleDataUtil {
    public static Task[] getSampleTasks() {
        return new Task[] {
            new Admin(new Index("0101"), new WeekNumber("1"), new Description("Submit pre-lecture quiz"),
                new OfficialDeadline("2020-08-17", LocalDate.of(2020,8,17)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0102"), new WeekNumber("1"), new Description("OOP: Classes & Objects"),
                    new OfficialDeadline("2020-08-14",LocalDate.of(2020,8,14)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0103"), new WeekNumber("1"), new Description("Submit the pre-module survey"),
                    new OfficialDeadline("2020-08-14",LocalDate.of(2020,8,14)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0104"), new WeekNumber("1"), new Description("OOP Inheritance"),
                    new OfficialDeadline("2020-08-14",LocalDate.of(2020,8,14)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0105"), new WeekNumber("1"), new Description("OOP: Polymorphism"),
                    new OfficialDeadline("2020-08-14",LocalDate.of(2020,8,14)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0106"), new WeekNumber("1"), new Description("Java: Collections"),
                    new OfficialDeadline("2020-08-14",LocalDate.of(2020,8,14)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0107"), new WeekNumber("1"), new Description("Exception Handling"),
                    new OfficialDeadline("2020-08-14",LocalDate.of(2020,8,14)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0108"), new WeekNumber("1"), new Description("Set up the tools"),
                    new OfficialDeadline("2020-08-14",LocalDate.of(2020,8,14)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0201"), new WeekNumber("2"), new Description("Submit post-lecture quiz"),
                    new OfficialDeadline("2020-08-20",LocalDate.of(2020,8,20)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0202"), new WeekNumber("2"), new Description("SE: Intro"),
                    new OfficialDeadline("2020-08-20",LocalDate.of(2020,8,20)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0203"), new WeekNumber("2"), new Description("Learn about the project"),
                    new OfficialDeadline("2020-08-20",LocalDate.of(2020,8,20)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0204"), new WeekNumber("2"), new Description("Set up prerequisites"),
                    new OfficialDeadline("2020-08-20",LocalDate.of(2020,8,20)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0205"), new WeekNumber("2"), new Description("Get connected to our communication channels"),
                    new OfficialDeadline("2020-08-21",LocalDate.of(2020,8,21)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0206"), new WeekNumber("2"), new Description("SDLC Process Models: Basics"),
                    new OfficialDeadline("2020-08-20",LocalDate.of(2020,8,20)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0207"), new WeekNumber("2"), new Description(" Set up the project in your computer"),
                    new OfficialDeadline("2020-08-20",LocalDate.of(2020,8,20)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0208"), new WeekNumber("2"), new Description("Add Increments while committing frequently"),
                    new OfficialDeadline("2020-08-20",LocalDate.of(2020,8,20)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0301"), new WeekNumber("3"), new Description("Submit post-lecture quiz"),
                    new OfficialDeadline("2020-08-27",LocalDate.of(2020,8,27)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0302"), new WeekNumber("3"), new Description("RCS: Branching"),
                    new OfficialDeadline("2020-08-27",LocalDate.of(2020,8,27)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0303"), new WeekNumber("3"), new Description("Create a PR to the upstream repo"),
                    new OfficialDeadline("2020-08-27",LocalDate.of(2020,8,27)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0304"), new WeekNumber("3"), new Description("Get familiar with AB3 features"),
                    new OfficialDeadline("2020-08-27",LocalDate.of(2020,8,27)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0305"), new WeekNumber("3"), new Description("[CS2103 students only] Form teams during the tutorial"),
                    new OfficialDeadline("2020-08-27",LocalDate.of(2020,8,27)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0306"), new WeekNumber("3"), new Description("RCS: Creating Pull Requests "),
                    new OfficialDeadline("2020-08-27",LocalDate.of(2020,8,27)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0307"), new WeekNumber("3"), new Description("Add Increments as parallel branches: Level-7, Level-8"),
                    new OfficialDeadline("2020-08-27",LocalDate.of(2020,8,27)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0308"), new WeekNumber("3"), new Description("Set up a project meeting time"),
                    new OfficialDeadline("2020-08-27",LocalDate.of(2020,8,27)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0309"), new WeekNumber("3"), new Description("Add Increments: A-MoreOOP, A-Packages, A-JUnit, A-Jar"),
                        new OfficialDeadline("2020-08-27",LocalDate.of(2020,8,27)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0310"), new WeekNumber("3"), new Description("Add Increments as parallel branches: A-JavaDoc, A-CodingStandard, Level-9"),
                        new OfficialDeadline("2020-08-27",LocalDate.of(2020,8,27)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0401"), new WeekNumber("4"), new Description("Accept GitHub invitation from the module organization"),
                    new OfficialDeadline("2020-09-03",LocalDate.of(2020,9,3)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0402"), new WeekNumber("4"), new Description("Design: Models"),
                    new OfficialDeadline("2020-09-03",LocalDate.of(2020,9,3)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0403"), new WeekNumber("4"), new Description("Review some peer PRs"),
                    new OfficialDeadline("2020-09-03",LocalDate.of(2020,9,3)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0404"), new WeekNumber("4"), new Description("Start a collaborative doc to take project notes"),
                    new OfficialDeadline("2020-09-03",LocalDate.of(2020,9,3)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0405"), new WeekNumber("4"), new Description("Submit post-lecture quiz"),
                    new OfficialDeadline("2020-09-03",LocalDate.of(2020,9,3)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0406"), new WeekNumber("4"), new Description("Class/Object Diagrams: Basics"),
                    new OfficialDeadline("2020-09-03",LocalDate.of(2020,9,3)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0407"), new WeekNumber("4"), new Description("Add Increments as branches: A-Gradle, A-CheckStyle, Level-10, A-Varargs"),
                    new OfficialDeadline("2020-09-03",LocalDate.of(2020,9,3)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0408"), new WeekNumber("4"), new Description("Start weekly project meetings"),
                    new OfficialDeadline("2020-09-03",LocalDate.of(2020,9,3)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0409"), new WeekNumber("4"), new Description("Decide on an overall project direction"),
                        new OfficialDeadline("2020-09-03",LocalDate.of(2020,9,3)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0410"), new WeekNumber("4"), new Description("Class Diagrams: Intermediate-Level"),
                        new OfficialDeadline("2020-09-03",LocalDate.of(2020,9,3)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0411"), new WeekNumber("4"), new Description("Java: JavaFX"),
                        new OfficialDeadline("2020-09-03",LocalDate.of(2020,9,3)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0412"), new WeekNumber("4"), new Description("Java: varargs"),
                        new OfficialDeadline("2020-09-03",LocalDate.of(2020,9,3)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0413"), new WeekNumber("4"), new Description("Code Quality: Naming"),
                        new OfficialDeadline("2020-09-03",LocalDate.of(2020,9,3)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0414"), new WeekNumber("4"), new Description("Static Analysis"),
                        new OfficialDeadline("2020-09-03",LocalDate.of(2020,9,3)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0415"), new WeekNumber("4"), new Description("Code reviews"),
                        new OfficialDeadline("2020-09-03",LocalDate.of(2020,9,3)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0416"), new WeekNumber("4"), new Description("RCS: Managing Pull Requests"),
                        new OfficialDeadline("2020-09-03",LocalDate.of(2020,9,3)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0417"), new WeekNumber("4"), new Description("Automating the Build Process"),
                        new OfficialDeadline("2020-09-03",LocalDate.of(2020,9,3)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0501"), new WeekNumber("5"), new Description("Submit post-lecture quiz "),
                    new OfficialDeadline("2020-09-10",LocalDate.of(2020,9,10)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0502"), new WeekNumber("5"), new Description("Requirements: Intro "),
                    new OfficialDeadline("2020-09-10",LocalDate.of(2020,9,10)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0503"), new WeekNumber("5"), new Description("Generate a new jar file"),
                    new OfficialDeadline("2020-09-10",LocalDate.of(2020,9,10)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0504"), new WeekNumber("5"), new Description("Choose user stories for v1.2"),
                    new OfficialDeadline("2020-09-10",LocalDate.of(2020,9,10)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0505"), new WeekNumber("5"), new Description("Practice peer evaluation on TEAMMATES"),
                    new OfficialDeadline("2020-09-10",LocalDate.of(2020,9,10)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0506"), new WeekNumber("5"), new Description("Requirements: Gathering"),
                    new OfficialDeadline("2020-09-10",LocalDate.of(2020,9,10)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0507"), new WeekNumber("5"), new Description("Add Increments as PRs: A-Assertions, A-CodeQuality, A-Lambdas, A-Streams"),
                    new OfficialDeadline("2020-09-10",LocalDate.of(2020,9,10)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0508"), new WeekNumber("5"), new Description("Brainstorm user stories"),
                    new OfficialDeadline("2020-09-10",LocalDate.of(2020,9,10)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0509"), new WeekNumber("5"), new Description("Requirements: Specifying"),
                        new OfficialDeadline("2020-09-10",LocalDate.of(2020,9,10)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0510"), new WeekNumber("5"), new Description("Code Quality"),
                        new OfficialDeadline("2020-09-10",LocalDate.of(2020,9,10)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0511"), new WeekNumber("5"), new Description("Refactoring"),
                        new OfficialDeadline("2020-09-10",LocalDate.of(2020,9,10)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0512"), new WeekNumber("5"), new Description("Assertions"),
                        new OfficialDeadline("2020-09-10",LocalDate.of(2020,9,10)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0513"), new WeekNumber("5"), new Description("Java: streams"),
                        new OfficialDeadline("2020-09-10",LocalDate.of(2020,9,10)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0514"), new WeekNumber("5"), new Description("RCS: Managing Pull Requests"),
                        new OfficialDeadline("2020-09-10",LocalDate.of(2020,9,10)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0515"), new WeekNumber("5"), new Description("Add Increment: A-CI"),
                        new OfficialDeadline("2020-09-10",LocalDate.of(2020,9,10)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0516"), new WeekNumber("5"), new Description("Add an extension"),
                        new OfficialDeadline("2020-09-10",LocalDate.of(2020,9,10)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0601"), new WeekNumber("6"), new Description("Submit post-lecture quiz"),
                    new OfficialDeadline("2020-09-17",LocalDate.of(2020,9,17)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0602"), new WeekNumber("6"), new Description("Architecture Diagrams"),
                    new OfficialDeadline("2020-09-17",LocalDate.of(2020,9,17)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0603"), new WeekNumber("6"), new Description("Add Increment: A-BetterGui"),
                    new OfficialDeadline("2020-09-17",LocalDate.of(2020,9,17)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0604"), new WeekNumber("6"), new Description("Conceptualize v1.2"),
                    new OfficialDeadline("2020-09-17",LocalDate.of(2020,9,17)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0605"), new WeekNumber("6"), new Description("[optional] Submit mid-term feedback for the module"),
                    new OfficialDeadline("2020-09-17",LocalDate.of(2020,9,17)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0606"), new WeekNumber("6"), new Description("Modeling: Sequence Diagram"),
                    new OfficialDeadline("2020-09-17",LocalDate.of(2020,9,17)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0607"), new WeekNumber("6"), new Description("Finalize the features"),
                    new OfficialDeadline("2020-09-17",LocalDate.of(2020,9,17)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0608"), new WeekNumber("6"), new Description("Draft the UG"),
                    new OfficialDeadline("2020-09-17",LocalDate.of(2020,9,17)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0609"), new WeekNumber("6"), new Description("Refine the product design"),
                        new OfficialDeadline("2020-09-17",LocalDate.of(2020,9,17)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0610"), new WeekNumber("6"), new Description(" Set up the project repo"),
                        new OfficialDeadline("2020-09-17",LocalDate.of(2020,9,17)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0611"), new WeekNumber("6"), new Description("Get familiar with the code base"),
                        new OfficialDeadline("2020-09-17",LocalDate.of(2020,9,17)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0612"), new WeekNumber("6"), new Description("IDEs: Intermediate Features"),
                        new OfficialDeadline("2020-09-17",LocalDate.of(2020,9,17)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0613"), new WeekNumber("6"), new Description("Logging"),
                        new OfficialDeadline("2020-09-17",LocalDate.of(2020,9,17)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0701"), new WeekNumber("7"), new Description("Submit post-lecture quiz"),
                    new OfficialDeadline("2020-10-01",LocalDate.of(2020,10,1)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0702"), new WeekNumber("7"), new Description("Requirements: Use Cases"),
                    new OfficialDeadline("2020-10-01",LocalDate.of(2020,10,1)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0703"), new WeekNumber("7"), new Description("[Optional] Get more out of the iP"),
                    new OfficialDeadline("2020-09-28",LocalDate.of(2020,9,28)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0704"), new WeekNumber("7"), new Description("Do a practice iteration"),
                    new OfficialDeadline("2020-10-01",LocalDate.of(2020,10,1)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0705"), new WeekNumber("7"), new Description("Update the DG: user stories, glossary, NFRs, use cases"),
                    new OfficialDeadline("2020-10-01",LocalDate.of(2020,10,1)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0706"), new WeekNumber("7"), new Description("Design: High-Level View"),
                    new OfficialDeadline("2020-10-01",LocalDate.of(2020,10,1)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0707"), new WeekNumber("7"), new Description("Update the UG"),
                    new OfficialDeadline("2020-09-28",LocalDate.of(2020,9,28)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0708"), new WeekNumber("7"), new Description("Update project website: AboutUs, README"),
                    new OfficialDeadline("2020-10-01",LocalDate.of(2020,10,1)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0709"), new WeekNumber("7"), new Description("Plan the next iteration"),
                        new OfficialDeadline("2020-09-28",LocalDate.of(2020,9,28)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0710"), new WeekNumber("7"), new Description("Start implementing the next version"),
                        new OfficialDeadline("2020-10-01",LocalDate.of(2020,10,1)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0711"), new WeekNumber("7"), new Description("Design: Fundamentals "),
                        new OfficialDeadline("2020-10-01",LocalDate.of(2020,10,1)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0712"), new WeekNumber("7"), new Description("IDEs: Advanced Features : OPTIONAL"),
                        new OfficialDeadline("2020-10-01",LocalDate.of(2020,10,1)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0713"), new WeekNumber("7"), new Description("Integration Approaches"),
                        new OfficialDeadline("2020-10-01",LocalDate.of(2020,10,1)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0714"), new WeekNumber("7"), new Description("Project Mgt: Scheduling and Tracking"),
                        new OfficialDeadline("2020-10-01",LocalDate.of(2020,10,1)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0715"), new WeekNumber("7"), new Description("Project Mgt: Workflows"),
                        new OfficialDeadline("2020-10-01",LocalDate.of(2020,10,1)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0801"), new WeekNumber("8"), new Description("Submit post-lecture quiz"),
                    new OfficialDeadline("2020-10-09",LocalDate.of(2020,10,9)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0802"), new WeekNumber("8"), new Description("[Revisiting] Drawing Class/Object Diagrams - Basics"),
                    new OfficialDeadline("2020-10-09",LocalDate.of(2020,10,9)), null, new Remark("Nothing here"), false, false),
            new IP(new Index("0803"), new WeekNumber("8"), new Description("Evaluate two peer iPs "),
                    new OfficialDeadline("2020-10-10",LocalDate.of(2020,10,10)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0804"), new WeekNumber("8"), new Description("Ensure you know tP expectations"),
                    new OfficialDeadline("2020-10-09",LocalDate.of(2020,10,9)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0805"), new WeekNumber("8"), new Description("Submit Midterm Peer Evaluations on TEAMMATES"),
                    new OfficialDeadline("2020-10-11",LocalDate.of(2020,10,11)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0806"), new WeekNumber("8"), new Description("[Revisiting] Drawing Class/Object Diagrams - Intermediate"),
                    new OfficialDeadline("2020-10-09",LocalDate.of(2020,10,9)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0807"), new WeekNumber("8"), new Description("Start proper milestone management"),
                    new OfficialDeadline("2020-10-10",LocalDate.of(2020,10,10)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0808"), new WeekNumber("8"), new Description("Add the first functionality increment"),
                    new OfficialDeadline("2020-10-09",LocalDate.of(2020,10,9)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0809"), new WeekNumber("8"), new Description("[Revisiting] Drawing Class/Object Diagrams - Intermediate"),
                        new OfficialDeadline("2020-10-09",LocalDate.of(2020,10,9)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0810"), new WeekNumber("8"), new Description("Testing: Types"),
                        new OfficialDeadline("2020-10-10",LocalDate.of(2020,10,10)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0811"), new WeekNumber("8"), new Description("Testing: Intermediate Concepts"),
                        new OfficialDeadline("2020-10-09",LocalDate.of(2020,10,9)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("0901"), new WeekNumber("9"), new Description("Submit post-lecture quiz"),
                    new OfficialDeadline("2020-10-15",LocalDate.of(2020,10,15)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0902"), new WeekNumber("9"), new Description("OO Domain Models"),
                    new OfficialDeadline("2020-10-15",LocalDate.of(2020,10,15)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0903"), new WeekNumber("9"), new Description("Conceptualizing a Design"),
                    new OfficialDeadline("2020-10-15",LocalDate.of(2020,10,15)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0904"), new WeekNumber("9"), new Description("Deliver v1.2"),
                    new OfficialDeadline("2020-10-15",LocalDate.of(2020,10,15)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0905"), new WeekNumber("9"), new Description("Wrap up v1.2"),
                    new OfficialDeadline("2020-10-15",LocalDate.of(2020,10,15)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0906"), new WeekNumber("9"), new Description("Activity Diagrams"),
                    new OfficialDeadline("2020-10-15",LocalDate.of(2020,10,15)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0907"), new WeekNumber("9"), new Description("Architecture Diagrams: Drawing"),
                    new OfficialDeadline("2020-10-15",LocalDate.of(2020,10,15)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("0908"), new WeekNumber("9"), new Description("Do an informal demo of v1.2"),
                    new OfficialDeadline("2020-10-15",LocalDate.of(2020,10,15)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0909"), new WeekNumber("9"), new Description("Design Principles"),
                        new OfficialDeadline("2020-10-15",LocalDate.of(2020,10,15)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0910"), new WeekNumber("9"), new Description("[Revisiting] SDLC Process Models"),
                        new OfficialDeadline("2020-10-15",LocalDate.of(2020,10,15)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0911"), new WeekNumber("9"), new Description("SDLC Process Models (continued) "),
                        new OfficialDeadline("2020-10-15",LocalDate.of(2020,10,15)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("0912"), new WeekNumber("9"), new Description("Writing Developer Documents"),
                        new OfficialDeadline("2020-10-15",LocalDate.of(2020,10,15)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("01001"), new WeekNumber("10"), new Description("Submit post-lecture quiz"),
                    new OfficialDeadline("2020-10-22",LocalDate.of(2020,10,22)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("01002"), new WeekNumber("10"), new Description("Design Patterns"),
                    new OfficialDeadline("2020-10-22",LocalDate.of(2020,10,22)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("01003"), new WeekNumber("10"), new Description("Test Cases: Intro"),
                    new OfficialDeadline("2020-10-22",LocalDate.of(2020,10,22)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("01004"), new WeekNumber("10"), new Description("Do a postmortem of the previous iteration"),
                    new OfficialDeadline("2020-10-22",LocalDate.of(2020,10,22)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("01005"), new WeekNumber("10"), new Description("Adjust process rigor if necessary"),
                    new OfficialDeadline("2020-10-22",LocalDate.of(2020,10,22)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("01006"), new WeekNumber("10"), new Description("Defensive Programming"),
                    new OfficialDeadline("2020-10-22",LocalDate.of(2020,10,22)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("01007"), new WeekNumber("10"), new Description("Start the next iteration"),
                    new OfficialDeadline("2020-10-22",LocalDate.of(2020,10,22)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("01008"), new WeekNumber("10"), new Description("Update the DG with design details"),
                    new OfficialDeadline("2020-10-22",LocalDate.of(2020,10,22)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("01009"), new WeekNumber("10"), new Description("Smoke-test CATcher [COMPULSORY]"),
                        new OfficialDeadline("2020-10-22",LocalDate.of(2020,10,22)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("01010"), new WeekNumber("10"), new Description("Do a trial JAR release"),
                        new OfficialDeadline("2020-10-22",LocalDate.of(2020,10,22)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("01101"), new WeekNumber("11"), new Description("Submit post-lecture quiz"),
                    new OfficialDeadline("2020-10-29",LocalDate.of(2020,10,29)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("01102"), new WeekNumber("11"), new Description("More Design Patterns"),
                    new OfficialDeadline("2020-10-29",LocalDate.of(2020,10,29)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("01103"), new WeekNumber("11"), new Description("Deliver v1.3"),
                    new OfficialDeadline("2020-10-29",LocalDate.of(2020,10,29)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("01104"), new WeekNumber("11"), new Description("Update user docs"),
                    new OfficialDeadline("2020-10-29",LocalDate.of(2020,10,29)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("01105"), new WeekNumber("11"), new Description("Architectural Styles"),
                    new OfficialDeadline("2020-10-29",LocalDate.of(2020,10,29)), null, new Remark("Nothing here"), false, false),
            new Topic(new Index("01106"), new WeekNumber("11"), new Description("Test Cases: Combining Multiple Inputs"),
                    new OfficialDeadline("2020-10-29",LocalDate.of(2020,10,29)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("01107"), new WeekNumber("11"), new Description("Release as a jar file"),
                    new OfficialDeadline("2020-10-29",LocalDate.of(2020,10,29)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("01108"), new WeekNumber("11"), new Description("Ensure the code RepoSense-compatible"),
                    new OfficialDeadline("2020-10-29",LocalDate.of(2020,10,29)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("01109"), new WeekNumber("11"), new Description("Wrap up v1.3"),
                        new OfficialDeadline("2020-10-29",LocalDate.of(2020,10,29)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("01110"), new WeekNumber("11"), new Description("Demo v1.3"),
                        new OfficialDeadline("2020-10-29",LocalDate.of(2020,10,29)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("01111"), new WeekNumber("11"), new Description("Other QA Techniques"),
                        new OfficialDeadline("2020-10-29",LocalDate.of(2020,10,29)), null, new Remark("Nothing here"), false, false),
                new TP(new Index("01110"), new WeekNumber("11"), new Description("Reuse"),
                        new OfficialDeadline("2020-10-29",LocalDate.of(2020,10,29)), null, new Remark("Nothing here"), false, false),
                new TP(new Index("01109"), new WeekNumber("11"), new Description("Cloud Computing"),
                        new OfficialDeadline("2020-10-29",LocalDate.of(2020,10,29)), null, new Remark("Nothing here"), false, false),
                new TP(new Index("01110"), new WeekNumber("11"), new Description("Other UML Models"),
                        new OfficialDeadline("2020-10-29",LocalDate.of(2020,10,29)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("01201"), new WeekNumber("12"), new Description("Double-check RepoSense compatibility"),
                    new OfficialDeadline("2020-11-06",LocalDate.of(2020,11,6)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("01202"), new WeekNumber("12"), new Description("Draft the PPP"),
                    new OfficialDeadline("2020-11-06",LocalDate.of(2020,11,6)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("01203"), new WeekNumber("12"), new Description("Tweak the product as per peer-testing results"),
                    new OfficialDeadline("2020-11-06",LocalDate.of(2020,11,6)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("01204"), new WeekNumber("12"), new Description("Attend the practical exam dry run"),
                    new OfficialDeadline("2020-10-30",LocalDate.of(2020,10,30)), null, new Remark("Nothing here"), false, false),
            new Admin(new Index("01301"), new WeekNumber("13"), new Description("Submit Final Peer Evaluation on TEAMMATES"),
                    new OfficialDeadline("2020-11-12",LocalDate.of(2020,11,12)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("01302"), new WeekNumber("13"), new Description("Attend the practical exam"),
                    new OfficialDeadline("2020-11-13",LocalDate.of(2020,11,13)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("01303"), new WeekNumber("13"), new Description("Submit deliverables"),
                    new OfficialDeadline("2020-11-09",LocalDate.of(2020,11,9)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("01304"), new WeekNumber("13"), new Description("Wrap up the milestone"),
                    new OfficialDeadline("2020-11-11",LocalDate.of(2020,11,11)), null, new Remark("Nothing here"), false, false),
            new TP(new Index("01305"), new WeekNumber("13"), new Description("Do final tweaks to the feature"),
                    new OfficialDeadline("2020-11-10",LocalDate.of(2020,11,10)), null, new Remark ("Nothing here"), false, false),
            new TP(new Index("01306"), new WeekNumber("13"), new Description("Submit the demo video"),
                    new OfficialDeadline("2020-11-11",LocalDate.of(2020,11,11)), null, new Remark("Nothing here"), false, false)
        };
    }

    public static TaskList getSampleTaskList() {
        TaskList sampleTaskList = new TaskList();
        for (Task sampleTask : getSampleTasks()) {
            sampleTaskList.add(sampleTask);
        }
        return sampleTaskList;
    }
}
