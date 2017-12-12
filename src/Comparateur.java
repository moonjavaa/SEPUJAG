import java.util.Comparator;

//
//public class Comparateur implements Comparator<Processus> {
//	public int compare(Processus left, Processus right) {
//        return left.duree.seconde-(right.duree.seconde);
//    }
//}

class ComparateurHeure implements Comparator<Processus> {
	public int compare(Processus left, Processus right) {
        return left.tempArrive.compareTo(right.tempArrive);
    }
}

class ComparateurDureeEtTemps implements Comparator<Processus> {
	public int compare(Processus left, Processus right) {
        return (left.duree.compareTo(right.duree))+(left.tempArrive.compareTo(right.tempArrive));
    }
}

//class ComparateurDureeMinute implements Comparator<Processus> {
//	public int compare(Processus left, Processus right) {
//        return left.tempArrive.minute-(right.tempArrive.minute);
//    }
//}
//
//class ComparateurDureeSeconde implements Comparator<Processus> {
//	public int compare(Processus left, Processus right) {
//        return left.tempArrive.minute-(right.tempArrive.minute);
//    }
//}
