package home.bluewhale.observer.subject;

public interface Subject {
   public void registerObserver(Observer observer);
   public void removeObserver(Observer observer);
   public void notifyObserver();
}
