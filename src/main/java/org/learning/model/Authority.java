package org.learning.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Authorities", indexes = {
        @Index(columnList = "username"),
        @Index(columnList = "username,authority", unique = true)
})
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "username")
    private User user;

    @NotNull
    private String authority;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
