package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-04T09:21:46.902+10:00[Australia/Sydney]")

@Controller
@RequestMapping("${openapi.consumerDataStandards.base-path:/cds-au/v1}")
public class CommonApiController implements CommonApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CommonApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
