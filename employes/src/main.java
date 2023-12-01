public class main {
    public static void main(String[] args) {

        SocieteArrayList societe = new SocieteArrayList();

        Employe employe1 = new Employe(1, "Amine", "Messaoudi", "Informatique", 1);
        Employe employe2 = new Employe(2, "Mohamed", "Ben Ali", "Gestion", 2);
        Employe employe3 = new Employe(3, "Khadija", "Bouazizi", "Finance", 3);

        societe.ajouterEmploye(employe1);
        societe.ajouterEmploye(employe2);
        societe.ajouterEmploye(employe3);

        System.out.println("La liste des employés avant le tri :");
        societe.displayEmploye();

        societe.trierEmployeParNomDépartementEtGrade();

        System.out.println("La liste des employés après le tri :");
        societe.displayEmploye();

        System.out.println("L'existence de l'employé \"Mohamed\" : " + societe.rechercherEmploye("Mohamed"));
        System.out.println("L'existence de l'employé avec l'identifiant 2 : " + societe.rechercherEmploye("Amine"));
    }
}
