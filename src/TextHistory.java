import java.util.Scanner;

public class TextHistory {
  public static void main(String[] args) {

    System.out.println("\n*********************** TEST MEMENTO TEXTE *************\n");
    // Création de l'éditeur de texte
    Texte editeur = new Texte();

    // Ajout de texte
    System.out.println("Ajouter un texte :");
    Scanner scanner = new Scanner(System.in);
    String addedText = scanner.nextLine();
    editeur.ajouterTexte("première ligne :\n"+addedText+"\n");

    // Sauvegarde de l'état actuel du texte
    TextMemento  sauvegarde1 = editeur.sauvegarder();

    // Ajout de plus de texte
    System.out.println("Ajouter un autre texte :");
    Scanner scanner1 = new Scanner(System.in);
    String addedText1 = scanner1.nextLine();
    editeur.ajouterTexte("deuxième ligne.\n"+addedText1+"\n");

    // Affichage du texte actuel
    System.out.println("Texte actuel :\n" + editeur.obtenirtexte ());

    // Restauration de l'état précédent
    editeur.restaurer(sauvegarde1);

    // Affichage du texte restauré
    System.out.println("Texte restauré :\n" + editeur.obtenirtexte ());
  }





}
