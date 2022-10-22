package com.isikapevision.tvremotecontrol.service;

public interface PanasonicService {

    void sendRequest(String friendlyCommand);

    void sendVolumeRequest(String volume);
}
