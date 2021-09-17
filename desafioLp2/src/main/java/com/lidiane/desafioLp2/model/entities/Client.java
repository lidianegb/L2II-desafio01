package com.lidiane.desafioLp2.model.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class Client {

    @Id
    private String id;
    private String name;
    private String email;
    private String password;
    private Boolean enabled;

    public Client() {
        this.password = "xxxxx";
        this.enabled = true;
    }
}
