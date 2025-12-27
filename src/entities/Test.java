package entities;

import entities.*;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Lire la capacité
        System.out.print("Entrez la capacité de la bibliothèque : ");
        int n = sc.nextInt();
        sc.nextLine();

        Bibliotheque biblio = new Bibliotheque(n);

        // 2. Ajouter deux documents initiaux
        biblio.ajouter(new Livre("Programmation Java", "Jean Dupont", 320));
        biblio.ajouter(new Revue("Science & Tech", 3, 2024));

        int choix;

        do {
            System.out.println("\n===== MENU BIBLIOTHÈQUE =====");
            System.out.println("1 - Ajouter un document");
            System.out.println("2 - Afficher tous les documents");
            System.out.println("3 - Supprimer un document");
            System.out.println("4 - Rechercher un document par numéro");
            System.out.println("5 - Afficher les auteurs");
            System.out.println("0 - Quitter");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();
            sc.nextLine();

            switch (choix) {

                case 1:  // Ajouter
                    System.out.println("\nType de document à ajouter :");
                    System.out.println("1 - Livre");
                    System.out.println("2 - Roman");
                    System.out.println("3 - Manuel");
                    System.out.println("4 - Revue");
                    System.out.println("5 - Dictionnaire");
                    System.out.print("Choix : ");
                    int type = sc.nextInt();
                    sc.nextLine();

                    Document doc = null;

                    switch (type) {

                        case 1: // Livre
                            System.out.print("Titre : ");
                            String t1 = sc.nextLine();
                            System.out.print("Auteur : ");
                            String a1 = sc.nextLine();
                            System.out.print("Nombre de pages : ");
                            int p1 = sc.nextInt();
                            doc = new Livre(t1, a1, p1);
                            break;

                        case 2: // Roman
                            System.out.print("Titre : ");
                            String t2 = sc.nextLine();
                            System.out.print("Auteur : ");
                            String a2 = sc.nextLine();
                            System.out.print("Nombre de pages : ");
                            int p2 = sc.nextInt();
                            System.out.print("Prix : ");
                            double pr = sc.nextDouble();
                            doc = new Roman(t2, a2, p2, pr);
                            break;

                        case 3: // Manuel
                            System.out.print("Titre : ");
                            String t3 = sc.nextLine();
                            System.out.print("Auteur : ");
                            String a3 = sc.nextLine();
                            System.out.print("Nombre de pages : ");
                            int p3 = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Niveau : ");
                            String niv = sc.nextLine();
                            doc = new Manuel(t3, a3, p3, niv);
                            break;

                        case 4: // Revue
                            System.out.print("Titre : ");
                            String t4 = sc.nextLine();
                            System.out.print("Mois : ");
                            int m = sc.nextInt();
                            System.out.print("Année : ");
                            int an = sc.nextInt();
                            doc = new Revue(t4, m, an);
                            break;

                        case 5: // Dictionnaire
                            System.out.print("Titre : ");
                            String t5 = sc.nextLine();
                            System.out.print("Langue : ");
                            String lang = sc.nextLine();
                            doc = new Dictionnaire(t5, lang);
                            break;

                        default:
                            System.out.println("Type invalide !");
                    }

                    if (doc != null) {
                        if (biblio.ajouter(doc))
                            System.out.println("Document ajouté avec succès.");
                        else
                            System.out.println("La bibliothèque est pleine.");
                    }
                    break;

                case 2:  // Afficher
                    System.out.println("\n--- Liste des documents ---");
                    biblio.afficherDocuments();
                    break;

                case 3:  // Supprimer
                    System.out.print("Numéro du document à supprimer : ");
                    int numSup = sc.nextInt();
                    Document ds = biblio.document(numSup);

                    if (ds != null && biblio.supprimer(ds))
                        System.out.println("Document supprimé.");
                    else
                        System.out.println("Document introuvable !");
                    break;

                case 4:  // Rechercher
                    System.out.print("Numéro du document : ");
                    int num = sc.nextInt();
                    Document d = biblio.document(num);

                    if (d == null)
                        System.out.println("Aucun document trouvé !");
                    else
                        System.out.println(d);
                    break;

                case 5:  // Afficher auteurs
                    System.out.println("\n--- Liste des auteurs ---");
                    biblio.afficherAuteurs();
                    break;

                case 0:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide !");
            }

        } while (choix != 0);

        sc.close();
    }
}
