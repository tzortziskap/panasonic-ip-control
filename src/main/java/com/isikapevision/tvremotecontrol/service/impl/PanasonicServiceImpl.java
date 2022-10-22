package com.isikapevision.tvremotecontrol.service.impl;

import com.isikapevision.tvremotecontrol.enums.PanasonicCommands;
import com.isikapevision.tvremotecontrol.service.PanasonicService;
import com.isikapevision.tvremotecontrol.soap.PanasonicSoap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import static com.isikapevision.tvremotecontrol.util.Constants.*;

@Service
public class PanasonicServiceImpl implements PanasonicService {

    @Value("${panasonic.ip.address}")
    private String ipAddress;
    @Value("${panasonic.port}")
    private String port;


    @Autowired
    PanasonicSoap panasonicSoap;

    @Override
    public void sendRequest(String friendlyCommand) {
        PanasonicCommands panasonicCommands = PanasonicCommands.findByFriendlyCommand(friendlyCommand);
        if (panasonicCommands != null){
            String command = panasonicCommands.getCommand();
            String endpoint = ipAddress.concat(":").concat(port).concat(PANASONIC_URL_COMMAND);
            panasonicSoap.callSoapWebService(endpoint, PANASONIC_SOAP_ACTION_COMMAND, command);
        }
    }

    @Override
    public void sendVolumeRequest(String volume) {
        try{
            int vol = Integer.parseInt(volume);
            if (vol >= 0 && vol <= 100){
                String endpoint = ipAddress.concat(":").concat(port).concat(PANASONIC_URL_RENDER);
                panasonicSoap.callSoapWebService(endpoint, PANASONIC_SOAP_ACTION_RENDER, volume);
            }
        }catch (Exception e) {
            System.out.printf("Error " + e.getMessage());
        }

    }
}
