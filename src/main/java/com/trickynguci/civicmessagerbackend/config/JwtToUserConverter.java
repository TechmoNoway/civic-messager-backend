package com.trickynguci.civicmessagerbackend.config;

import com.trickynguci.civicmessagerbackend.model.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class JwtToUserConverter implements Converter<Jwt, UsernamePasswordAuthenticationToken> {


    @Override
    public UsernamePasswordAuthenticationToken convert(Jwt jwt) {
        User user = new User();
        user.setId(Integer.parseInt(jwt.getSubject()));
        return new UsernamePasswordAuthenticationToken(user, jwt, Collections.emptyList());
    }
}
