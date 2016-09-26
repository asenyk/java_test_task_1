package seminars.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import seminars.entities.Seminar;

import java.util.List;

@Transactional
@Repository
public interface SeminarRepository extends CrudRepository<Seminar, Integer> {

    public List<Seminar> findAll();

}