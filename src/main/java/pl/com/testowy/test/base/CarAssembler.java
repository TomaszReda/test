package pl.com.testowy.test.base;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class CarAssembler extends BaseAssembler<CarDto, Car> {


    @Override
    public CarDto mapToDto(Car entity) {
        return CarDto
                .builder()
                .name(entity.getName())
                .build();
    }

}
