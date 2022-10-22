package com.isikapevision.tvremotecontrol.util;

public class Constants {
    public static final String PANASONIC_CONTROLLER_REQUEST_MAPPING = "/tv/panasonic";
    public static final String PANASONIC_COMMAND_GET_MAPPING = "/{friendlyCommand}";
    public static final String PANASONIC_VOLUME_GET_MAPPING = "/volume/{volume}";
    public static final String PANASONIC_SOAP_ACTION_COMMAND = "\"urn:panasonic-com:service:p00NetworkControl:1#X_SendKey\"";
    public static final String PANASONIC_SOAP_ACTION_RENDER = "\"urn:schemas-upnp-org:service:RenderingControl:1#SetVolume\"";
    public static final String PANASONIC_URL_COMMAND = "/nrc/control_0";
    public static final String PANASONIC_URN_COMMAND = "urn:panasonic-com:service:p00NetworkControl:1";
    public static final String PANASONIC_URL_RENDER = "/dmr/control_0";
    public static final String PANASONIC_URN_RENDER = "urn:schemas-upnp-org:service:RenderingControl:1";

}
