package pl.com.testowy.test.interfase;

import org.springframework.stereotype.Component;

@Component
public class LifePOlicySearch implements PolicySearch{

    @Override
    public void search(Employers s) {
        System.err.println("aaaaa");
    }
}
