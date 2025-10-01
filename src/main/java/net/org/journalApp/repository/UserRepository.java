package net.org.journalApp.repository;

import net.org.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    public User findByUserName(String userName);

    public void deleteByUserName(String userName);
}
