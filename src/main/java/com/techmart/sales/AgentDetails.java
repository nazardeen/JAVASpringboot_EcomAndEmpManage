package com.techmart.sales;

import java.util.Collection;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


import com.techmart.sales.model.UserSalesAgent;

public class AgentDetails implements UserDetails {

	
	private UserSalesAgent agent;
	
	
	
	public AgentDetails(UserSalesAgent agent) {
		
		this.agent = agent;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getPassword() {
		return agent.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return agent.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		
		return true;
	}

	@Override
	public boolean isEnabled() {
		
		return true;
	}
	
	public String getFullNamee() {
		return agent.getFirstName() + " "+ agent.getLastName();
	}

	public UserSalesAgent getAgent() {
		return agent;
	}

	public void setAgent(UserSalesAgent agent) {
		this.agent = agent;
	}


	


}
