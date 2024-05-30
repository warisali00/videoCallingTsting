//package videoCallTesting.videoCallingTsting;
//
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//
//
//import org.springframework.context.annotation.Configuration;
//
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfigg implements WebMvcConfigurer {
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedOrigins("*") // Allow all origins (adjust as needed)
//                .allowedMethods("GET", "POST", "PUT", "DELETE")
//                .allowCredentials(true);
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
//    }
//}
