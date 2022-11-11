package pl.com.testowy.scheduler;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Configuration
@EnableScheduling
@RequiredArgsConstructor
public class TestScheduler {


    @Scheduled(fixedDelay = 30000)
    public void scheduleFixedDelayTask() {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        int result = numbers
                .stream()
                .reduce(0, (subtotal, element) -> subtotal + element);
        int result2 = numbers.stream().reduce(0, Integer::max);

        System.err.println(result2);
        System.err.println(result);

        System.out.println(
                "Fixed delay task1 - " + System.currentTimeMillis() / 1000);
    }


}
