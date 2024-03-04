1. Décrivez ce que vous observez en base de données lorsque l'on déclare une classe comme ClassTestJPA ?<br>
Une table du même nom est créée.


2. Quels sont les effets des propriétés ajoutées dans les @Column dans la classe ClassTestJPATwo ?<br>
Elles modifient les colonnes des tables associées aux champs. Par exemple elles permettent de renommer une colonne, spécifier la précision pour un nombre flottant ou spécifier l'unicité des valeurs.


3. À votre avis, dans quels cas est-il nécessaire de mettre les annotations @Column ?<br>
Elles sont nécessaires quand le code java ne suffit pas à spécifier les contraintes.