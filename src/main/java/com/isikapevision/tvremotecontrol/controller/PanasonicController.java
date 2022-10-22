package com.isikapevision.tvremotecontrol.controller;

import com.isikapevision.tvremotecontrol.service.PanasonicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.isikapevision.tvremotecontrol.util.Constants.*;

@RestController
@RequestMapping(PANASONIC_CONTROLLER_REQUEST_MAPPING)
public class PanasonicController {

    @Autowired
    private PanasonicService panasonicService;

    @GetMapping(PANASONIC_COMMAND_GET_MAPPING)
    public ResponseEntity<String> command(@PathVariable("friendlyCommand") String friendlyCommand) {
        panasonicService.sendRequest(friendlyCommand);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
