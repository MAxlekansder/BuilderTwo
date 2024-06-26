package com.example.buildertwo.Configuration;


import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.jwk.source.JWKSource;
import com.nimbusds.jose.proc.SecurityContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import java.security.interfaces.RSAPublicKey;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    private final static Logger LOG =  LoggerFactory.getLogger(SecurityConfiguration.class);

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf(csrfCustomizwer ->
                        csrfCustomizwer
                                    .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
                )
                .sessionManagement(session ->
                        session
                                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                )
                .oauth2ResourceServer((oauth2) ->
                        oauth2
                                .jwt(Customizer.withDefaults())
                )
                .headers(headers ->
                        headers
                                .contentSecurityPolicy(policy ->
                                        policy
                                                .policyDirectives("script-src 'self'")
                                )
                )
                .build();
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(12);
    }


    @Bean
    public RSAKey rsaKey() {
        return Jwks.generateRSA();
    }


    @Bean
    public JwtEncoder jwtEncoder(RSAKey rsaKey) {
        JWKSource<SecurityContext> jwkSource = (((jwkSelector, securityContext) ->
                    jwkSelector.select(new JWKSet(rsaKey))));
                    return new NimbusJwtEncoder(jwkSource);
    }


    @Bean
    public JwtDecoder jwtDecoder() throws JOSEException {
        RSAPublicKey publicKey = (RSAPublicKey) rsaKey().toPublicKey();
        return NimbusJwtDecoder.withPublicKey(publicKey).build();
    }
}
