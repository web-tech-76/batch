package batch.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@EnableScheduling
@SpringBootApplication
public class BatchApplication {


    public static void main(String[] args) {
        SpringApplication.run(BatchApplication.class, args);
    }


    @Component
    class TaskExecute {

        @Scheduled(fixedRate = 2000)
        public void perform() {
            System.out.println("print it every 2 seconds");
        }

    }


}
