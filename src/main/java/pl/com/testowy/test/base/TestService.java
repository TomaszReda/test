package pl.com.testowy.test.base;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestService
{
    private final CarAssembler carAssembler;


    public void cos(){
        TestEntity test=new TestEntity();
        Car car=new Car();
        val object=carAssembler.mapToDto(test);
    }

}
