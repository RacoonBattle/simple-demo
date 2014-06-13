package war.dto.impl;

import war.api.FooDto;
import war.model.Foo;
import war.api.AbstractDto;

public class FooDtoImpl extends AbstractDto<Foo> implements FooDto {

    public FooDtoImpl() { };


    public FooDtoImpl(Foo foo) {
        setTarget(foo);
    }

    @Override
    public String getUsername() {
        return getTarget().getUsername();
    }

}
