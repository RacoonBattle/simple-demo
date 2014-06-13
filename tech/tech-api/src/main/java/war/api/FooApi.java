package war.api;

import war.api.FooDto;

public interface FooApi {
    FooDto getByUsername(String username);
}