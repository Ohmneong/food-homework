package foodhomework.infra;

import foodhomework.domain.*;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping(value="/cooks")
@Transactional
public class CookController {

    @Autowired
    CookRepository cookRepository;

    @RequestMapping(
        value = "cooks/",
        method = RequestMethod.POST,
        produces = "application/json;charset=UTF-8"
    )
    public Cook 승인(
        HttpServletRequest request,
        HttpServletResponse response,
        @RequestBody Cook cook
    ) throws Exception {
        System.out.println("##### /cook/승인  called #####");
        cook.승인(승인command);
        cookRepository.save(cook);
        return cook;
    }
}
