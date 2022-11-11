package pl.com.testowy.controller;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.com.testowy.test.entity.PredicateService;
import pl.com.testowy.test.entity.model.Doctor;
import pl.com.testowy.test.entity.model.Nurse;
import pl.com.testowy.test.entity.model.Person;
import pl.com.testowy.test.entity.repository.DoctorRepository;
import pl.com.testowy.test.entity.repository.NurseRepository;
import pl.com.testowy.test.entity.repository.PersonRepository;
import pl.com.testowy.test.interfase.Employers;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class TestController {
    private final PersonRepository personRepository;
    private final NurseRepository nurseRepository;

    private final DoctorRepository doctorRepository;

    private final List<pl.com.testowy.test.interfase.PolicySearch> policySearch;

    private final PredicateService predicateService;


    @GetMapping("/testt")
    public void test2() {
        Predicate predicate=predicateService.get();
        nurseRepository.findAll(predicate);


    }

    @GetMapping("/test")
    public void test() {
        Employers employers=new Employers(10L);
        policySearch.stream().forEach(x -> x.search(employers));
        System.err.println(employers);
        Nurse nurse = new Nurse("a", "b", "c");
        Person person = new Nurse("test", "test2,", "test3");
        Doctor doctor = new Doctor("d", "f", "g");
        nurseRepository.save(nurse);
        personRepository.save(person);
        doctorRepository.save(doctor);

        personRepository.findAll();
        nurseRepository.findAll();

    }

    @PostMapping("/test")
    public String test(@RequestBody String test) {
        String s = "";
        Optional<String> optionalS = Optional.empty();
        Optional.ofNullable(s).ifPresent(x -> System.err.println(x));
//        String b=Optional.ofNullable(s).orElse("aaaaaa");
//        System.err.println(b);
        return "aaaa";
    }
}
