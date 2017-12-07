import java.util.Comparator;


public class Comparateur implements Comparator<Processus> {
	public int compare(Processus left, Processus right) {
        return left.duree.seconde-(right.duree.seconde);
    }
}

class ComparateurDateHeure implements Comparator<Processus> {
	public int compare(Processus left, Processus right) {
        return left.tempArrive.heure-(right.tempArrive.heure);
    }
}

class ComparateurDateMinute implements Comparator<Processus> {
	public int compare(Processus left, Processus right) {
        return left.tempArrive.minute-(right.tempArrive.minute);
    }
}

class ComparateurDureeMinute implements Comparator<Processus> {
	public int compare(Processus left, Processus right) {
        return left.tempArrive.minute-(right.tempArrive.minute);
    }
}

class ComparateurDureeSeconde implements Comparator<Processus> {
	public int compare(Processus left, Processus right) {
        return left.tempArrive.minute-(right.tempArrive.minute);
    }
}
