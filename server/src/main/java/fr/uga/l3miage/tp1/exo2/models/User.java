package fr.uga.l3miage.tp1.exo2.models;

import java.time.OffsetDateTime;

import javax.persistence.*;

@Entity
@Table
public class User {

    @Id
    Long idUser;

    boolean SSO;

    OffsetDateTime lastConnexion;

    @OneToOne()
    Session session;
}
