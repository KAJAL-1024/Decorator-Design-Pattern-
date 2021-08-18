class blue extends Stainer{
	blue(PaintShop ps){
		this.ps=ps;
	}
	public String base(){
		return ps.base()+" + Blue";
	}
	public int cost(){
		return ps.cost()+350;
	}
}