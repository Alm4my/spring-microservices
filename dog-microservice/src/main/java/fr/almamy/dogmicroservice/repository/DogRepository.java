package fr.almamy.dogmicroservice.repository;

import fr.almamy.dogmicroservice.entity.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends CrudRepository<Dog, Long> {

}
