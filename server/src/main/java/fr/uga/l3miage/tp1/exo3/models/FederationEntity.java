package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class FederationEntity {

    @Id
    String name;

    boolean isFageMembership;

    @ManyToOne
    @JoinColumn(foreignKey=@ForeignKey(name = "Fk_federation_association"))
    AssociationEntity association;

    @OneToMany(mappedBy = "federation")
    Set<AssociationEntity> associations;
}
