package at.refugeecode.nursery.repository;

import at.refugeecode.nursery.model.Paitent;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ApplicantRepository extends MongoRepository<Paitent,String> {

}
