package at.refugeecode.diagnose.Control;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
    private Integer  counter= 0;

    @Scheduled(fixedRate = 1000)
    public void Paitent(){
        System.out.println(counter);
        counter++;
    }
}
