package br.com.teste.spring_batch;

import java.util.Date;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {

	String[] springConfig  =
		{
			"spring/batch/jobs/job.xml"
		};

	ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
	
	JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
	Job job = (Job) context.getBean("job1");
	
	try {

		/* teste inicial do job
		/*JobExecution execution = jobLauncher.run(job, new JobParameters());
		*/
		
		JobParametersBuilder builder = new JobParametersBuilder();
		builder.addDate("date", new Date());
		
		JobExecution execution = jobLauncher.run(job, builder.toJobParameters());
		
		System.out.println("Status : " + execution.getStatus());

	} catch (Exception e) {
		e.printStackTrace();
	}

	System.out.println("Cabo");

  }
}
