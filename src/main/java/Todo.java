public class Todo extends Task {
    /**
     * Returns the task created with the specified
     * description.
     *
     * @param description the description of the task
     */
    public Todo(String description) {
        super(description);
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}