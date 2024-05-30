package videoCallTesting.videoCallingTsting;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class SignalingController {

    private final SimpMessagingTemplate messagingTemplate;

    @Autowired
    public SignalingController(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @MessageMapping("/getOffer")
    public void getOffer(String username, String sdpOffer) {
        // Process the username and SDP offer
        // For demonstration, sending back the SDP offer to a specific user (broadcast example)
        this.messagingTemplate.convertAndSendToUser(username, "/queue/getOffer", sdpOffer);
    }
}
