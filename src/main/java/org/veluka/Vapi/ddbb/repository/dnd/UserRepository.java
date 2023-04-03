package org.veluka.Vapi.ddbb.repository.dnd;

import org.springframework.data.repository.CrudRepository;
import org.veluka.Vapi.ddbb.entities.dnd.User;



// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

}
