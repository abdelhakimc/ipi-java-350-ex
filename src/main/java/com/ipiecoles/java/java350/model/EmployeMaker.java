package com.ipiecoles.java.java350.model;

import java.time.LocalDate;

public class EmployeMaker {


    public EmployeBuilder technicienAPleinTemps(){
        return EmployeBuilder.anEmploye()
                .withMatricule("12345")
                .withNom("Alpha")
                .withPrenom("Beta")
                .withDateEmbauche(LocalDate.now())
                .withSalaire(Entreprise.SALAIRE_BASE)
                .withPerformance(Entreprise.PERFORMANCE_BASE)
                .withTempsPartiel(1.0);
    }
}
