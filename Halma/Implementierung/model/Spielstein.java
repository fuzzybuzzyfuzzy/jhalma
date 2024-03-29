package model;
 
public class Spielstein{
	
	private Farbe farbe;
	private Position position; // Der erste Wert eines Objekts vom Typ Position ist immer der x-Wert, der zweite der y-Wert!
	
	public Spielstein(Position position, Farbe farbe){
		this.position = new Position(position.getX(), position.getY());
		this.farbe = farbe;
	}
	
	public Farbe getFarbe(){
		return farbe;
	}
	
	public Position getPosition(){
		return new Position(this.position.getX(), this.position.getY());
	}
	
	public void setFarbe(Farbe farbe){
		this.farbe = farbe;
	}
	
	public void setPosition(Position position){
		this.position = new Position(position.getX(), position.getY());
	}
}