package foodhomework.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "store", url = "${api.url.store}")
public interface CookService {
    @RequestMapping(method = RequestMethod.POST, path = "/cooks/{id}")
    public void 승인(
        @PathVariable("id") Long id,
        @RequestBody 승인Command 승인Command
    );
}
