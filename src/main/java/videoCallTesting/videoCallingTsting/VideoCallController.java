//package videoCallTesting.videoCallingTsting;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/video")
//public class VideoCallController {
//
////    String callerUsername = "abc";
//
//    @Autowired
//    private VideoCallService videoCallService;
//
////    @PostMapping("/call")
////    public ResponseEntity<String> initiateCall(@RequestParam String callerUsername, @RequestParam String calleeUsername) {
////        videoCallService.initiateCall(callerUsername, calleeUsername);
////        return ResponseEntity.ok("Call initiated successfully");
////    }
//
////    @PostMapping("/accept")
////    public ResponseEntity<String> acceptCall(@RequestParam String calleeUsername) {
////        videoCallService.acceptCall(calleeUsername);
////        return ResponseEntity.ok("Call accepted");
////    }
//@PostMapping("/call")
//public ResponseEntity<String> initiateCall(@RequestParam String callerUsername, @RequestParam String calleeUsername) {
//    videoCallService.initiateCall(callerUsername, calleeUsername);
//    return ResponseEntity.ok("Call initiated successfully");
//}
//
//    @PostMapping("/accept")
//    public ResponseEntity<String> acceptCall(@RequestParam String callerUsername, @RequestParam String calleeUsername) {
//        videoCallService.acceptCall(callerUsername, calleeUsername);
//        return ResponseEntity.ok("Call accepted");
//    }
//
//    @PostMapping("/end")
//    public ResponseEntity<String> endCall(@RequestParam String username) {
//        videoCallService.endCall(username);
//        return ResponseEntity.ok("Call ended");
//}
//}
