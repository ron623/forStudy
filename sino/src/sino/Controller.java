package sino;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.web.bind.annotation.RequestMapping;


public class Controller {

	// @reruestmappingでURLをマッピング= "/sinoでアクセス"
    @RequestMapping(value = "/sino", method = GET)
    public String helloWorld() {
        return "helloWorld";
    }

}
