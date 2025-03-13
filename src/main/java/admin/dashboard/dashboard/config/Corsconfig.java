package admin.dashboard.dashboard.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.List;
@Configuration
public class Corsconfig {



//        @Bean
//        public CorsFilter corsFilter() {
//            CorsConfiguration corsConfiguration = new CorsConfiguration();
//            corsConfiguration.setAllowedOrigins(List.of("http://localhost:/*")); // Allow your frontend
//            corsConfiguration.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS"));
//            corsConfiguration.setAllowedHeaders(List.of("Content-Type", "Authorization"));
//            corsConfiguration.setAllowCredentials(true);
//
//            UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//            source.registerCorsConfiguration("/**", corsConfiguration);
//            return new CorsFilter(source);
//        }
    }

