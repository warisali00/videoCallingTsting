//package videoCallTesting.videoCallingTsting;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.messaging.simp.SimpMessagingTemplate;
//import org.springframework.stereotype.Service;
//
//@Service
//public class VideoCallService {
//
//    @Autowired
//    private SimpMessagingTemplate messagingTemplate;
//
//    // Method to initiate a call
//    public void initiateCall(String callerUsername, String calleeUsername) {
//        messagingTemplate.convertAndSendToUser(calleeUsername, "/queue/call", callerUsername);
//    }
//
//    // Method to handle call acceptance
//    public void acceptCall(String callerUsername, String calleeUsername) {
//        messagingTemplate.convertAndSendToUser(callerUsername, "/queue/accept", calleeUsername);
//    }
//
//    // Method to handle call rejection or end call
//    public void endCall(String username) {
//        messagingTemplate.convertAndSendToUser(username, "/queue/end",true);
//}
//}
//
