package com.example;



import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;


@Service
public class JwtService {

    private static final JwtBuilder Jwts = null;

    public String extractUsername(String token) {
        return null;
    }
    private Claims extractAClaims(String token) {
        return null;
        

    }

    private JwtBuilder extractAllClaims(String token) {
        return ((Object) Jwts)
        .parserbuilder()
        .setSignInkey(getSignInkey())
        .build()
        .parseClaimsjws(token)
        .getBody();

       
}
    private Object getSignInkey() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSignInkey'");
    }
        
        
        
    

    }

}

    

    



  

    


