package pl.com.testowy.test.interfase;

import org.springframework.stereotype.Component;


@Component
public class NoLifePolicySearch implements PolicySearch {


    @Override
    public void search(Employers s) {
        System.err.println("bbbbbbbbbb");
    }
}
