public class JobAdapter extends NewJob implements Jobs{
     private Job job;

     public JobAdapter(Job job){
        this.job=job;
        this.adapter();
     }

     private void adapter(){
        this.setJobName(job.getJobName());

        City city=new City();

        String[] asd= job.getCity().split(",");

        city.setCountryName(asd[0]);
        city.setCityName(asd[1]);
        city.setAddress(asd[2]);
        this.setCity(city);

     }
}
