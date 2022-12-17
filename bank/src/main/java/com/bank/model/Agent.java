package com.bank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Entity
public class Agent extends User {

    @OneToMany(mappedBy = "agent")
    private List<Compte> comptes;

    public Agent(String username, String email, String password, UserRole userRole) {
        super(username, email, password, userRole);
    }

}
