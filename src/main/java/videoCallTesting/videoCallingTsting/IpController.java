package videoCallTesting.videoCallingTsting;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")

public class IpController {
//    @GetMapping("/ip")
//    public String getClientIpAddress(HttpServletRequest request) {
//        String ipAddress = request.getHeader("X-FORWARDED-FOR");
//        if (ipAddress == null || ipAddress.isEmpty()) {
//            ipAddress = request.getRemoteAddr();
//        }
//        return ipAddress;
//    }
@GetMapping("/ip")
public IpAddressResponse getClientIpAddress(HttpServletRequest request) {
    String ipv4Address = null;
    String ipv6Address = null;

    String ipAddress = request.getHeader("X-FORWARDED-FOR");
    if (ipAddress == null || ipAddress.isEmpty()) {
        ipAddress = request.getRemoteAddr();
    }

    if (ipAddress.contains(":")) {
        ipv6Address = ipAddress;
    } else {
        ipv4Address = ipAddress;
    }

    // Check if there are multiple IP addresses (e.g., from X-Forwarded-For header)
    if (ipAddress != null && ipAddress.contains(",")) {
        for (String ip : ipAddress.split(",")) {
            if (ip.contains(":")) {
                ipv6Address = ip.trim();
            } else {
                ipv4Address = ip.trim();
            }
        }
    }

    return new IpAddressResponse(ipv4Address, ipv6Address);
}

}
