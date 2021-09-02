package ru.lyuchkov.heroesofroutine.entities;


import org.springframework.data.annotation.Id;
import ru.lyuchkov.heroesofroutine.controllers.Guilds;

public class User {

    @Id
    private String id;
    private String name;
    private Guilds guild;
    private String email;
    private String password;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.guild = Guilds.VILLAGER;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Guilds getGuild() {
        return guild;
    }

    public void setGuild(Guilds guild) {
        this.guild = guild;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
