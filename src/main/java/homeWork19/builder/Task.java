package homeWork19.builder;

public class Task {

    private String description;
    private String assignee;
    private String reporter;
    private int storyPoint;
    private int numberSprint;

    public String getDescription() {
        return description;
    }

    public String getAssignee() {
        if (this.assignee == null) {
            return "N/A";
        } else {
            return assignee;
        }
    }

    public String getReporter() {
        if (this.reporter == null) {
            return "N/A";
        } else {
            return reporter;
        }
    }

    public int getStoryPoint() {
        return storyPoint;
    }

    public int getNumberSprint() {
        return numberSprint;
    }

    private Task(Builder builder) {
        this.description = builder.description;
        this.assignee = builder.assignee;
        this.reporter = builder.reporter;
        this.storyPoint = builder.storyPoint;
        this.numberSprint = builder.numberSprint;
    }

    static class Builder {
        private String description;
        private String assignee;
        private String reporter;
        private int storyPoint;
        private int numberSprint;

        public Builder(String description) {
            this.description = description;
        }

        public Builder setAssignee(String assignee) {
            this.assignee = assignee;
            return this;
        }

        public Builder setReporter(String reporter) {
            this.reporter = reporter;
            return this;
        }

        public Builder setStoryPoint(int storyPoint) {
            this.storyPoint = storyPoint;
            return this;
        }

        public Builder setNumberSprint(int numberSprint) {
            this.numberSprint = numberSprint;
            return this;
        }

        public Task build() {
            return new Task(this);
        }
    }
}
