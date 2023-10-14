public class Texte {

    private String texte;

    public Texte() {
      texte = "";
    }

    public void ajouterTexte(String text) {
      texte += text;
    }

    public String obtenirtexte() {
      return texte;
    }

    // Créer un TextMemento pour sauvegarder l'état actuel du texte
    public TextMemento sauvegarder() {
      return new TextMemento(texte);
    }

    // Restaurer l'état précédent du texte à partir d'un TextMemento
    public void restaurer(TextMemento TextMemento) {
      texte = TextMemento.gettexte();
    }
  

}
