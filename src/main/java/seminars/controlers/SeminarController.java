package seminars.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import seminars.entities.Seminar;
import seminars.services.SeminarService;

import java.util.List;

@Controller
public class SeminarController {

    @Autowired
    private SeminarService seminarService;

    @RequestMapping("/")
    @ResponseBody
    public List<Seminar> homeController() {
        return seminarService.getSeminars();
    }

}
