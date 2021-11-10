public class Main {
    public static void main(String[] args) {
     Job job=new Job();
        System.out.println("For the position: ");
     job.setJobName("Junior Java Developer");
        job.setCity("Kazakhstan,Almaty,Kabanbai batyra 68");
        Jobs jobs=new JobAdapter(job);
        System.out.println(jobs.getJobName());
        System.out.println(jobs.getCity());
        System.out.println("Salary for this job is: " + jobs.getSalaryOfJob()+" tg");
        System.out.println("We are waiting for you.");
    }
}
