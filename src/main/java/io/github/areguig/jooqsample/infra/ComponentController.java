package io.github.areguig.jooqsample.infra;

import io.github.areguig.jooqsample.domain.Component;
import io.github.areguig.jooqsample.application.MonitoringService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Log
@RestController
@RequiredArgsConstructor
@RequestMapping("/components")
public class ComponentController {

    private final MonitoringService monitoringService;

    @ApiOperation(
        value = "Get the list of components"
    )
    @ApiResponses({
        @ApiResponse(
            code = 200,
            message = "The list of components has been successfully retrieved",
            response = Component.class
        )
    })
    @GetMapping
    public List<Component> components() {
        log.info("returning all components.");
        return monitoringService.enabledComponents();
    }


}
