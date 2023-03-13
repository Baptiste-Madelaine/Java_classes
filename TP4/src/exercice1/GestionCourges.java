package exercice1;
import java.util.ArrayList;

public class GestionCourges {
	public ArrayList<Courge> oui = new ArrayList<>();
	
	public void enregistrer(Courge o) {
		if(!o.getVendu() && o.getSeme()) {
			oui.add(o);
		}
	}
	public String rechercheEspece(int e) {
		for(Courge c : oui) {
			if(c.getEmp()==e) {
				if( c instanceof Butternut) {
					return "Butternut";
				}
				else if( c instanceof Potiron){
					return "Potiron";
				}
			}
		}
		return null;
	}
	public void setPoidsEmp(int e) {
		
	}
}
