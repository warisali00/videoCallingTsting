package videoCallTesting.videoCallingTsting;



public class IpAddressResponse {
    private String ipv4Address;
    private String ipv6Address;

    public IpAddressResponse(String ipv4Address, String ipv6Address) {
        this.ipv4Address = ipv4Address;
        this.ipv6Address = ipv6Address;
    }

    public String getIpv4Address() {
        return ipv4Address;
    }

    public void setIpv4Address(String ipv4Address) {
        this.ipv4Address = ipv4Address;
    }

    public String getIpv6Address() {
        return ipv6Address;
    }

    public void setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
    }
}
