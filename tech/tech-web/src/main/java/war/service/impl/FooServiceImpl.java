package war.service.impl;

import javax.annotation.Resource;

import war.dao.FooDao;
import war.api.FooDto;
import war.model.Foo;
import war.dto.impl.FooDtoImpl;
import war.service.FooService;

public class FooServiceImpl implements FooService {
	@Resource
	private FooDao fooDao;

    @Override
	public FooDto getById(Integer id) {
        Foo f = fooDao.selectById(id);
		return new FooDtoImpl(f);
	}
}
