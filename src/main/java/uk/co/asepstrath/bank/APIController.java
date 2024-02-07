package uk.co.asepstrath.bank;

import io.jooby.ModelAndView;
import io.jooby.annotation.GET;
import io.jooby.annotation.Path;
import org.slf4j.Logger;
import org.json.JSONObject;
import javax.sql.DataSource;
import java.math.BigDecimal;

@Path("/api")
public class APIController {

    private final DataSource dataSource;
    private final Logger logger;

    /*
     * This constructor can take in any dependencies the controller may need to
     * respond to a request
     */
    public APIController(DataSource ds, Logger log) {
        dataSource = ds;
        logger = log;
    }

    @GET("/test")
    public JSONObject test(){
        Account test2 = new Account("API Testerson",new BigDecimal(12));
        JSONObject jo = new JSONObject("{ \"abc\" : \"def\" }");
        jo.put("name", "jon doe");
        jo.put("age", "22");
        jo.put("city", "chicago");
        return jo;
    }
}