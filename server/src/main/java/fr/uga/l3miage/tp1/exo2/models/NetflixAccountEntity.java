package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.TypeAccount;

import javax.persistence.*;

@Entity
@Table(name="netflix_account")
public class NetflixAccountEntity {

    @Id
    private Long id;

    int nb_devices;

    @Enumerated(EnumType.STRING)
    private TypeAccount typeAccount;

    @Column(name="FK")
    private String uuid_user;

    @OneToOne
    private NetflixUserEntity user;
}
