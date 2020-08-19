public class DukeException extends Exception {
    protected String type;

    public DukeException(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        if (this.type.equals("other")) {
            return "\uD83D\uDE41" + " OOPS!!! I'm sorry, but I don't know what that means :-(";
        } else if (this.type.equals("done")) {
            return "\uD83D\uDE41" + " OOPS!!! Please indicate the numbering of task that has to be marked as done.";
        } else if (this.type.equals("delete")) {
            return "\uD83D\uDE41" + " OOPS!!! Please indicate the numbering of task that has to be deleted.";
        }
        return "\uD83D\uDE41" + " OOPS!!! The description of a " + this.type + " cannot be empty.";
    }
}
