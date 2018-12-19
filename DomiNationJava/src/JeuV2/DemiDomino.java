package JeuV2;
import java.util.*;

public class DemiDomino {
	private String type;
	private int couronnes;
	
	
	public DemiDomino(int couronnes,String type) {
		this.type = type;
		this.couronnes = couronnes;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getCouronnes() {
		return couronnes;
	}


	public void setCouronnes(int couronnes) {
		this.couronnes = couronnes;
	}
	

}
