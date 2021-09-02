package ru.lyuchkov.heroesofroutine.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.lyuchkov.heroesofroutine.entities.User;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends MongoRepository<User, String> {
    List<User> findByNameOrEmail(@Param("name") String name, @Param("email") String email);

    List<User> findAll();

    List<User> findByNameAndPassword(@Param("name") String name, @Param("password") String password);

    User save(User user);


}
