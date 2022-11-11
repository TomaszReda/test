package pl.com.testowy.test.base;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class
BaseAssembler<D, E> implements Function<E, D> {

    public List<D> mapToDto(List<? extends E> entity) {
        return entity
                .stream()
                .map(x -> mapToDto(x))
                .collect(Collectors.toList());
    }

    public abstract D mapToDto(E entity);

    @Override
    public D apply(E d) {
        return mapToDto(d);
    }
}
