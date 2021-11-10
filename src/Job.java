public class Job {
    private String jobName;
    private String city;

    public int getSalaryOfJob() {
        return salaryOfJob;
    }

    public void setSalaryOfJob(int salaryOfJob) {
        this.salaryOfJob = salaryOfJob;
    }

    private int salaryOfJob;

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }



    @Override
    public String toString() {
        return "Job{" +
                "Job='" + jobName + '\'' +
                ", City='" + city + '\'' +
                ", Salary='" + salaryOfJob + '\'' +
                '}';
    }
}
