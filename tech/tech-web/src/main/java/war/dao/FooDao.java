package war.dao;

import war.model.Foo;

public interface FooDao {

    Foo selectById(Integer id);

    Foo selectByUsername(String username);
}
