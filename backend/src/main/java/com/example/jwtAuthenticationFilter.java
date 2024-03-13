package com.example;

import java.io.IOException;

import org.springframework.lang.NonNull;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
@Component

public class jwtAuthenticationFilter extends OncePerRequestFilter {
    
    @Override
    protected void doFilterInternal(
      @NonNull  HttpServletRequest request, 
      @NonNull HttpServletResponse response,
      @NonNull FilterChain filterChain)
            throws ServletException, IOException {
             final String authHeader = request.getHeader("AUTHORIZATION");
             final String jwtToken;
             final String username;
      if (authHeader ==null ||!authHeader.startsWith("Bearer")) {
        filterChain.doFilter(request, response);
        return;
      }
      jwtToken  = authHeader.substring(7);
      username ="something"; //TODO to be implemented

      if (username != null && SecurityContextHolder.getContext().getAuthentication() ==null) {
        UserDetails userDetails = userDetailsService.loadUserByUserId(username);
        final boolean istokenValid; // TODO tobe implemented
        if (istokenValid) {
          
          Object credential;
          UsernamePasswordAuthenticationToken authToken = 
          new UsernamePasswordAuthenticationToken(userDetails,credential:null, userDetails.getAuthorities());
          jwtToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
          SecurityContextHolder.getContext().setAuthentication(authToken);
           
          
        }
      }
filterChain.doFilter(request, response);
      }
    
       
}



