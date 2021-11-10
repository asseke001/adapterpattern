abstract class NewJob implements Jobs {
    private String jobName;
    private City city;
    private int salaryOfJob;


    public int getSalaryOfJob() {
        return 100000;
    }

    public void setSalaryOfJob(int salaryOfJob) {
        this.salaryOfJob = salaryOfJob;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
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
