package com.isikapevision.tvremotecontrol.soap;
import org.springframework.stereotype.Service;

import javax.xml.soap.*;

import static com.isikapevision.tvremotecontrol.util.Constants.PANASONIC_URN_COMMAND;
import static com.isikapevision.tvremotecontrol.util.Constants.PANASONIC_URN_RENDER;

@Service
public class PanasonicSoap {

    private void createSoapEnvelope(SOAPMessage soapMessage, String command, String soapAction) throws SOAPException {
        SOAPPart soapPart = soapMessage.getSOAPPart();
        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        // SOAP Body
        SOAPBody soapBody = envelope.getBody();
        String namespace = "u";
        if (soapAction.endsWith("SetVolume\"")){
            String namespaceURN = PANASONIC_URN_RENDER;
            SOAPElement soapBodyElem = soapBody.addChildElement("SetVolume", namespace, namespaceURN);
            soapBodyElem.addChildElement("InstanceID").addTextNode("0");
            soapBodyElem.addChildElement("Channel").addTextNode("Master");
            soapBodyElem.addChildElement("DesiredVolume").addTextNode(command);
        } else {
            String namespaceURN = PANASONIC_URN_COMMAND;
            SOAPElement soapBodyElem = soapBody.addChildElement("X_SendKey", namespace, namespaceURN);
            soapBodyElem.addChildElement("X_KeyEvent").addTextNode(command);
        }
    }

    public void callSoapWebService(String soapEndpointUrl, String soapAction, String command) {
        try {
            // Create SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

            // Send SOAP Message to SOAP Server
            SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(soapAction, command), soapEndpointUrl);

            // Print the SOAP Response
            System.out.println("Response SOAP Message:");
            soapResponse.writeTo(System.out);
            System.out.println();

            soapConnection.close();
        } catch (Exception e) {
            System.err.println("\nError occurred while sending SOAP Request to Server!\nMake sure you have the correct endpoint URL and SOAPAction!\n");
            e.printStackTrace();
        }
    }

    private SOAPMessage createSOAPRequest(String soapAction, String command) throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();

        createSoapEnvelope(soapMessage, command, soapAction);

        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPACTION", soapAction);

        soapMessage.saveChanges();

        /* Print the request message, just for debugging purposes */
        System.out.println("Request SOAP Message:");
        soapMessage.writeTo(System.out);
        System.out.println("\n");

        return soapMessage;
    }

}
