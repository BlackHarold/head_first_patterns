package home.bluewhale.observer.subject;

import home.bluewhale.observer.Observer;

public interface Subject {
   public void registerObserver(Observer observer);
   public void removeObserver(Observer observer);
   public void notifyObserver();
}
