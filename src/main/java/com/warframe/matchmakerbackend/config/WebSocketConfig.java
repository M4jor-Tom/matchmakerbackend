package com.warframe.matchmakerbackend.config;

import java.security.Principal;
import java.util.Map;
import java.util.UUID;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.server.support.DefaultHandshakeHandler;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

	  @Override
	  public void configureMessageBroker(MessageBrokerRegistry config) {
	    config.enableSimpleBroker("/ws-broker");
        config.setUserDestinationPrefix("/secured/ws-user");
	  }

	  @Override
	  public void registerStompEndpoints(StompEndpointRegistry registry) {
	    registry.addEndpoint("/ws-endpoint")
	    .setHandshakeHandler(new DefaultHandshakeHandler() {
	    	// Custom class for storing principal
	        @Override
	        protected Principal determineUser(
	            ServerHttpRequest request,
	            WebSocketHandler wsHandler,
	            Map<String, Object> attributes
	        ) {
	            // Generate principal with UUID as name
	            return new StompPrincipal(UUID.randomUUID().toString());
	        }
	    })
	    .setAllowedOriginPatterns("*").withSockJS();
	  }
	  
	  private class StompPrincipal implements Principal {
      	private String name;

        public StompPrincipal(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }
    }
}
