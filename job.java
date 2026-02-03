package model;

public class Job {
    private int jobId;
    private String title;
    private String requiredSkill;

    public Job(int jobId, String title, String requiredSkill) {
        this.jobId = jobId;
        this.title = title;
        this.requiredSkill = requiredSkill;
    }

    public int getJobId() {
        return jobId;
    }

    public String getTitle() {
        return title;
    }

    public String getRequiredSkill() {
        return requiredSkill;
    }
}
