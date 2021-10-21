package learn;

public class Emploee implements Comparable<Emploee>{

private int id;
private String name;
public Emploee(int id, String name){
this.id = id;
this.name = name;
}
//setter
//getter
@Override
public int compareTo(Emploee o) {
	// TODO Auto-generated method stub
	return 0;
}
}