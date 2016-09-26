package seminars.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import seminars.entities.Seminar;
import seminars.repositories.SeminarRepository;

import java.util.List;

@Component
public class SeminarService {

    @Autowired
    private SeminarRepository seminarRepository;

    public List<Seminar> getSeminars() {
        return seminarRepository.findAll();
    }

}
