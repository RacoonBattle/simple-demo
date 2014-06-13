package war.service.impl;

import javax.annotation.Resource;

import war.dao.FooDao;
import war.api.FooDto;
import war.api.FooApi;
import war.model.Foo;
import war.dto.impl.FooDtoImpl;

public class FooApiImpl implements FooApi {
    @Resource
    private FooDao fooDao;

    @Override
    public FooDto getByUsername(String username) {
        Foo f = fooDao.selectByUsername(username);
        return new FooDtoImpl(f);
    }
}