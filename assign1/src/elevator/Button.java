package elevator;

public abstract class Button {
	Boolean onClick;
	Floor floor=new Floor();
	
	public Boolean getOnClick() {
		return onClick;
	}

	public void setOnClick(Boolean onClick) {
		this.onClick = onClick;
	}

}
