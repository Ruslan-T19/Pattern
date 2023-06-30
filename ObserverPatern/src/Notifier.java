
public interface Notifier {

	void addObserver(Observer observer);
	void deliteObserver(Observer observer);
	void notifyObserver();
}
