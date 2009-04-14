package org.springframework.security.core;

import java.util.Collections;
import java.util.List;

import org.springframework.util.Assert;

public class GrantedAuthoritiesContainerImpl implements MutableGrantedAuthoritiesContainer {
    private List<GrantedAuthority> authorities;

    public void setGrantedAuthorities(List<GrantedAuthority> newAuthorities) {
        authorities = Collections.unmodifiableList(newAuthorities);
    }

    public List<GrantedAuthority> getGrantedAuthorities() {
        Assert.notNull(authorities, "Granted authorities have not been set");
        return authorities;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Authorities: ").append(authorities);
        return sb.toString();
    }
}