package fr.uga.l3miage.tp1.exo2.models;

import java.util.UUID;

import javax.persistence.*;

@Entity
@Table
public class Session {

    @Id
    UUID idSession;

    String lastCommand;

    String currentDir;

    boolean lock;

    @OneToOne(mappedBy = "session")
    User user;
}
